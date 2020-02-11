object ImmutableListEx extends App{

  val list1:List[String] = List("abc","bca","cab")
  val list2:List[String] = list1:+"ssss"
  println(s"List having the values like $list1")
  println(s"Index Of 0== ${list1(0)}")
  println(s"Index Of 1== ${list1(1)}")
  println(s"Index Of 2== ${list1(2)}")

  println(s"Appending a new value to the New List $list2")

  //prepend the elements to List

  val list3:List[String] = "dddd"+:list2
  println(s"Prepend a new value to the New List $list3")

  //add two immutable list togeather

  val list4:List[String] = list2 ++ list3

  println(s"adding two immutable Lists $list4")

  //Initialize the Empty Immutable List
  val list5:List[String] = List.empty[String]


  //val removeVal:List[String] = "dddd"-:list4


}
