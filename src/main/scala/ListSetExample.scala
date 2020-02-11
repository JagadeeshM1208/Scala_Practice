import scala.collection.immutable.ListSet

object ListSetExample extends App{

  /* ListSet class implements
     immutable sets using a list-based data structure.
     Elements are stored in reversed insertion order
     It will not allow duplicate like Set */

  val listSet1:ListSet[String] = ListSet("aaa","aaa","sas","sts")
  println(listSet1)

  //check elements of immutable ListSet

  println(s"Element existing in ListSet == ${listSet1("aaa")}")

  //add elements of immutable ListSet using +

  val listSet2:ListSet[String] = listSet1 +"jjj";

  println(listSet2)

  //add two ListSet
  val listSet3:ListSet[String] = listSet1++listSet2;
  println("append Two ListSets=="+listSet3)

  //remove element from the ListSet using -
  val listSet4:ListSet[String] = listSet3-"jjj"
  println(listSet4)

  val emptyListSet: ListSet[String] = ListSet.empty[String]
}
