package lectures.part2oop

object AbstractDataTypes extends App {
  // abstract - class with un-implemented/abstract members
  // abstract classes cannot be instantiated

  abstract class Animal {
    val creatureType: String
    def eat: Unit
  }

  class Dog extends Animal {
    val creatureType: String = "Canine"
    def eat: Unit = println("crunch crunch")
  }

  //traits
  trait Carnivore {
    def eat(animal: Animal): Unit
    val preferredMeal: String = "fresh meat"
  }

  trait ColdBlooded

  class Crocodile extends Animal with Carnivore with ColdBlooded {

    val creatureType: String = "Reptilian"
    def eat: Unit = println("nom nom nom")
    def eat(animal: Animal): Unit = println(s"I'm a croc and I'm eating ${animal.creatureType}")
  }

  val dog = new Dog
  val croc = new Crocodile
  croc.eat(dog)

  // traits vs abstract classes
  // 1 - traits do not have constructor parameters
  // 2 - multiple traits can be inherited byu the same class
  // 3 - traits are behaviour, abstract class ia type of thing
}
