import AtomicTest._

case class Item(name: String, price: Double) {

  def cost(grocery: Boolean = false,
           medication: Boolean = false,
           taxRate: Double = 0.10): Double = {
    if(grocery || medication){
      price
    } else price + (price * taxRate)
  }
}

val flour = new Item(name="flour", 4)
flour.cost(grocery=true) is 4
val sunscreen = new Item(
  name="sunscreen", 3)
sunscreen.cost() is 3.3
val tv = new Item(name="television", 500)
tv.cost(taxRate = 0.06) is 530