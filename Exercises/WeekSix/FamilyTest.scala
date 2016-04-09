/**
  * Created for week 6 questions 3 and 4
  * @author Annabel
  */
import AtomicTest._

object FamilyTest extends App {

  class Family(val member: String*) {
    def familySize(): Int = {
      member.size
    }
  }

  class FlexibleFamily(mum: String, dad: String, val child: String*) {
    def familySize(): Int = {
      child.size + 2
    }
  }

  val family1 = new Family("Mum", "Dad", "Sally", "Dick")
  family1.familySize() is 4
  val family2 = new Family("Dad", "Mom", "Harry")
  family2.familySize() is 3

  val family3 = new FlexibleFamily("Mum", "Dad", "Sally", "Dick")
  family3.familySize() is 4
  val family4 = new FlexibleFamily("Dad", "Mom", "Harry")
  family4.familySize() is 3
}
