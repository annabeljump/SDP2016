//Worksheet section "Fields in Classes"

//NB I CANNOT GET ATOMICSCALA TO WORK!!!!
//Therefore, I have not used it here (sorry)


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
//having to use equals because atomic scala is a no-go
cup.add(45).equals(45)
cup.add(-15).equals(30)