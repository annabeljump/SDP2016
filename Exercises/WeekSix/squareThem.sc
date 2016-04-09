import AtomicTest._

def squareThem(num : Int*): Int = {
  var squares = 0
  for(i <- num){
    squares = i*i + squares
  }
  squares
}

squareThem(2) is 4
squareThem(2, 4) is 20
squareThem(1, 2, 4) is 21