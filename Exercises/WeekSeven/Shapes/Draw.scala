import Shapes._

/**
  * Created for week 7 Q5
  *
  * @author Annabel
  */
object Draw extends App {

  def apply(sh: Shape) = sh match {
      //fixed!
      case Circle(radius, colour) => "A circle of radius " + radius + "cm"
      case Rectangle(width, height, colour) => "A rectangle of width " + width + "cm and height " + height + "cm"
      case Square(edge, colour) => "A square with sides of " + edge + "cm"
    }


}
