/**
  * Created for week 7 question 6
  * And for question 10
  * @author Annabel
  */
object divide extends App {

  def apply(x: Int, y: Int): DivisionResult = {
    if(y == 0) new Infinite()
    else Finite(x/y)
  }

  println(divide(1,2))
  println(divide(1,0))

  def divideBy(x: Int, y: Int) = {
    divide(x, y) match {
      case Finite(i) => x + " divided by " + y + " is " + i
      case Infinite() => "Dividing by 0 is infinite!"
    }
  }

  println(divideBy(2,1))
  println(divideBy(1,0))

}

sealed trait DivisionResult

case class Finite(result: Int) extends DivisionResult

case class Infinite() extends DivisionResult

//Question 10 trait and classes:

sealed trait Maybe[A]

case class Full[A](a: A) extends Maybe[A]

case class Empty[A]() extends Maybe[A]

object genericDivide extends App {

  def apply(x: Int, y: Int): Maybe[Int] = {
    if(y == 0) new Empty[Int]()
    else Full[Int](x/y)
  }

  genericDivide(1,0) match {
    case Full(value) => println(s"It's finite: ${value}")
    case Empty() => println(s"It's infinite!")
  }

  genericDivide(24,2) match {
    case Full(value) => println(s"It's finite: ${value}")
    case Empty() => println(s"It's infinite!")
  }


}