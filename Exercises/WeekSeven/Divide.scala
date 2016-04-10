/**
  * Created for week 7 question 6
  */
object Divide {

  def apply(x: Int, y: Int): DivisionResult = {
    if(x == 0 || y == 0) new Infinite()
    else Finite(x/y)
  }
}

sealed trait DivisionResult

case class Finite(result: Int) extends DivisionResult

case class Infinite() extends DivisionResult