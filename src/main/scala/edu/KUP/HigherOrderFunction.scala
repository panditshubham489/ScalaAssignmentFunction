package edu.KUP

trait Functions2[A, B, C] {
  def apply(f: A, x: B): C
}

class HigherOrderFunction {
  def f(num: Int): Int = num

  val higherOrderFunction: Functions2[Int => Int, Int, Int] = (f: Int => Int, x: Int) => f(x)
}
