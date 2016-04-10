/**
  * Created for week 7 Q5
  * @author Annabel
  */
trait Colour {

  val red: Int
  val green: Int
  val blue: Int

  def bright(): String

}

object Colour {

  val red: Int = _
  val green: Int = _
  val blue: Int = _

  def customColour(r: Int, g: Int, b: Int): Colour = {
    new Colour {
      override val red = r
      override val green = g
      override val blue = b

      override def bright(): String = {
        if ( red < 50 && green < 50 && blue < 50) "light"
        else "dark"
      }
    }
  }
}
