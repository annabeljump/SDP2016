import AtomicTest._

//Q1 - given code
val v = Vector(1, 2, 3, 4)
v.map(n => n + 1) is Vector(2, 3, 4, 5)

//Q1 (a) - question code
v.map(n => (n*11) + 10) is Vector(21, 32, 43, 54)
//Q1 (b) - foreach
v.foreach{n: Int => (n*11) + 10} is Vector(21, 32, 43, 54)
//Blank! Test fail!
//Q1 (c) - for loop
//attempting to change immutable collection
for(n <- v) { n*11 + 10 }
v is Vector(21, 32, 43, 54)
//Values unchanged!!
