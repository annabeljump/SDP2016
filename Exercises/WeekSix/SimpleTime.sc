import AtomicTest._

case class SimpleTime(hours: Int, minutes: Int)

val t = new SimpleTime(hours=5, minutes=30)
t.hours is 5
t.minutes is 30

case class Simple2Time(hours: Int, minutes: Int = 0)

val t2 = new Simple2Time(hours=10)
t2.hours is 10
t2.minutes is 0