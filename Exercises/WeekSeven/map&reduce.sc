import AtomicTest._

//Q1 - given code
val v = Vector(1, 2, 3, 4)
v.map(n => n + 1) is Vector(2, 3, 4, 5)

//Q1 - question code
val v2 = Vector(1, 2, 3, 4)
v.map(n => (n*11) + 10) is Vector(21, 32, 43, 54)