/**
  * Created for week 4 scala exercises
  * @author Annabel Jump
  */

class Methods {

  //1.
  def getSquare(i: Int){
    return i * i
  }

  val a = getSquare(3)
  assert(a == 9)

  val  b = getSquare(6)
  assert(b == 36)

  val c = getSquare(5)
  assert(c == 25)

  //2.
  def isArg1GreaterThanArg2(x: Double, y: Double): Boolean ={
    if(x > y)true
    else false
  }

  val t1 = isArg1GreaterThanArg2(4.1, 4.12)
  assert(!t1)

  val t2 = isArg1GreaterThanArg2(2.1, 1.2)
  assert(t2)

  //3.
  def manyTimesString(str: String, i: Int): String = {
    var a = str
    while(i > 1){
      a = a + str
      i - 1
    }
    return a
  }

  val m1 = manyTimesString("abc", 3)
  assert("abcabcabc" ==  m1, "My Message here??")

  val m2 = manyTimesString("123", 2)
  assert("123123" == m2, "Another of my Messages here")
}
