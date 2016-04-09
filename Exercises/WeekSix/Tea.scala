/**
  * Created for Question 11, Week 6
  * @author Annabel (except for test)
  */
import AtomicTest._
class Tea(name: String = "Earl Grey", milk: Boolean = false,
          sugar: Boolean = false, decaf: Boolean = false) {

    def describe: String = {
      var description = name
      if(decaf) { description = description + " decaf" }
      if(milk) { description = description + " + milk" }
      if(sugar) { description = description + " + sugar" }
      description
    }

    def calories: Int = {
      var kcal = 0
      if(sugar) { kcal = kcal + 16 }
      if(milk) { kcal = kcal + 100 }
      kcal
    }

}

object TeaScript extends App {
  val tea = new Tea
  tea.describe is "Earl Grey"
  tea.calories is 0
  val lemonZinger = new Tea(decaf = true, name="Lemon Zinger")
  lemonZinger.describe is "Lemon Zinger decaf"
  lemonZinger.calories is 0
  val sweetGreen = new Tea( name="Jasmine Green", sugar=true)
  sweetGreen.describe is "Jasmine Green + sugar"
  sweetGreen.calories is 16
  val teaLatte = new Tea(sugar=true, milk=true)
  teaLatte.describe is "Earl Grey + milk + sugar"
  teaLatte.calories is 116
}