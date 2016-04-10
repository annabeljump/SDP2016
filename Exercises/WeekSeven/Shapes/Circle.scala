package Shapes

/**
  * Created for week 7 Q5
  * @author Annabel
  */
class Circle(radius: Int = 1) extends Shape {

  val numberSides = 1

  override def sides(): Int ={
    numberSides
  }

  override def perimeter(): Double = {
    2 * math.Pi * radius
  }

  override def area(): Double = {
    math.Pi * (radius * radius)
  }
}
