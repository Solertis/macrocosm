package com.github.retronym.macrocosm

object MacrocosmTest extends App {
	import Macrocosm._

  val s = showTree(List(1, 2, 3).reverse) 
  println(s) // immutable.this.List.apply[Int](1, 2, 3).reverse
}
