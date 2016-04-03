//Worksheet section "Fields in Classes"

//NB I CANNOT GET ATOMICSCALA TO WORK!!!!
//Therefore, I have not used it here (sorry)


class Cup {
  private var percentFull = 0
  val max = 100
  val min = 0
  def add(increase:Int):Int ={
    percentFull += increase
    if(percentFull > max) {
      percentFull = max
    } else if(percentFull < min) {
      percentFull = min
    }
    percentFull //return this value
  }
  def setFull(i: Int) {
    percentFull = i
  }
  def getFull(): Int = {
    percentFull
  }
}

//1.
//Let's find out what happens with a negative increase!
val cup = new Cup
//having to use equals because atomic scala is a no-go
cup.add(45).equals(45)
cup.add(-15).equals(30)
cup.add(-50).equals(-20)
//all tests pass, no additional code necessary

//2.
//see additions to Cup above
val cup2 = new Cup
cup.add(45).equals(45)
cup.add(-55).equals(0)
cup.add(10).equals(10)
cup.add(-9).equals(1)
cup.add(-2).equals(0)
//all tests = true

//3.
//cup.percentFull = 56
//cup.percentFull.equals(56)
//Yes, percentFull is accessible outside the class
//wasn't marked private?
//changed to private for next question, above tests commented out.

//4.
//see getter and setter methods
val cup3 = new Cup
cup.setFull(56)
cup.getFull().equals(56)
//true = pass!
