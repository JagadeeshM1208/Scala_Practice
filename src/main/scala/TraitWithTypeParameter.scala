object TraitWithTypeParameter extends App{

  val donutShoppingCartDao1:DonutShoppingCartDao1[String] = new DonutShoppingCart1[String]();
  donutShoppingCartDao1.add("venilla Donut")
  donutShoppingCartDao1.search("venilla Donut")
  donutShoppingCartDao1.update("venilla Donut")
  donutShoppingCartDao1.delete("venilla Donut")
  val donutShoppingCartDao2:DonutInventoryService[String] = new DonutShoppingCart1[String]();
  donutShoppingCartDao2.checkStockQuantity("venillaDonut")

  println("Employee Hike Amount Is =="+ calculateEmployeeHike(101))

  def calculateEmployeeHike(empId:Int):Double={
    var sal:Map[Int,Double]=Map(101->10000,102->12000,103->13000);
    var hikePercentage:Map[Int,Double]=Map(101->5,102->6,103->8)
    println(s"$empId Employee Salary is ==="+sal(empId));
    hikePercentageCal(sal.apply(empId),hikePercentage.apply(empId))
  }

  def hikePercentageCal(salary:Double,hikePerc:Double): Double ={
    (salary)*(hikePerc/100)
  }

  // table example
  val tablePrint = (tblNum:Int) => for(i<- 1 to 10) println(s"$tblNum * "+i+"="+(tblNum*i))
  def prointTheTables(tblNum:Int): Unit ={
    for(i<- 1 to 10)
      println(s"$tblNum * "+i+"="+(tblNum*i))
  }
  prointTheTables(5)
  println(tablePrint(3))

  val returnAnonumusFun = (y:Int,x:Int) =>  (y*x)
  println(returnAnonumusFun(5,5))


}

trait DonutShoppingCartDao1[A] {

  def add(donutName: A): Long

  def update(donutName: A): Boolean

  def search(donutName: A): A

  def delete(donutName: A): Boolean

}

trait DonutInventoryService[A] {

  def checkStockQuantity(donut: A): Int

}

class DonutShoppingCart1[A] extends DonutShoppingCartDao1[A] with DonutInventoryService[A] {

  override def add(donutName: A): Long = {
    println(s"add the donut to the cart donut name is $donutName")
    1
  }

  override def search(donutName: A): A = {
    println(s"Donuts are searching with the name $donutName")
    donutName
  }

  override def update(donutName: A): Boolean = {
    println(s"Updating the Donut with respect to the name $donutName")
    true
  }

  override def delete(donutName: A): Boolean = {
    println(s"Deleting the donut of $donutName")
    true
  }

  override def checkStockQuantity(donut: A): Int = {
    println(s"stock of the Dounts are $donut")
    1
  }


}
