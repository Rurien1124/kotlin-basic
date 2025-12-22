package io.github.rurien.declaration.scopefunction

/**
 * 범위 지정 함수 `,also{it -> ()}`
 *
 * T 를 파라미터로 받아서 T 가 가능한 동작 수행 후 T 를 그대로 리턴
 *
 * let{it -> ()} 와 다른 점은, let 은 결과를 특정한 값으로 리턴하고
 * also{it -> ()} 는 수신 객체 T 를 리턴
 */
class Also {
  companion object {
    @JvmStatic
    fun main(args: Array<String>) {
      var person: Person? = null

      // 수신 객체가 null 인 경우 also 자체가 실행되지 않음
      person =
        person?.also {
          it.name = "Unknown"
          it.age = 15
          it.temperature = 36.2f
        } ?: Person(
          name = "Rurien",
          age = 30,
          temperature = 36.5f,
        )

      println(person.name)
      println(person.age)
      println(person.temperature)
      println(person.isAdult())
      println()

      // 수신 객체가 null이 아닌 경우 수신 객체 T를 리턴
      person =
        person?.also {
          it.name = "Unknown"
          it.age = 15
          it.temperature = 36.2f
        }

      println(person?.name)
      println(person?.age)
      println(person?.temperature)
      println(person?.isAdult())
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
