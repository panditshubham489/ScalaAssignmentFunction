package edu.KUP

trait Function2[A, B, C] {
  def apply(x: A, y: B): C
}

class Add {
  val add: Function2[Int, Int, Int] = (x: Int, y: Int) => x + y
}


