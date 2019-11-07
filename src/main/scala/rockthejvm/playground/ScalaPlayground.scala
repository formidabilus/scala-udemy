package rockthejvm.playground

object ScalaPlayground extends App {
  println("Hello, Scala")

  // Creating object of Class 'Geeksforgeeks'
  val GFG = new GeeksforGeeks("John", 50)
  GFG.author     //calling method without parenthesis
  GFG.article

}

class GeeksforGeeks(name: String, ar: Int)
{
  // A parameterless method
  def author() = println(name)
  def article = println(ar)

  // An empty-parenthesis method
  def printInformation() =
  {
    println("User -> " + name + ", Articles -> " + ar)
  }
}