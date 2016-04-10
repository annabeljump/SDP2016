package Shapes

/**
  * Created for week 7 Q5
  */
case class Square(edge: Int = 4) extends Rectangular {

  val numberSides = 4

  override def sides(): Int = {
    numberSides
  }

  override def perimeter(): Double = {
    edge * numberSides
  }

  override def area(): Double = {
    edge * edge
  }
}
