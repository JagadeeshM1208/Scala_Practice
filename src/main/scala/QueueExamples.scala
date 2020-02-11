import scala.collection.immutable.Stream.cons

object QueueExamples extends App{
  import scala.collection.immutable._
  println("Step 1: How to initialize a Queue with 3 elements")
  val queue1: Queue[String] = Queue("Plain Donut", "Strawberry Donut", "Chocolate Donut")
  println(s"Elements of queue1 = $queue1")

  val queue2:Queue[String] = queue1:+"testAdd"
  println(queue2)
  println(queue2(2))
  println(queue1++queue2)


  //Sequence Practice

  //seq having same operations like List
  val seq1: Seq[String] = Seq("Plain Donut","Strawberry Donut","Chocolate Donut")
  println(s"Elements of seq1 = $seq1")

  //Set Practice

  val set1:Set[String] = Set("ddd","kklk","ssfs","sdfsd")
  println(set1)
  val set3:Set[String] = set1+"hghfh" +"rerer"
  println(set3)

  println(set3-"rerer")
  println(set1++set3)
  val set2:Set[String] = Set("ssss","trte","uykj","fsdfs","sdfsd")

  println("Intersection(common data) Of Two Sets =="+(set1 & set2))

  println(s"Difference between set1 and set5 = ${set1 &~ set2}")

  //HashSet Practice
  val hashSet1:HashSet[String] = HashSet("dsds","cscs","cdcd","cfcf")
  println(hashSet1)

  //add a value to hashSet
  val hasset2:HashSet[String] = hashSet1+"cgcg"
  println(hasset2)

  val hashSet3:HashSet[String] = HashSet("eded")
  println(hashSet1++hashSet3)

  //remove element From HashSet1
  println(hashSet1-"dsds")

  //TreeSet And SortedSet having same operations like same as HashSet and Set

  //BitSet Practice

  val bitSet:BitSet = BitSet(1,2,3);
  println(bitSet)
  println(bitSet(1))

  val bitset2:BitSet=bitSet+4+5
  println(bitset2)

  val bitSet3:BitSet = BitSet(0,9,8)
  println(bitSet3++bitSet)

  println(bitSet-1)

  val bitset4:BitSet=BitSet.empty


  //The Stream is a lazy lists where elements are evaluated only when they are needed.

  val stream1 = 1 #::3 #::4 #::Stream.empty
  println(stream1)

  val stream2: Stream[Int] = cons(1, cons(2, cons(3, Stream.empty) ) )
  println(stream2)

  stream2.take(5).print

  println("\n\nStep 5: How to define an infinite stream of numbers using Stream.from")
  val stream3: Stream[Int] = Stream.from(1)
  print("Take only the first 20 numbers from the infinite number stream = ")
  stream3.take(20).print
}
