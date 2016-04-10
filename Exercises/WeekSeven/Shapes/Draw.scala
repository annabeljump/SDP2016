import Shapes._

/**
  * Created for week 7 Q5
  *
  * @author Annabel
  */
object Draw extends App {

  def apply(sh: Shape) = sh match {
      //fixed!
      case Circle(radius) => "A circle of radius " + radius + "cm"
      case Rectangle(width, height) => "A rectangle of width " + width + "cm and height " + height + "cm"
      case Square(edge) => "A square with sides of " + edge + "cm"
    }

  println(Draw(Circle(10)))
  println(Draw(Square(4)))
  println(Draw(Rectangle(3,6)))
}
