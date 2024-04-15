package lectures.part1basics

import scala.annotation.tailrec

object Functions extends App {
  private def aFunction(a: String, b: Int) = {
    a + " " + b
  }

  println(aFunction("Hello", 34))

  private def aParameterlessFunction : Int = 42
  println(aParameterlessFunction)

  private def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }

  println(aRepeatedFunction("hello", 3))

  // when you need loops, use recursions
  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallFunction(a: Int, b: Int): Int = a + b
    aSmallFunction(n, n-1)
  }

  /*
    1. A Greeting function (name, age) => "Hi, my name is $name and I am $age years old"
    2. Factorial function 1 * 2 * 3 .. * n
    3. A fibonacci Function
    4. Tests if number is prime
   */
  def greetFunc(name: String, age: Int): String = {
    s"Hi, my name is $name and I am $age years old"
  }

  println(greetFunc("Juls", 33))

  private def factorial(n: Int): Int = {
    if (n <= 0) 1 else n * factorial(n - 1)
  }

  println(factorial(10))

  private def fibonacci(n: Int): Int = {
    if (n <= 2) 1 else fibonacci(n - 1) + fibonacci(n - 2)
  }

  fibonacci(3)

  def isPrime(n: Int): Boolean = {
    @tailrec
    def isPrimeUntil(t: Int): Boolean = {
      if (t <= 1 ) true
      else n % t != 0 && isPrimeUntil(t-1)
    }
    isPrimeUntil(n / 2)
  }

  println(isPrime(37))

}
