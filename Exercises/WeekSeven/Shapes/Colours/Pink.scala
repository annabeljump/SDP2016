package Colours

/**
  * Created for week 7 question 5
  *
  * @author Annabel
  */
case class Pink() extends Colour {

  override val red = 10
  override val green = 0
  override val blue = 0
  override val name = "Pink"

  override def bright(): String = {
    if ( red < 50 && green < 50 && blue < 50) "light"
    else "dark"
  }
}
