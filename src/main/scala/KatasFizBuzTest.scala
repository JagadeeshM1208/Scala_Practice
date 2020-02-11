object KatasFizBuzTest extends App{

  def fizBuz(num:Int):String={ num match{
    case d if(d%3==0) => "fizz"
    case d if(d%5==0) => "buzz"
    case _ => num.toString
  }
    /*if(num%3==0){
      "fizz"
    } else if (num%5==0){
      "buzz"
    } else if( num%15==0){
      "fizzbuzz"
    } else {
      num.toString
    }*/
  }


  println(s"Result for the Given Number== ${fizBuz(5)}")


  //Second Example
  def convertToBerlinTime(time: String) = {
    val parts = time.split(":").map(_.toInt)
    Array(
      seconds(parts(2)),
      topHours(parts(0)),
      bottomHours(parts(0)),
      topMinutes(parts(1)),
      bottomMinutes(parts(1)))
  }

  def seconds(number: Int) = {
    if (number % 2 == 0) "Y" else "O"
  }

  def topHours(number: Int) = onOff(4, topNumberOfOnSigns(number))

  def bottomHours(number: Int) = onOff(4, number % 5)

  def topMinutes(number: Int) = onOff(11, topNumberOfOnSigns(number), "Y").replaceAll("YYY", "YYR")

  def bottomMinutes(number: Int) = onOff(4, number % 5, "Y")

  private def onOff(lamps: Int, onSigns: Int, onSign: String = "R") = {
    onSign * onSigns + "O" * (lamps - onSigns)
  }

  private def topNumberOfOnSigns(number: Int) = (number - (number % 5)) / 5


  //Third One PrimeFactor
  def primeFactors(number: Int, list: List[Int] = List()): List[Int] = {
    for(n <- 2 to number if (number % n == 0)) {
      return primeFactors(number / n, list :+ n)
    }
    list
  }
  println(s"PrimeFactors of given Number is == ${primeFactors(333)}")

}
