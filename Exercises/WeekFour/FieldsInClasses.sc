//Worksheet section "Fields in Classes"

import atomicscala.src.com.atomicscala.AtomicTest._
class Cup {
  var percentFull = 0
  val max = 100
  def add(increase:Int):Int ={
    percentFull += increase
    if(percentFull > max) {
      percentFull = max
    }
    percentFull //return this value
  }
}

//1.
//Let's find out what happens with a negative increase!
val cup: Cup = new Cup
cup.add(45) is 45