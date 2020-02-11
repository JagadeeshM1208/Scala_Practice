object ClassesAndObjects {

  //def apply(id:Long,name:String,sal:Double): NormalClass = new NormalClass(id,name,sal);
  def main(args: Array[String]): Unit = {
    val normalClass= new NormalClass(101,"jaadeesh",10000.0)
    normalClass.printEmpDetaild()
    val caseClassEx = CaseClassEx(101,"jaadeesh",10000.0)
    caseClassEx.printEmpDetaild()

    //Type Class Mock
    val car = new Car("vento","2019")
    val car1:Vehicle[Car]=new TypedClassExample[Car]()
    car1.printTheVehicleDetails(car);

    val bike = new Bike("Pulsar","2020")
    val bike1:Vehicle[Bike] = new TypedClassExample[Bike]
    bike1.printTheVehicleDetails(bike)

  }
}

class NormalClass(id:Long,name:String,sal:Double){

  def printEmpDetaild(): Unit ={
    println(s"Emp Id = $id , Name is =$name and Salary=$sal")
  }
}

case class CaseClassEx(id:Long,name:String,sal:Double) {
  def printEmpDetaild(): Unit ={
    println(s"Emp Id = $id , Name is =$name and Salary=$sal")
  }
}

//TypeClass Examples

class TypedClassExample[A] extends Vehicle[A] {

  override def printTheVehicleDetails(aRef:A)={
    println(s" Class Details == ${aRef.toString}")
  }
}

trait Vehicle[A]{
  def printTheVehicleDetails(aRef:A)
}

class Car(name:String,model:String)

class Bike(name:String,model:String)