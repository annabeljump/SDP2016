package Colours

/**
  * Created for week 7 Q5
  * @author Annabel
  */
trait Colour {

  val red: Int
  val green: Int
  val blue: Int
  val name: String

  def bright(): String

  def getName: String

}

object Colour {

  def customColour(n: String, r: Int, g: Int, b: Int): Colour = {
    new Colour {
      override val red = r
      override val green = g
      override val blue = b
      override val name = n

      override def getName: String = {
        bright()
      }

      override def bright(): String = {
        if ( red < 50 && green < 50 && blue < 50) "light"
        else "dark"
      }
    }
  }
}
