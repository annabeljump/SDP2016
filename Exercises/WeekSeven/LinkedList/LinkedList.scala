package LinkedList

/**
  * Created for week 7 question 8
  * @author Annabel
  */
sealed trait LinkedList[A]

final case class Pair[A](h: A, t: LinkedList[A]) extends LinkedList[A] {
  val head: A = h
  val tail: LinkedList[A] = t
}

final case class Empty[A]() extends LinkedList[A]
