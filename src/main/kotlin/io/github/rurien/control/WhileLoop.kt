package io.github.rurien.control

import kotlin.random.Random

/** While 반복문 */
class WhileLoop {

  companion object {

    @JvmStatic
    fun main(args: Array<String>) {
      var i = Random.nextInt(10)

      while (i > 0) {
        print("$i ")

        if (i >= 9) {
          break
        } else {
          i--
        }
      }

      println()

      do {
        println("Execute once")
      } while (false)
    }
  }
}