/**
  * Created for week 7 question 5
  * @author
  */
case class Red() extends Colour {

  override val red = 100
  override val green = 0
  override val blue = 0

  override def bright(): String = {
    if ( red < 50 && green < 50 && blue < 50) "light"
     else "dark"
  }
}