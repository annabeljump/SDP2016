import AtomicTest._

def squareThem(num : Int*): Int = {
  var squares = List[Int]
  for(i <- num){
    squares = i*i :: squares
  }
}