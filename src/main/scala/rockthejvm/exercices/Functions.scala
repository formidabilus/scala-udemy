package exercises

object Functions extends App {

  val input = 5
  // 1.)
  def greeting(name: String, age: Int): Unit = {
    println(s"Hi, my name is $name and I am $age years old.")
  }

  greeting("David", 12)

  // 2.) Factorial
  def factorial(n: Int): Double = {
    var result = if (n <= 0 ) 1 else n * factorial(n-1)
    result
  }

  println(s"factorial of $input: " + factorial(input))


  // 3.) Fibonacci
  def fibonacci(n: Int): Int =
    if (n <= 2) 1 else fibonacci(n - 1) + fibonacci(n - 2)



  println(s"fiboncacci of $input: " + fibonacci(input))

  //4.) Is prime
  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t - 1)
    isPrimeUntil(n / 2)
  }






}

