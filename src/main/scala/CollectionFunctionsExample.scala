object CollectionFunctionsExample extends App{

  //Collect Function

  val donutNamesandPrices: Seq[Any] = Seq("Plain Donut", 1.5, "Strawberry Donut", 2.0, "Glazed Donut", 2.5)
  val donutNames: Seq[String] = donutNamesandPrices.collect{case name:String => name}
  println(donutNames.mkString(","))


  val empList:List[employee] = List(new employee("jaga",12212),
    new employee("alam",2232),new employee("amar",98768))

  val totalSal:Double=0;
  val employeeName:Seq[Double] = empList.collect{case emp:employee => emp.sal}
  employeeName.foreach( sal => totalSal+sal)
  println(s"Salary of All Employees ${totalSal}")

  //Diff Function Example , it will be applicable for all collections
  val set1:List[String] = List("dddd","eeee","aaaa")
  val set2:List[String] = List("rrrr","eeee","pppp")

  println(s"deifference of two sets are ${set2 diff set1}")



  //Drop example , it is applicable for both Mutable and immutable collection

  var setDrop:scala.collection.mutable.Map[Int,Int] = scala.collection.mutable.Map(1->1,2->2,3->3,4->4)
  println(setDrop.drop(2))
  println(setDrop)

  //Drop While Practice , it is applicable for both Mutable and immutable collection
  //Declaration
  // def dropWhile(p: (A) ⇒ Boolean): Repr

  var listDoWhil = List("Jagadeesh","Ramesh","sureshZ")

  println(listDoWhil.dropWhile(_.charAt(0)=='J'))


  val dropElementPredicate: (String)=>Boolean  = (listDoWhil) => listDoWhil.charAt(0)=='P'

  //Exist Practice
  //Declaration
  // def exists(p: (A) ⇒ Boolean): Boolean
  println(listDoWhil.exists(name=>name=="Jagadeesh"))


  /*
      Filter and FilterNot Practice
      Decalration
      def filter(p: (A) ⇒ Boolean): Repr
      def filterNot(p: (A) ⇒ Boolean): Repr
   */

  val filterAndNot = List("jagadeesh M","harish","rajesh","nandish")

  println(filterAndNot.filter(name=>name.contains("M")))

  println(filterAndNot.filterNot(name=>name=="jagadeesh"))

  /*
      Find function
      def find(p: (A) ⇒ Boolean): Option[A]

      In this case if the element is not available in collection it throw an NoSuchElementException,
      to avoid this exception we can use options feature of getOrElse

   */

  println(filterAndNot.find(name=>name=="kkkkk").getOrElse("Field not found in the List"))

  /*

    FlatMap Declaration
    def flatMap[B](f: (A) ⇒ GenTraversableOnce[B]): TraversableOnce[B]

    Using FlatMap we can merge List[Seq[String]] into List[String]
    example is below
   */

  val l1: List[List[String]] = List(List("ss","dd","ff"),List("ee","rr","tt"))
  println(l1.flatMap(list=>list))


  /*

    flatten Declaration
    def flatten[B]: Traversable[B]
     flatten is also performing the operation like flatMap but in the flatten we can do some modification as will in the list
     like variable content changes
   */

  println(l1.flatten)
  println(l1.flatten.map(a=> if(a=="ss") a +" M"))
  println(l1.flatten.map("M "+_))


  /*
    fold,foldLeft,foldRight



   */

  val prices: Seq[Double] = Seq(1.5, 2.0, 2.5)
  println(prices.fold(0.0)(_+_))

  val surnames: Seq[String] = Seq("jagadeesh","JayaPrakash","Jyothsna")
  println(surnames.fold("")((name,s) => name+s+ " Mannem "))
  println(surnames.foldLeft("")((a,b) =>" Mannem "+ a + b))
  println(surnames.foldRight("")((a,b) => a +" Mannem " + b))

  //foreach Practice
  surnames.foreach(name=>print(name))

  //groupBy
  val donuts: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut")

  val groupByEx : Map[Char,Seq[String]] = donuts.groupBy(_.charAt(0))
  println(groupByEx)


  val salEmp: Map[Double,List[employee]] = empList.groupBy(_.sal)
  println(salEmp)

  //Head example, it will print the first value in the collection variable
  println(surnames.head)


  //isEmpty function is used to check the collection variable is empty or not
  println(surnames.isEmpty)

  //intersect function
  //The intersect method will find the common elements between two Sets.
  // set1 intersect set2 or set1 & set2

  //last function
  //The last method will return the last element in a collection.
  println(surnames.last)
  println(surnames.lastOption.getOrElse("Not Found"))

  //map example
  surnames.map(_+" nammem ")


  //max and min functions

  val maxMinList = List(1,2,3,4,5,6,7,7);
  println(maxMinList.min)
  println(maxMinList.max)
  val maxMinList1 = List("jaga","Rajesh","harish")
  println(maxMinList1.max)
  println(maxMinList1.min)

  val donuts1: Seq[Donut] = Seq(Donut("Plain Donut", 1.5), Donut("Strawberry Donut", 2.0), Donut("Glazed Donut", 2.5))


  println(s"Max price of the Donut is ${donuts1.maxBy(p=>p.price).name}")




  //Practice
  val listOfObj = List(1,"2222","sdsds",'c',10.11)
  val listOfObj1= List(1,"2222","sdsds",'c',10.11,"eeee")

  println(listOfObj1 diff listOfObj)
  println(listOfObj1.drop(2))

  listOfObj.collect{case type1:String=>println(s"$type1 is Type of String!!!!")}

  println(listOfObj1.dropWhile(_.equals(1)));
  println(listOfObj1.exists(name=>name=='c'))

  println(listOfObj1.filter(name => name=="2222"))
  println(listOfObj1.filterNot(name=>name==1))
  println(listOfObj1.find(n=>n.equals(10.11)))

  val listMrg:List[List[String]] = List(List("dsdsds","dsdsdsdsds"))
  println(listMrg.flatMap(list => list ))
  println(listMrg.flatten)

  val stringList = List("aaaa","bbbb","cccc","dddd")
  stringList.fold("")((a,b) => a+b+"zz")


}

case class employee(name:String,sal:Double)
case class Donut(name: String, price: Double)