package lectures.part2oop

import scala.language.postfixOps

object Objects {

  // SCALA does not have CLASS-LEVEL Functionality ("static")
  // equivalent of using static or Class level is Object

  object Person { // type + it's only instance
    // Static/class level functionality
    val N_EYES = 2
    def canFly: Boolean = false

    // factory method
    def apply(mother: Person, father: Person): Person = new Person("Bobbie")
  }

  class Person(val name: String) {
    // instance level functionality
  }
  // COMPANIONS

  def main(args: Array[String]): Unit = {

    println(Person.N_EYES)
    println(Person.canFly)

    // Scala Object is a Singleton instance
    val mary = new Person("Mary")
    val john = new Person("John")
    println(mary == john)

    val person1 = Person
    val person2 = Person
    println(person1 == person2)

    // apply method called and not constructor
    val bobbie = Person(mary, john)
  }

  // Scala Applications = Scala object with main entry point function
  // def main(args: Array[String]): Unit


}
