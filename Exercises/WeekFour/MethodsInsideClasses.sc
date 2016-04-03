//Methods inside classes section of worksheet

//1.
//NB Instructions asked to PRINT "Sails raised/lowered"
//not to RETURN it - tests will fail!
class Sailboat {
  def raiseSails(): Unit ={
    println("Sails Raised")
  }
  def lowerSails(): Unit = {
    println("Sails Lowered")
  }
  def signal(): String = {
    val mayday = new Flare
    mayday.light()
  }
}
class Motorboat {
  def startMotor(): String = {
    "Motor On"
  }
  def stopMotor(): String = {
    "Motor Off"
  }
  def signal(): String = {
    val sos = new Flare
    sos.light()
  }
}

//tests failing because method PRINTS, doesn't RETURN
//commenting them out because won't compile past AssertionError
val sailboat = new Sailboat()
val r1 = sailboat.raiseSails()
//assert(r1 == "Sails Raised", "Expected Sails Raised, Got " + r1)
val r2 = sailboat.lowerSails()
//assert(r2 == "Sails Lowered", "Expected Sails Lowered, Got " + r2)

//motorboat assertions should work
val motorboat = new Motorboat()
val s1 = motorboat.startMotor()
assert(s1 == "Motor On", "Expected Motor On, Got " + s1)
val s2 = motorboat.stopMotor()
assert(s2 == "Motor Off", "Expected Motor Off, got " +s2)

//2.
class Flare {
  def light(): String ={
    "Flare used!"
  }
}
val flare = new Flare
val f1 = flare.light()
assert(f1 == "Flare used!", "Expected Flare used!, got " + f1)

//3. (see above method insertions)
val sailboat2 = new Sailboat
val signal = sailboat2.signal()
assert(signal == "Flare used!", "Expected Flare used!, got " + signal)

val motorboat2 = new Motorboat
val flare2 = motorboat2.signal()
assert(flare2 == "Flare used!", "Expected Flare used!, got " + flare2)
