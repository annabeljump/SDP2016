/**
  * Created for week 7 question 9
  * @author Annabel
  */
sealed trait Sum[A, B]

case class Left[A, B](value: A) extends Sum[A, B]

case class Right[A, B](value: B) extends Sum[A, B]

object TestSum extends App {

  println(Left[Int, String](1).value)
  println(Right[Int, String]("foo").value)

  val sum: Sum[Int, String] = Right("foo")

  println(sum match {
    case Left(x) => x.toString()
    case Right(x)  => x
  })


}
