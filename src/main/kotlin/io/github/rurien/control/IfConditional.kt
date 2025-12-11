package io.github.rurien.control

import kotlin.random.Random

/** If 조건문 */
class IfConditional {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val int01 = Random.nextInt(10)
            val int02 = Random.nextInt(10)

            val double01 = Random.nextDouble(10.0)
            val double02 = Random.nextDouble(10.0)

            compare(int01, int02)
            compare(double01, double02)

            between(int01, 0, 10)
            between(int01, 11, 20)
            between(int01, -10, -1)
        }

        fun <T> compare(i: T, j: T) where T : Number, T : Comparable<T> {
            if (i > j) {
                println("i($i) > j($j)")
            } else if (i == j) {
                println("i($i) == j($j)")
            } else {
                println("i($i) < j($j)")
            }
        }

        fun <T> between(i: T, min: T, max: T) where T : Number, T : Comparable<T> {
            if (i in min..max) {
                println("min($min) <= i($i) <= max($max)")
            } else if (i < min) {
                println("min($min) > i($i)")
            } else {
                println("i($i) > max($max)")
            }
        }
    }
}