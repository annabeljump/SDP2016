package Shapes

import Colours._

/**
  * Created for week 7 Q5
  * @author Annabel
  */
case class Rectangle(width: Int, height: Int, colour: Colour) extends Rectangular {

  val c = colour
  val w = width
  val h = height
  val numberSides = 4
  var p = 0.0
  var a = 0.0

  override def sides(): Int = {
    numberSides
  }

  override def perimeter(): Double = {
    p = (w * 2) + (h * 2)
    p
  }

  override def area(): Double = {
    a = w * h
    a
  }
}
