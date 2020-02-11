object PracticeScala extends App{
  var x:String="jagadeesh M"
  lazy val y=10;
  var z:String=_

  println(s"String iterpolation variable $x")

  case class Donut(name:String,price:Int)

  val donutdecl:Donut= Donut("khaju",10)
  println(s"printing the donut details ${donutdecl.name} , ${donutdecl.price}")


  println(s"expression check ${donutdecl.price==10}")

  //multi line String declaration
  val jsonString:String="{\"donut_name\":\"khaju\",\"taste\":\"super\",\"price\":10}"

  val jsonStr:String=
    """
      |"donut_name":"dryfruit",
      |"taste":"very tasty",
      |"price":20
    """.stripMargin

  //Type Inferences
  val a=1;
  val b="String";
  val c=10.2f
  val d=10.20
  val e=1000000000000L
  val f='c'


  //if - else as expression
  val donutPrice=14
  /*if(donutPrice>20)
    println(s"price of donut is $donutPrice")
  else
    println(s"price of donut is $donutPrice")*/

  val ifElseExpress=if(donutPrice>20) println(s"price of donut is $donutPrice") else println(s"price of donut is $donutPrice")
  println(ifElseExpress)

  //for comprehension

  for(i<- 1 to 10){
    println(i);
  }

  val listOfVal:List[String]=List("name","price","tastey");

  val forloopExp = for{values <- listOfVal if(values=="price")}yield values;
  println(forloopExp)


  //pattern Match
  val donutTaste="plaindonut";
   val checkPattenMatch = donutTaste match {
     case "glazzeddonut" => "very tasty"
     case "plaindonut" => "ok ok"
     case _ => "no Taste"
   }
  println(checkPattenMatch);


  //Tuples
  val glazedDonut= ("GlazedDonut","good",10);
  val strawberryDonut = ("StrawberryDonut","toGood",20)
  val plainDonut =("PlainDonut","ok ok",5)
  val donutList = List(glazedDonut, strawberryDonut, plainDonut)

  val priceOfPlainDonut = donutList.foreach(tuple=>tuple match{
    case ("PlainDonut",taste,price) => println(s"donut type is plain donut and price =$price")
    case d if(d._1=="StrawberryDonut") => print(s"donut details are $d._1 , $d._2 , $d._3 ")
    case _=>println("empty Donut")
  })

  def samplFun(): Unit ={
    println("Sample Void function");
  }

  //function with parameters

  def functionWithParam(name:String,price:Int): Unit={
    println(s"deatils are $name, ${price}")
  }

  //assigning default value

  def assignDefaultVal(name:String="sampleName",price:Int) : Unit ={
    println(s"deatils are $name, ${price}")
  }


  //Function with Option return type

  def dailyCouponCode(): Option[String] = {
    // look up in database if we will provide our customers with a coupon today
    val couponFromDb = "COUPON_1234"
    Option(couponFromDb).filter(_.nonEmpty)
  }
  val todayCoupon: Option[String] = dailyCouponCode()
  println(s"option vakue is ${todayCoupon.getOrElse("no coupun Found Today!!!!")}")


  //Typed Function Declaration

  def typedFunctionDecl[T](disc:T){
    disc match{
      case d:String =>
        println(s"passed param type is $d")
      case d: Int =>
        println(s"passed parameter Type is $d")
      case _ =>
        println(s"unkown Type Parameter")
    }
  }
  typedFunctionDecl[String]("stringType");
  typedFunctionDecl[Double](10.11);


  val donuts22  = List(("maths", 80),("science", 90));
  //println(s"All donuts = ${donuts22.fold("123")((acc, s) => acc + s + " Donut ")}")

  val additionalMarks = ("extra", 4)
  val sum = donuts22.fold(additionalMarks){ (acc, marks) => val add = acc._2 + marks._2
    ("total", add)
  }
  println(sum)

}
