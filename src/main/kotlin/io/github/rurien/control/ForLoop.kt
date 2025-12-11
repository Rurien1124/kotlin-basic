package io.github.rurien.control

/** For 반복문 */
class ForLoop {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            // 범위
            for (i in 1..10) {
                print("$i ")
            }

            println()

            // 내림차
            for (i in 10 downTo 1) {
                print("$i ")
            }

            println()

            // 건너뛰기
            for (i in 1..11 step 3) {
                print("$i ")
            }

            println()
            println((10 downTo 1).joinToString(", "))
            println((10 downTo 1).joinToString("|") { num -> "[$num]" })
        }
    }
}
