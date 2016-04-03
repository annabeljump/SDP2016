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
}
