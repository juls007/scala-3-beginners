package lectures.part1basics

object DefaultArgs extends App {

  def factorial(n: Int, acc: Int = 1): Int = {
    if (n <= 1) acc
    else factorial(n - 1, n * acc)
  }

  val fact10 = factorial(10)
  println(fact10)

  def savePicture(format: String = "jpg", width: Int = 1920, height: Int = 1080): Unit = println("save pictures")

  savePicture(width = 800)
}
