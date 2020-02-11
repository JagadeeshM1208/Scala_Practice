object ClassAndObjectPrct extends App{

  //companion Object declaration, companion has a apply method to define

  val d1= Donuts("red",10)

  val d2= Donuts("chacolte",20);
  d2.print
  d1.print

  case class DonutCaseClass(name:String,donutPrice:Int)

  val caseObj = DonutCaseClass("jagadeesh",1000)
  println(caseObj.name)

  //Type Aliasing
  val vanillaDonut: DonutCaseClass = DonutCaseClass("Vanilla", 18)
  val glazedDonut: DonutCaseClass = DonutCaseClass("Glazed", 20)
  type CartItem[DonutCaseClass,Int] = Tuple2[DonutCaseClass,Int]
  val cartItem = new CartItem(vanillaDonut, 4)

  println(s"cartItem = $cartItem")
  println(s"cartItem first value = ${cartItem._1}")
  println(s"cartItem second value = ${cartItem._2}")


  def calculateTotal(shoppingCartItems: Seq[CartItem[DonutCaseClass, Int]]): Double = {
    // calculate the total cost
    shoppingCartItems.foreach { cartItem =>
      println(s"CartItem donut = ${cartItem._1}, quantity = ${cartItem._2}")
    }
    10 // some random total cost
  }


  //Higher Order Functions
  def sum(f:Int=>Int,a:Int,b:Int) = {
    def loop(a:Int,acc:Int) :Int ={
      if(a>b) acc
      else loop(a+1,f(a)+acc)
      loop(a,0)
    }
  }
  sum(x=>x*x,3,5)

  def addition(f: (Int, Int) => Int,a: Int, b:Int): Int = f(a,b)

  val squareSum = (x: Int, y: Int) => (x*x + y*y)

  val normalSum = (x: Int, y: Int) => (x+y)

  val squaredSum = addition(normalSum, 1, 2)

  println(s"HIGHER ORDER FUNCTION RETURN VALUE===== $squaredSum")

}


