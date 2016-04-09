//Question 12
class ClothesWasher(modelName: String, capacity: Double){

    def this() {
      this("Knockoff", 5)
    }

    def this(modelName: String) {
      this(modelName, 5)
    }

    def this(capacity: Double) {
      this("Knockoff", capacity)
    }
}

//Question 13
class ClothesWasher2(modelName: String = "Knockoff",
                     capacity: Double = 5)

class DemoWasher(modelName: String, capacity: Double) {

  //Constructor compiles as has primary constructor:
  def this() {
    this("Knockoff", 5)
  }

  //This will not compile (reassignment to val):
  def this(capacity: Double) {
    modelName = "knockoff"
  }

}
