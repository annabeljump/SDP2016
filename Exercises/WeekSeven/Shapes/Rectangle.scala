package Shapes

/**
  * Created for week 7 Q5
  * @author Annabel
  */
class Rectangle(long: Int = 4, short: Int = 2) extends Shape {

  val numberSides = 4

  override def sides(): Int = {
    numberSides
  }

  override def perimeter(): Int = {
    (long * 2) + (short * 2)
  }

  override def area(): Int = {
    long * short
  }
}
