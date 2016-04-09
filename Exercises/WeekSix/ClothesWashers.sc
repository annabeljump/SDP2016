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