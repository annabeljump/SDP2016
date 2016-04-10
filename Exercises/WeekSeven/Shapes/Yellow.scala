/**
  * Created for week 7 question 5
  */
class Yellow() extends Colour {

  override val red = 30
  override val green = 45
  override val blue = 0

  override def bright(): String = {
    if ( red < 50 && green < 50 && blue < 50) "light"
    else "dark"
  }

}
