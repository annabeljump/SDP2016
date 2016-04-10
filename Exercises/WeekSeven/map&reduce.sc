import AtomicTest._

//Q1 & Q2 - given code
val v = Vector(1, 2, 3, 4)
v.map(n => n + 1) is Vector(2, 3, 4, 5)

//Q1 (a) - question code
v.map(n => (n*11) + 10) is Vector(21, 32, 43, 54)
//Q1 (b) - foreach
v.foreach{n: Int => (n*11) + 10} is Vector(21, 32, 43, 54)
//Blank! Test fail!
//Q1 (c) - for loop
//trying yield keyword
(for(n <- v) yield n*11 + 10) is Vector(21, 32, 43, 54)
//maybe if I put the whole thing in brackets...
//SUCCESS!!

//Q2 - modifying given code
(for(n <- v) yield n +1) is Vector(2, 3, 4, 5)

//Q3 - given code (changed vector name)
val v2 = Vector(1, 10, 100, 1000)
v2.reduce((sum, n) => sum + n) is 1111
//Attempting for loop
//think I have to create a new variable to evaluate
var sum = 0
for(n <- v2) {sum = sum + n}
sum is 1111


//Q4 sumIt method
def sumIt(i: Int*): Int = {
  //after all that, i is a collection itself!!
  i.reduce((sum, n) => sum + n)
}

//Q4 tests
sumIt(1, 2, 3) is 6
sumIt(45, 45, 45, 60) is 195

