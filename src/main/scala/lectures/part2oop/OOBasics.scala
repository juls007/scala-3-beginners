package lectures.part2oop

object OOBasics extends App {
  val person = new Person("John", 26)
  println(s"${person.age} ${person.x}")
  person.greet("Julius")
  person.greet()

  val author = new Writer("Charles", "Dickens", 1812)
  val imposter = new Writer("Charles", "Dickens", 1812)
  val novel = new Novel("Great Expectations", 1861, author)

  println(novel.authorAge())
  println(novel.isWrittenBy(author))
  println(novel.isWrittenBy(imposter))

  val counter = new Counter()
  counter.inc.print
  counter.inc.inc.inc.print
  counter.inc(10).print
}

//constructor
class Person(name: String, val age: Int = 0) {
  //body

  // fields
  val x = 2

  println(1 + 3)

  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")

  // overloading
  def greet(): Unit = println(s"Hi I am $name")

  // multiple constructors
  def this(name: String) = this(name, 0)
  def this() = this("John Doe")
}

/*
  Novel and a Writer

  Writer: first name, surname, year
        - method fullname
  Novel: name, year of release and author(Writer)
        - authorAge - returns year of author at year of release
        - isWrittenBy (author)
        - copy (new year of release) = returns new instance of Novel
 */

class Writer(val firstName: String, val surname: String, val year: Int) {
  def fullName(): String = firstName + " " + surname
}

class Novel(val name: String, val yearOfRelease: Int, val author: Writer) {
  def authorAge(): Int = yearOfRelease - author.year
  def isWrittenBy(author: Writer): Boolean = author == this.author
  def copy(newYear: Int): Novel = new Novel(name, newYear, author)
}

class Counter(val count: Int = 0) {
  def inc: Counter = {
    println("Incrementing")
    new Counter(count+1)
  } // immutability

  def dec: Counter = {
    println("Decrementing")
    new Counter(count-1)
  }

  def inc(n: Int) : Counter = {
    if (n <= 0) this
    else inc.inc(n-1)
  }

  def dec(n: Int): Counter = {
    if (n <= 0) this
    else dec.dec(n-1)
  }

  def print = println(count)

}

// class parameters are NOT class Fields,
// convert parameters to fields to val/var

