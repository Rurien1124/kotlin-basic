package io.github.rurien.declaration.scopefunction

/**
 * 범위 지정 함수 `let{it -> ()}`
 *
 * Nullable T 를 파라미터로 받아서 T 가 가능한 동작 수행 후 마지막 라인을 리턴
 */
class Let {
  companion object {
    @JvmStatic
    fun main(args: Array<String>) {
      var person: Person? = null

      // 수신 객체가 null 인 경우 let 자체가 실행되지 않음
      var isAdult =
        person?.let {
          it.isAdult()
        } ?: false

      println(isAdult)
      println()

      person =
        Person(
          name = "Unknown",
          age = 30,
          temperature = 36.5f,
        )

      // 수신 객체가 null이 아닌 경우 마지막 라인을 리턴
      isAdult =
        person?.let {
          it.name = "Rurien"
          it.age = 25
          it.temperature = 36.2f

          it.isAdult()
        } ?: false

      println(person.name)
      println(person.age)
      println(person.temperature)
      println(isAdult)
      println()
    }

    private class Person(
      var name: String,
      var age: Int,
      var temperature: Float,
    ) {
      fun isAdult(): Boolean = age!! > 18
    }
  }
}
