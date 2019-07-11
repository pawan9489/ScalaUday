
// super -> Calling Parent

object Persons extends App {
  class Person(val name: String, age: Int) {
    override def toString: String = s"My name is $name and I belong to ${Person.university_name}"

    def printMyName() = println(s"My name is ${this.name}")
    def printMyName(p: Person) = println(s"My name is ${p.name}")
  }

  object Person { // Static Attributes & Static Methods
    var no_of_person_created : Int = 90
    var university_name = "ABC"
    // Static Methods -> Generally used for Helper methods
    def addNameToPerson(p: Person) = p.name + " asdasd"
//    def addNameToPerson2() = name + " asdasd"
  }

  def func(x: Int)  = x * 3

  val p1 = new Person("Person1", 23)
  println(p1)
  p1.printMyName()
  println(Person.addNameToPerson(p1))

  val p2 = new Person("Person2", 44)
  println(p2)
  println(Person.addNameToPerson(p2))

}

/*
* rational => p / q
* new Rational(p, q)
* r1 + r2 ; r1.add(r2)
* r1 - r2
* r1 * r2
* r1 / r2
* toString => println(r1) // p / q
* */

