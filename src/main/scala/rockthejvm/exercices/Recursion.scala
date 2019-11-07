package exercises

import scala.annotation.tailrec

object Recursion extends App {

  /* USING TAIL RECURSIVE
   1. Concatenate a string n times
   2. IsPrime function tail recursive
   3. Fibonacci using tail recursive
   */

  // 1.Concatenate a string n times
  def concatString(n: Int, word: String): String = {
    def concatHelper(x: Int, accumulator: String): String =
      if (x <= 0) accumulator
      else concatHelper(x - 1, word + accumulator)

    concatHelper(n, accumulator = "")
  }

  println(concatString(3, "hey"))

  @tailrec
  def concatenateTailrec(aString: String, n: Int, accumulator: String): String =
    if (n <= 0) accumulator
    else concatenateTailrec(aString, n - 1, aString + accumulator)

  println(concatenateTailrec("hello", 3, ""))

  //2. IsPrime function tail recursive//  def isPrime(n: Int): Boolean = {

  //    def primeHelper(x: Int, accumulator: Boolean): Boolean =
  //      if (x <= 1) accumulator
  //      else primeHelper(x - 1, )
  //  }

  def isPrime(n: Int): Boolean = {
    @tailrec
    def isPrimeailrec(t: Int, isStillPrime: Boolean): Boolean =
      if (!isStillPrime) false
      else if (t <= 1) true
      else isPrimeailrec(t - 1, n % t != 0 && isStillPrime)

    isPrimeailrec(n / 2, true)
  }

  println(isPrime(2003))
  println(isPrime(629))

  //  3. Fibonacci using tail recursive
  def fibonacci(n: Int): Int = {
    def fiboTailrec(i: Int, last: Int, nextToLast: Int): Int =
      if (i >= n) last

      else fiboTailrec(i + 1, last + nextToLast, last)

    if (n <= 2) 1
    else fiboTailrec(2, 1, 1)

  }
    println(fibonacci(8))


}
