package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App {

  def factorial(n: Int): Int = {
    if (n < 1) 1
    else {
      println(s"Computer factorial of $n - I first need factorial of ${n-1}")
      val result = n * factorial(n -1)
      println("Computed factorial of " + n)
      result
    }
  }

  //println(factorial(10))

  private def anotherFactorial(n: Int): BigInt = {
    @tailrec
    def factHelper(x: Int, accumulator: BigInt): BigInt = {
      if (x <= 1) accumulator
      else factHelper(x-1, x * accumulator)
    }

    factHelper(n, 1)
  }

  println(anotherFactorial(5000))

  /*
    1. Concatenate a string n times
    2. IsPrime function tail recursive
    3. Fibonacci series
   */

  @tailrec
  def concatStr(str: String, count: Int, acc: String = ""): String = {
    if (count <= 0)  acc
    else concatStr(str, count - 1, acc + " " + str)
  }

  println(concatStr("Julius", 4))

  def isPrime(n: Int): Boolean = {
    @tailrec
    def isPrimeTailRec(t: Int, isStillPrime: Boolean): Boolean = {
      if (!isStillPrime) false
      else if (t <= 1) true
      else isPrimeTailRec(t - 1, n % t != 0 && isStillPrime)
    }

    isPrimeTailRec(n/2, true)
  }

  println(isPrime(2003))

  def fibonacci(n: Int): Int = {
    @tailrec
    def fiboTailRec(i: Int, last: Int, nextToLast: Int) : Int = {
      if (i >= n) last
      else fiboTailRec(i + 1, last + nextToLast, last)
    }

    if (n <= 2 ) 1
    else fiboTailRec(2, 1, 1)
  }

  println(fibonacci(8))
}
