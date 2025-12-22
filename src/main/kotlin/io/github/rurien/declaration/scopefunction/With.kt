package io.github.rurien.declaration.scopefunction

/**
 * 범위 지정 함수 `with(T){}`
 *
 * T 를 파라미터로 받아서 T 가 가능한 동작 수행 후 마지막 라인을 리턴
 *
 * run{} 과 다른 점은 run 은 T.run{} 과 같이 확장 함수로 동작하고
 * with(T){} 은 T를 파라미터로 받아서 사용
 */
class With {
  companion object {
    @JvmStatic
    fun main(args: Array<String>) {
      val person = Person()

      // 수신 객체로 실행
      var isAdult =
        with(person) {
          name = "Rurien"
          age = 30
          temperature = 36.5f

          // with 실행 결과 (마지막 라인)
          isAdult()
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
