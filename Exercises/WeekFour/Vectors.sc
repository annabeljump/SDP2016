//Worksheet for Vectors section of week 4 worksheet

//1.
val vector1 = Vector(2, 4, 6, 8)
val vector2 = Vector("Who", "do", "we", "appreciate")
val vector3 = Vector(2.0, 4.0, 6.0, 8.0)
val vector4 = Vector('W', 'd', 'w', 'a')

//2.
val vectorVector = Vector(vector1, vector2, vector3, vector4)
//yup! Can create a vector of vectors!

//3.
val stringVector = Vector("The ", "dog ", "visited ", "the ", "fire ", "station ")
var sentence = ""
for(word <- stringVector){
  print(word)
  sentence = sentence + word
}
//Still no atomicscala, sorry
sentence.toString().equals("The dog visited the fire station ")
//using toString is redundant as is already a string. see below:
sentence.equals("The dog visited the fire station ")
//this test passes too.

//4.
val intVector = Vector(1, 3, 5, 7, 9)
val doubleVector = Vector(1.0, 3.0, 5.0, 7.0, 9.0)
println(intVector.sum)
println(intVector.min)
println(intVector.max)
println(doubleVector.sum)
println(doubleVector.min)
println(doubleVector.max)

//5.
val myVector1 = Vector(1, 2, 3, 4, 5, 6)
val myVector2 = Vector(1, 2, 3, 4, 5, 6)
//still don't have atomicscala working...
myVector1.equals(myVector2)
//evaluates to True
