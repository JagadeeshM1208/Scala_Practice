import scala.collection.immutable.ListMap

object ListMapExample extends App {

  val listmap1:ListMap[String,Int] = ListMap("aaa"->1,"ddd"->2,"fff"->3)
  println(listmap1)

  val listMap2:ListMap[String,Int] = listmap1+("ccc"->3)
  println(listMap2)

  val listMap3:ListMap[String,Int] = listMap2-("ccc")
  println(listMap3)

  //Empty ListMap
  val listMap4:ListMap[String,Int] = ListMap()


}
