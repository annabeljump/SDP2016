import AtomicTest._

case class Planet(description: String,
                  name: String, moons: Int = 1) {
  def hasMoon: Boolean = {
    if (moons > 0) true
    else false
  }
}

val p = new Planet(name = "Mercury",
  description = "Small and hot planet", moons = 0)
p.hasMoon is false

//Q9 - order of arguments shouldn't matter

val earth = new Planet(moons = 1, name = "Earth",
  description = "a hospitable planet")
earth.hasMoon is true