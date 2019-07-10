
object Test extends App {
  val lst = List(1,2,3,4,5)

  // lst.foreach(x => println(x))
  lst.map(x => x * 3)
  lst.map(_ * 3)
  // COW- Copy On Write
  println(lst.filter(_ > 5))
  // Fold Left , Fold Right
  //  println(lst.foldLeft(0)(_ + _))
  lst.foldLeft(0)((accumulator, value_from_list) => accumulator + value_from_list)
  lst.foldRight(0)((value_from_list, accumulator) => accumulator + value_from_list)
  val a = Array(1,2,3)
  // Fixed Size, Known at Compile Time
  // Mutable - Mutability is not EVIL
  // Function :: input => Output
//  println(a.head)
//  a.tail.foreach(println)
  println(a.exists(_ > 2))
  println(a.length)
  println(a.count(_ > 2))
  // Predicate => Function returns a boolean
  val i = Array(100)
  println(i.mkString(","))
}
