package lectures.part1basics

object ValuesVariablesTypes extends App {
  private val x = 42
  println(x)

  // val's are immutable

  val aString: String = "Hello"
  val anotherString = "goodbye"

  val aBoolean: Boolean = false
  val aChar: Char = 'a'
  val aInt: Int = x
  val aShort: Short = 9999
  val aLong: Long = 999999999L
  val aFloat: Float = 2.3f
  val aDouble: Double = 2.3

  // Variables
  private var aVariable: Int = 4
  aVariable = 5 // side effects

}
