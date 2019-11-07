package lectures.part1basics

object Expressions extends App {
  val x = 1 + 2
  println(x)

  println(2 + 3 * 4)
  println(1 == x)
  println(!(1 == x))

  var aVariable = 2
  aVariable += 3
  println(aVariable)

  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3 //IF EXPRESSION
  println(aConditionedValue)

  var i = 0
  while (i < 10) {
    println(i)
    i += 1
  }

  //NEVER WRITE THIS AGAIN.

  //EVERTHING IN SCALA IS AN EXPRESSION!

  val aWeirdValue = (aVariable = 3) // Unit === void
  println(aWeirdValue)

  //side effects: println(), whiles, reassigning

  //Code blocks
  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z >2) "hello" else "goodbye"
  }



}
