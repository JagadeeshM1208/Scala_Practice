import scala.collection.immutable.{HashMap, HashSet, ListMap, ListSet, Queue, Seq, TreeMap, TreeSet}

object MutableAndImmutableCollectionsEx extends Ordering[String]{

  def main(args: Array[String]): Unit = {
    val immutableObj = new PerformImmutableOperations();

  }

  def compare(x: String, y: String) = x.compareTo(x)
}

class PerformImmutableOperations{

  //List Operations

  val list1:List[Int] = List(1,2,3,4,5);
  println(list1)

  //Add a value to List at end
  val list2:List[Int] = list1:+6
  println(list2)

  //add a value to the list at beginning
  val list5:List[Int] = 0+:list2
  println(list5)

  //remove one element from list
  val list3:List[Int] = List(7,8)

  //add two Lists
  val list4:List[Int] = list2++list3
  println(list4)



  //ListSet Operations
  val listSet:ListSet[String] = ListSet("ss","dd","ff","gg","ss")
  println(listSet)

  val listSet1:ListSet[String] = listSet+"eee"
  println(listSet1)

  val listSet2:ListSet[String] = ListSet("www","rrr")
  val listSet3:ListSet[String] = listSet1++listSet2
  println(listSet3)
  val listSt4:ListSet[String] = listSet3-"eee"
  println(listSt4)


  //ListMap Examples

  val listMap:ListMap[Int,Int] = ListMap(1->1,2->2,3->3)
  println(listMap)
  val listMap1:ListMap[Int,Int] = listMap+(4->4,5->5)
  println(listMap1)
  val listMap2:ListMap[Int,Int] = ListMap(6->6,7->7)
  println(listMap2)
  val listMap3:ListMap[Int,Int]= listMap1++listMap2
  println(listMap3)
  val listMap4:ListMap[Int,Int] = listMap1-(4,5)
  println(listMap4)

  //Map Examples

  val map:Map[Int,String] = Map(1->"aa",2->"bb")
  println(map)
  val map1:Map[Int,String] = map+(3->"cc",4->"dd")
  println(map1)
  val map2:Map[Int,String] = Map(5->"ee",6->"ff")
  println(map2)
  val map3:Map[Int,String] = map1++map2
  println(map3)
  val map4:Map[Int,String] = map3-(1)
  println(map4)

  //HashMap Examples

  val hashmap:HashMap[Int,String] = HashMap(1->"vv",2->"bb")
  println(hashmap)
  val hashmap1:HashMap[Int,String] = hashmap+(3->"nn",4->"rr")
  println(hashmap1)
  val hashmap2:HashMap[Int,String] = HashMap(5->"aa",6->"ww")
  println(hashmap2)
  val hashmap3:HashMap[Int,String] = hashmap1++hashmap2
  println(hashmap3)
  val hashmap4:HashMap[Int,String] = hashmap3-(1)
  println(hashmap4)





  // TreeMap Examples keep the data in ascending order

  val treeMap:TreeMap[Int,String] = TreeMap(1->"vv",2->"bb")
  println(treeMap)
  val treeMap1:TreeMap[Int,String] = treeMap+(3->"nn",4->"rr")
  println(treeMap1)
  val treeMap2:TreeMap[Int,String] = TreeMap(5->"aa",6->"ww")
  println(treeMap2)
  val treeMap3:TreeMap[Int,String] = treeMap1++treeMap2
  println(treeMap3)
  val treeMap4:TreeMap[Int,String] = treeMap3-(1)
  println(treeMap4)

  //make treemap descending order
  object AlphabetOrdering extends Ordering[String] {
    def compare(key1:String, key2:String) = key2.compareTo(key1)
  }
  val treeMap6: TreeMap[String, String] = TreeMap(("PD","Plain Donut"),("SD","Strawberry Donut"),("CD","Chocolate Donut"))(AlphabetOrdering)
  println(s"Elements of treeMap6 in descending order = $treeMap6")


  //Queue Examples
  /*
    Queue implements a data structure that allows
    inserting and retrieving elements in a first-in-first-out (FIFO) manner
   */

  val queue:Queue[String]=Queue("ww","ll")
  val queue1:Queue[String] = queue:+ "dd"
  println(queue1)

  println(queue1(1))



  //Sequence  perform all the operations like List only

  /*
    access the sequence elements by using their indexes
    we have reverse method for this sequence

   */

  val se1:Seq[Any]=Seq(1,"String",'c')
  println(se1)
  println(se1 :+ 1)
  val se2:Seq[String] = Seq("jaga")
  println(se1++se2)
  println(s"Element at index 0 = ${se1(0)}")



  //TreeSet will store non repeatable values and in sequence manner

  val treeSet: TreeSet[String] = TreeSet("AAA","sss");
  println(treeSet+"eee")
  println(treeSet++TreeSet("rrrrr"))
  println(treeSet-"sss")
  println(treeSet("AAA"))


  val set:Set[Int] = Set(1,2,3,4)
  println(set)
  println(set+5)
  println(set++Set("1,2,3"))
  println(set-1)
  println(Set.empty)

  val set1:Set[Int] = Set(1,6,7,8)


  println(set & set1)
  println(set &~ set1)

  //HashSet Examples

  val hashSet:HashSet[Char] = HashSet('s','d','f')
  println(hashSet)
  println(hashSet+'e')
  println(hashSet-'d')
  println(hashSet++HashSet('w','t'))
  println(HashSet.empty)

  val hashSet1:HashSet[Char] = HashSet('s','d','f','l','m')
  println(hashSet & hashSet1)
  println(hashSet &~ hashSet1)



  //TreeSet all Operations looks Like same as HashSet and one extra feature we have like Ordering

  val orderd:TreeSet[String] = TreeSet("aaaa","www","lll","ppp")(MutableAndImmutableCollectionsEx);
  println(orderd)


  //SortedSet Works look like same as Set and extra feature in this is Ordering like TreeSet

  //BitSet







}