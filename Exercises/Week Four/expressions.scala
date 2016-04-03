/**
  * Created for week 4 worksheet
  * "Expressions" exercises
  * @author Annabel Jump
  */
class expressions {

  var isSunny = true
  var isPartlyCloudy = false
  var temperature = 15

  //1.
  if (isSunny && temperature > 80) true
  else false

  //2.
  if ((isSunny || isPartlyCloudy) && temperature > 80) true
  else false

  //3.
  if ((isSunny || isPartlyCloudy) && (temperature > 80 || temperature < 20)) true
  else false

  //4.
  var tempCelsius = (temperature - 32) * (5f/9)

  //5.
  var fahrenheit451 = (tempCelsius * (9/5)) + 32
}
