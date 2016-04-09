import AtomicTest._

case class Planet(name: String, description:
                 String, moons: Int = 1) {
  def hasMoon: Boolean = {
    if (moons > 0) true
    else false
  }
}

val p = new Planet(name = "Mercury",
  description = "Small and hot planet", moons = 0)
p.hasMoon is false