/**
  * Created for week 7 question 6
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