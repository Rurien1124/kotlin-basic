package io.github.rurien.declaration

import kotlin.random.Random

class Functions {
  companion object {
    @JvmStatic
    fun main(args: Array<String>) {
      val i = Random.nextInt(10)
      val j = Random.nextInt(10)

      basicFunction(i, j)
      basicFunction(j = 5, i = 3)
      printFunctionResult("basicFunctionReturn", basicFunctionReturn(i, j))
      functionWithDefault()
      printFunctionResult("functionSimple", functionSimple(i, j))
    }

    /** 기본 함수 */
    fun basicFunction(
      i: Int,
      j: Int,
    ) {
      printFunctionResult(getFunctionName(), i + j)
    }

    /** 리턴 함수 */
    fun basicFunctionReturn(
      i: Int,
      j: Int,
    ): Int = i + j

    /** 디폴트 파라미터 함수 */
    fun functionWithDefault(
      i: Int = 10,
      j: Int = 10,
    ) {
      printFunctionResult(getFunctionName(), i + j)
    }

    /** 간략화한 리턴 함수 */
    fun functionSimple(
      i: Int,
      j: Int,
    ) = i + j

    fun printFunctionResult(
      callerName: String,
      result: Any,
    ) {
      println("$callerName: $result")
    }

    fun getFunctionName(): String =
      StackWalker
        .getInstance(StackWalker.Option.RETAIN_CLASS_REFERENCE)
        .walk { frames ->
          frames
            .skip(1)
            .findFirst()
            .get()
            .methodName
        }
  }
}
