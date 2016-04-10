package Shapes

/**
  * Created for week 7 Q5
  * @author Annabel
  */
case class Circle(radius: Int, colour: Colour) extends Shape {

  val c = colour
  val r = radius
  val numberSides = 1
  var p = 0.0
  var a = 0.0

  override def sides(): Int ={
    numberSides
  }

  override def perimeter(): Double = {
    p = 2 * math.Pi * r
    p
  }

  override def area(): Double = {
    a = math.Pi * (r * r)
    a
  }
}
