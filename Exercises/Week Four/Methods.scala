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
}
