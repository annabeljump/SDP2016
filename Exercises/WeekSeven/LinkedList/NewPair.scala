package LinkedList

/**
  * Created for week 7 question 8
  * @author Annabel
  */
class NewPair[A, Z](o: A, t: Z) {

  val one = o
  val two = t

}

object TestPair extends App {
  val pair = new NewPair[String, Int]("Hi", 2)

  println(pair.one)
  println(pair.two)

}



