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
}

sealed trait DivisionResult

case class Finite(result: Int) extends DivisionResult

case class Infinite() extends DivisionResult