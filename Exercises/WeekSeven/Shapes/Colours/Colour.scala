package Colours

/**
  * Created for week 7 Q5
  * @author Annabel
  */
sealed trait Colour {

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

case class Pink() extends Colour {

  override val red = 10
  override val green = 0
  override val blue = 0
  override val name = "Pink"

  override def getName: String = {
    name
  }

  override def bright(): String = {
    if ( red < 50 && green < 50 && blue < 50) "light"
    else "dark"
  }
}

case class Red() extends Colour {

  override val red = 100
  override val green = 0
  override val blue = 0
  override val name = "Red"

  override def getName: String = {
    name
  }

  override def bright(): String = {
    if ( red < 50 && green < 50 && blue < 50) "light"
    else "dark"
  }
}

case class Yellow() extends Colour {

  override val red = 30
  override val green = 45
  override val blue = 0
  override val name = "Yellow"

  override def getName: String = {
    name
  }

  override def bright(): String = {
    if ( red < 50 && green < 50 && blue < 50) "light"
    else "dark"
  }

}
