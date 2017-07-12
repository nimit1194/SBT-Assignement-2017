package edu.knoldus

class Calculator {

  def add(a: Int, b: Int): Int = a + b

  def subtract(a: Int, b: Int): Int = a - b


  def multiply(a: Int, b: Int): Int = a * b

  def divide(a: Double, b: Int): Double = {
    require(b != 0)
    a / b
  }

  def power(base: Int, exp: Int): Int = {
    def powerAcc(acc: Int, base: Int, exp: Int): Int = {
      if (exp == 0) acc
      else powerAcc(acc * base, base, exp - 1)
    }

    powerAcc(1, base, exp)
  }


  def modulus(a: Int, b: Int): Int = {

  require(b != 0)
  a % b
}

  def absolute(a: Int): Int = {
    if (a < 0) -a
    else a
  }

  def max(a: Int, b: Int): Int = {
    if (a > b) a
    else b
  }

  def min(a: Int, b: Int): Int = {
    if (a < b) a
    else b
  }

}
