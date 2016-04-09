import AtomicTest._

//Question 15
case class Person(first: String, last: String,
                  contact: String)

val p = new Person("Jane", "Smile",
                  "jane@smile.com")
p.first is "Jane"
p.last is "Smile"
p.contact is "jane@smile.com"

//Question 16
val people = Vector(
  Person("Jane","Smile","jane@smile.com"),
  Person("Ron","House","ron@house.com"),
  Person("Sally","Dove","sally@dove.com"))

people(0) is "Person(Jane,Smile,jane@smile.com)"
people(1) is "Person(Ron,House,ron@house.com)"
people(2) is "Person(Sally,Dove,sally@dove.com)"

//Further Q16 example (I am making up)

val p1 = new Person("Rick", "Grimes",
                    "walking@dead.com")
val p2 = new Person("Carl", "Grimes",
                    "only@oneeye.com")
val p3 = new Person("Michonne", "Gurira",
                    "richonne@ship.com")
val walkers = Vector(p1, p2, p3)
walkers(0) is "Person(Rick,Grimes,walking@dead.com)"
walkers(1) is "Person(Carl,Grimes,only@oneeye.com)"
walkers(2) is "Person(Michonne,Gurira,richonne@ship.com)"



