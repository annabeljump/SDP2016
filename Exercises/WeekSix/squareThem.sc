import AtomicTest._

def squareThem(num : Int*): Int = {
  var squares = 0
  for(i <- num){
    squares = i*i + squares
  }
  squares
}