/**
  * Created for week 7 question 5
  * @author Annabel
  */
case class Yellow() extends Colour {

  override val red = 30
  override val green = 45
  override val blue = 0
  override val name = "Yellow"

  override def bright(): String = {
    if ( red < 50 && green < 50 && blue < 50) "light"
    else "dark"
  }

}
