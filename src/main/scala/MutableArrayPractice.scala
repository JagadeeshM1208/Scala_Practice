object MutableArrayPractice extends App {
  //var arrayname = new Array[datatype](size)


  val arr: Array[Int] = Array(1,2,3,4)
  println(arr.mkString(","))

  val arr1:Array[String] = new Array(5)
  arr1(0) = "jaga";arr1(2)="amar";arr1(1)="sss"
  println(arr1.mkString(","))

  //twoDimention Array

  val twoDimentionArray:Array[Array[String]] = Array.ofDim[String](2,2);
  twoDimentionArray(0)(0) = "jaja"
  twoDimentionArray(0)(1) = "ddff"
  twoDimentionArray(1)(0) = "erer"
  twoDimentionArray(1)(1) = "edsds"

  println(twoDimentionArray.toList)

  //concatinate Two Arrays
  import Array._
  var array1 = Array(1, 2, 3, 4)
  var array2 = Array(5, 6, 7, 8)

  var array3 = concat( array1, array2)

  // Print all the array elements
  for ( x <- array3 )
  {
    println( x )
  }
}
