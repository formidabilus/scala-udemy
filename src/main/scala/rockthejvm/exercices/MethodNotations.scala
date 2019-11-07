package exercises
import scala.language.postfixOps

object MethodNotations extends App{
  /*
  1. Overload the + operator
     marry + "the rockstar" => new person "Mary (the rocksar)"
  2. Add an age to the Person class
     Add a unary + operator => new person with the age + 1
     +mary => mary with the age incrementer
  3. Add a "learns" method in the Person class => "Mary learns Scala"
     Add a learnsScala method, calls learns method with "Scala".
     Use it in postfix notation.
  4. Overload the apply method
     mary.apply(2) => "Mary watched Inception 2 times"
   */

  class Person(val name: String, favoriteMovie: String, val age: Int = 0) {
    def apply(): String = s"Hi, my name is $name and I like $favoriteMovie"
    def apply(n: Int): String = s"$name watched $favoriteMovie $n times"
    def +(nickName: String) : Person = new Person(s"${name} ($nickName)", favoriteMovie)
    def unary_+ : Person = new Person(name, favoriteMovie, age + 1)

    def learns(thing: String) = s"$name is learning $thing"
    def learnsScala = this learns "Scala"
  }

  val mary = new Person("Mary", "Inception")
  println((mary + "the rockstar")())
  println((mary + "the rockstar").apply())
  println((+mary).age)
  println(mary learnsScala)
  println(mary(10))
}
