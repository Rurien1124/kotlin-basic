package io.github.rurien.declaration.scopefunction

/**
 * 범위 지정 함수 `apply{}`
 *
 * T 를 파라미터로 받아서 T 가 가능한 동작 수행 후 T 를 그대로 리턴
 */
class Apply {
  companion object {
    @JvmStatic
    fun main(args: Array<String>) {
      val person =
        Person().apply {
          name = "Rurien"
          age = 30
          temperature = 36.5f
        }

      println(person.name)
      println(person.age)
      println(person.temperature)
    }

    private class Person {
      var name: String? = null
      var age: Int? = null
      var temperature: Float? = null
    }
  }
}
