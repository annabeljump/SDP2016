import Shapes._
import Colours._

/**
  * Created for week 7 Q5
  *
  * @author Annabel
  */
object Draw extends App {

  def apply(sh: Shape) = sh match {
      //fixed!
      case Circle(radius, colour) => "A " + colour.name + " circle of radius " + radius + "cm"
      case Rectangle(width, height, colour) => "A " + colour.name + " rectangle of width " + width +
                                              "cm and height " + height + "cm"
      case Square(edge, colour) => "A " + colour.name + " square with sides of " + edge + "cm"
    }

  println(Draw(Circle(10, Red())))
  println(Draw(Rectangle(2,3,Yellow())))
  println(Draw(Square(4,Pink())))

  //this will print name of custom colour not light or dark
  println(Draw(Circle(4, Colour.customColour("Green", 0, 100, 0))))

}
