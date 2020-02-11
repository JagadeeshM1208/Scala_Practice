

import scala.collection.immutable._
object MapPractice extends App{

  val map1:Map[String,Int] = Map("eee"->2,"rrr"->4);
  println(map1)

  //initialize a Map with 3 elements using Tuples of key and value
  val map2: Map[String, String] = Map(("PD","Plain Donut"),("SD","Strawberry Donut"),("CD","Chocolate Donut"))
  println(s"Elements of map1 = $map2")

//access elements by specific key
  val map3: Map[String, String] = Map("VD"-> "Vanilla Donut", "GD" -> "Glazed Donut")
  println(s"Element by key VD = ${map3("VD")}")
  println(s"Element by key GD = ${map3("GD")}")

  val map4: Map[String, String] = map3 + ("KD" -> "Krispy Kreme Donut")
  println(map4)

  val map5: Map[String, String] = map3 ++ map4
  println(s"Elements in map4 = $map5")


  //HashMap Also having same kind of operations like Map no much diference
  println("\nStep 2: How to initialize HashMap using key -> value notation")
  val hashMap2: HashMap[String, String] = HashMap("VD"-> "Vanilla Donut", "GD" -> "Glazed Donut")
  println(s"Elements of hashMap2 = $hashMap2")


  //TreeMap is sorted  by default using key values
  //TreeMap will perform all operations like adding, remove,search like map only
  println("\nStep 2: How to initialize TreeMap using key -> value notation")
  val treeMap2: TreeMap[String, String] = TreeMap("VD"-> "Vanilla Donut", "GD" -> "Glazed Donut")
  println(s"Elements of treeMap2 = $treeMap2")

  //change ordering of TreeMap to descending alphabet
  val treeMap6: TreeMap[String, String] = TreeMap(("PD","Plain Donut"),("SD","Strawberry Donut"),("CD","Chocolate Donut"))(TreeMapPractice)
  println(s"Elements of treeMap6 in descending order = $treeMap6")


  //Mutable Map Practice

  val mutableMap: scala.collection.mutable.Map[Int,String] = scala.collection.mutable.Map(1->"eeeee")
  mutableMap +=2->"3232"
  mutableMap +=(3->"kkkk",4->"erer")
  println(mutableMap)
  mutableMap -=2
  println(mutableMap)

  val emptyMap: scala.collection.mutable.Map[String,String] = scala.collection.mutable.Map.empty[String,String]




}
