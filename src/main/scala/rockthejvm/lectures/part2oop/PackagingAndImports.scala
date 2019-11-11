package rockthejvm.lectures.part2oop

import java.sql

import exercises.Writer
import rockthejvm.playground.{PrinceCharming, Cinderella => Princess}
import java.util.Date
import java.sql.{Date => SqlDate}

object PackagingAndImports extends App {

  val writer = new Writer("Razvan", "RockTheJVM", 2018)
          // = new exercices.Writer -> fully qualified name

  // import the package
  //val princess = new Cinderella // playground.Cinderella = fully qualified name
  val princess = new Princess

  // packages are in hierarchy
  // matching folder structure.

  // package object
  sayHello
  println(SPEED_OF_LIGHT)

  // Imports
  val prince = new PrinceCharming

  // 1. use FQ name
  val date = new Date
  val sqlDate = new java.sql.Date(2018, 5, 4)

  // 2. use aliasing:
  // val sqlDate = new SqlDate(2018, 5, 4)

  // default imports
  // java.lang  - String, Object, Exception
  // scala - Int, Nothing, Function
  // scala.Predef - println, ???
}
