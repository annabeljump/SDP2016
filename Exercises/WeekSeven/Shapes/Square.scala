package Shapes

/**
  * Created for week 7 Q5
  */
case class Square(edge: Int) extends Rectangular {

  val numberSides = 4
  val w = edge
  val h = edge
  val p = w * 4
  val a = w * h

  override def sides(): Int = {
    numberSides
  }

  override def perimeter(): Double = {
    p
  }

  override def area(): Double = {
    a
  }
}
