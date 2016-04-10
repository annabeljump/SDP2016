package Shapes

import Colours._

/**
  * Created for Q5, week 7
  * @author Annabel
  */
trait Shape {

  val colour: Colour

  def sides(): Int

  def perimeter(): Double

  def area(): Double

}
