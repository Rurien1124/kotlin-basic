package io.github.rurien.control

import kotlin.random.Random

/** When 조건문 (자바 기준 Switch) */
class WhenConditional {

  companion object {

    @JvmStatic
    fun main(args: Array<String>) {
      val i = Random.nextInt(10)
      val j = Random.nextInt(10)
      val fooBar = if (Random.nextInt(1) == 0) {
        FooBar.FOO
      } else {
        FooBar.BAR
      }

      when (i) {
        0 -> println("i($i) == 0")
        in 1..3 -> println("1 <= i($i) <= 3")
        4, 5, 6, 7, 8, 9 -> println("i($i) == 4, 5, 6, 7, 8, 9")
        else -> println("0 > i($i) || 9 < i($i)")
      }

      when {
        i > j -> println("i($i) > j($j)")
        i < j -> println("i($i) < j($j)")
        else -> println("i($i) == j($j)")
      }

      when (fooBar) {
        FooBar.FOO -> println("Foo")
        FooBar.BAR -> println("Bar")
      }
    }
  }

  enum class FooBar {
    FOO,
    BAR
  }
}