package io.github.rurien.declaration.scopefunction

/**
 * 범위 지정 함수 `run{}`
 *
 * T 를 파라미터로 받아서 T 가 가능한 동작 수행 후 마지막 라인을 리턴
 */
class Run {
  companion object {
    @JvmStatic
    fun main(args: Array<String>) {
      val person = Person()

      // 수신 객체로 실행
      var isAdult =
        person.run {
          name = "Rurien"
          age = 30
          temperature = 36.5f

          // run 실행 결과 (마지막 라인)
          isAdult()
        }

      println(person.name)
      println(person.age)
      println(person.temperature)
      println(isAdult)
      println()

      // 수신 객체 없이 실행 가능
      isAdult =
        run {
          person.name = "Unknown"
          person.age = 15
          person.temperature = 36.2f
          person.isAdult()
        }

      println(person.name)
      println(person.age)
      println(person.temperature)
      println(isAdult)
    }

    private class Person {
      var name: String? = null
      var age: Int? = null
      var temperature: Float? = null

      fun isAdult(): Boolean = age!! > 18
    }
  }
}
