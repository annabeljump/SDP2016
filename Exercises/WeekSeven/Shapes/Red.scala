/**
  * Created for week 7 question 5
  * @author
  */
case class Red() extends Colour {

  val red = 100
  val green = 0
  val blue = 0

  override def bright(): String = {
    if ( red < 50 && green < 50 && blue < 50) "light"
     else "dark"
  }
}
