//Creating Classes section of worksheet

//1.
class Hippo {
  var habitat = "Water"
}
class Lion {
  var habitat = "Plains"
}
class Tiger {
  var habitat = "Jungle"
}
class Monkey {
  var habitat = "Jungle"
}
class Giraffe {
  var habitat = "Plains"
}
val potamos = new Hippo
val simba = new Lion
val shereKhan = new Tiger
val baloo = new Monkey
val fred = new Giraffe
//5 strings for 5 objects = check!
//5 unique ugly strings = check!

//2.
val nala = new Lion
val george = new Giraffe
val ginny = new Giraffe
println(nala)
println(george)
println(ginny)
//println seems to print the ugly (identifier?) strings
//plus a repeating pattern of characters before class name