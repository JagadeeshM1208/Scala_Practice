import scala.collection.mutable.ListBuffer

object ListBufferPractice extends App{

  val listBuff:ListBuffer[String] = ListBuffer("uuu","oooo");
  listBuff +=("rrrrr","lllll")
  println(listBuff)
  listBuff ++=List[String]("rerer","rereer","rtrtrt")
  println(listBuff)
  listBuff -="rrrrr"
  println(listBuff)

  val lisBuff1:ListBuffer[String] = ListBuffer.empty
  println(lisBuff1)

}
