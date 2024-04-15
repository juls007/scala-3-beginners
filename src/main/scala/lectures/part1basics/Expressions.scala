package lectures.part1basics

object Expressions extends App {

  val x = 1 + 2
  println(x)

  println(2 + 3 * 4)

  println(1 == x)

  println(!(1==x))

  var aVar = 2
  aVar +=3 // also works with -= *= /= side effects
  println(aVar)

  // Instructions (Do) and Expressions (Value)
  val aCond = true
  val aCondVal = if (aCond) 5 else 3
  println(aCondVal)

  val aWeirdVAlue = (aVar = 9)
  println(aWeirdVAlue)

  var i = 0
  val aWhile = while(i < 10) {
//    println(i)
    i += 1
  }

  println(aWhile)

  // side effects: println(), whiles, reassigning

  // Code blocks

  private val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye"
  }

  println(aCodeBlock)

}
