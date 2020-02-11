import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object ArrayBufferExamples extends App{

  val arrBuffer = new ArrayBuffer[String]()
  arrBuffer += "sassa"
  arrBuffer += "ssfsf"

  // add two or more elements
  arrBuffer += ("gfg", "chandan")

  // adding one or more element using append method
  arrBuffer.append("S-series", "Ritesh")

  println(arrBuffer(1))
  println(arrBuffer)


  // deletes one element
  arrBuffer -= "gfg"

  // deletes two or more elements
  arrBuffer -= ("Ritesh", "chandan")

  //remove the elements based on position
  arrBuffer.remove(0)
  //arrBuffer.remove(0,1,2  )

  println(arrBuffer)

  import scala.collection.mutable.ArrayStack
  //ArrayStack Practice
  val arrayStack: ArrayStack[String] = ArrayStack("jaga","eded", "rrrr", "tttt");

  //add a element
  arrayStack+=("dfdf","popo")

  //Add List Of Values to the ArrayStack
  arrayStack ++= List[String]("lll","kkkk")
  println(arrayStack)
  println(arrayStack.pop())
  println(arrayStack.push("edrf"))



}
