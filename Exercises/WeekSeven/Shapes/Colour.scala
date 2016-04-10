/**
  * Created for week 7 Q5
  * @author Annabel
  */
sealed trait Colour {

  val red: Int
  val green: Int
  val blue: Int

  def bright(): String

}
