package LinkedList

/**
  * Created for week 7 question 8
  * @author Annabel
  */
sealed trait LinkedList[A] {
  def length(): Int
  def apply(n: Int): A
  def contains(a: A): Boolean
}

final case class Pair[A](h: A, t: LinkedList[A]) extends LinkedList[A] {
  val head: A = h
  val tail: LinkedList[A] = t

  override def length(): Int = {
    if(this.tail == Empty()) 1
    else this.tail.length() + 1
  }

  override def apply(n: Int): A = {
    if(n == 0) this.head
    else this.tail.apply(n-1)
  }

  override def contains(a: A): Boolean = {
    if (a == this.head) true
    else this.tail.contains(a)
  }
}

final case class Empty[A]() extends LinkedList[A] {
  override def length(): Int = null

  override def apply(n: Int) = throw new Exception("Can't retrieve value from empty list!")

  override def contains(a: A): Boolean = false
}
