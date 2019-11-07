package exercises

object OOPBasics extends App {
  /*
  Novel and a Writer class

  Writer: first name, surname, year
    - method fullname -> returns concatenation of first name and surname
  Novel: name, year of release, author -> instance of type Writer
    - authorAge -> returns age of the author at the year of release
    - isWrittenBy(author)
    - copy (new year of release) = new instance of Novel
  */

  /*
  Counter class
    - receives an int value
    - method current count
    - method to increment/decrement -> returns new Counter
    - overload inc/dec to receive an ammount
   */

  val author = new Writer("Charles", "Dickens", 1812)
  val imposter = new Writer("Charles", "Dickens", 1812 )
  val novel = new Novel("Great expectations", 1861, author)

  println(novel.authorAge)
  println(novel.isWrittenBy(imposter))

  val counter = new Counter()
  counter.incrementCounter.print
  counter.incrementCounter.incrementCounter.incrementCounter.print
  counter.incrementCounter(10).print
}

class Writer(firstName: String, surname: String, val yearOfBirth: Int){

  def fullName(): String = firstName + " " + surname

}


class Novel(name: String, yearOfRelease: Int, author: Writer){

  def authorAge(): Int = {
    val ageAtRelease: Int = yearOfRelease - author.yearOfBirth
    ageAtRelease
  }

  def isWrittenBy(author: Writer) = author == this.author
  def copy(newYearOfRelease: Int) = new Novel(this.name, yearOfRelease = newYearOfRelease, this.author)

}


class Counter(val count: Int = 0) {
  def incrementCounter = {
    println("incrementing")
    new Counter(count + 1) // immutability
  }

  def decrementCounter: Counter = {
    println("decrementing")
    new Counter(count - 1)
    }

  def incrementCounter(n: Int): Counter = {
    if (n <= 0) this
    else incrementCounter.incrementCounter(n-1)
  }

  def decrementCounter(n: Int): Counter =
    if(n <= 0) this
    else decrementCounter.decrementCounter(n-1)

   def print = println(count)

}
