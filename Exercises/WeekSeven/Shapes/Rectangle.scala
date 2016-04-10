package Shapes

/**
  * Created for week 7 Q5
  * @author Annabel
  */
class Rectangle(width: Int = 4, height: Int = 2) extends Rectangular {

  val numberSides = 4

  override def sides(): Int = {
    numberSides
  }

  override def perimeter(): Double = {
    (width * 2) + (height * 2)
  }

  override def area(): Double = {
    width * height
  }
}
