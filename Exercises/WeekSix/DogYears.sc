import AtomicTest._

//Q21
val dogYears = (x: Int) => x * 7
dogYears(10) is 70

//Q22
var s = ""
val v = Vector(1, 5, 7, 8)
v.foreach {x: Int => s = s + x * 7 + " "}
s is "7 35 49 56 "

//Q23
var str = ""
val numbers = Vector(1, 2, 5, 3, 7)
numbers.foreach {x: Int => str = str + x * x + " "}
str is "1 4 25 9 49 "