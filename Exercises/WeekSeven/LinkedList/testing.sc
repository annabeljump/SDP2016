sealed trait LinkedList[A]

final case class Pair[A](head: A, tail: LinkedList[A]) extends LinkedList[A]

final case class Empty[A]() extends LinkedList[A]

val list: LinkedList[Int] = Pair(1, Pair(2, Pair(3, Empty())))

list.isInstanceOf[LinkedList[Int]]

//head is not defined in LinkedList[A]
//nor is tail
//but if we define, then Empty() has to have them.
// which doesn't work
list.head
list.tail
list.tail.tail