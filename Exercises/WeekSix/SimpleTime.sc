import AtomicTest._

case class SimpleTime(hours: Int, minutes: Int)

val t = new SimpleTime(hours=5, minutes=30)
t.hours is 5
t.minutes is 30