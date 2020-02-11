object Donuts {

  def apply(name:String,price:Int): Donuts = {
    new Donuts(name,price);
  }
}

class Donuts(name: String, productCode: Long){

  def print = println(s"Donut name = $name, productCode = $productCode")

}


