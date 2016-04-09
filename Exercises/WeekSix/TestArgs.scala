/**
  * Created for week 6 questions 3 and 4
  * @author Annabel
  */
import AtomicTest._

object TestArgs extends App {

  class Family(val member: String*) {
    def familySize(): Int = {
      member.size
    }
  }

  val family1 = new Family("Mum", "Dad", "Sally", "Dick")
  family1.familySize() is 4
  val family2 = new Family("Dad", "Mom", "Harry")
  family2.familySize() is 3
}
