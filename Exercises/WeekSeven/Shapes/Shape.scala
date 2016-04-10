package Shapes

import Colours._

/**
  * Created for Q5, week 7
  * @author Annabel
  */
sealed trait Shape {

  val colour: Colour

  def sides(): Int

  def perimeter(): Double

  def area(): Double

}

abstract class Rectangular extends Shape

case class Circle(radius: Int, colour: Colour) extends Shape {

  val c = colour
  val r = radius
  val numberSides = 1
  var p = 0.0
  var a = 0.0

  override def sides(): Int ={
    numberSides
  }

  override def perimeter(): Double = {
    p = 2 * math.Pi * r
    p
  }

  override def area(): Double = {
    a = math.Pi * (r * r)
    a
  }
}

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

case class Square(edge: Int, colour: Colour) extends Rectangular {

  val c = colour
  val numberSides = 4
  val w = edge
  val h = edge
  val p = w * 4
  val a = w * h

  override def sides(): Int = {
    numberSides
  }

  override def perimeter(): Double = {
    p
  }

  override def area(): Double = {
    a
  }
}