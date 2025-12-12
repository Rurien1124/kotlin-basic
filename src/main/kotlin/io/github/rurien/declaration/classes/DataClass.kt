package io.github.rurien.declaration.classes

/**
 * ### 데이터 클래스 (DTO)
 *
 * 선언 시 다음 메서드 자동 생성
 * ```
 * equals
 * getter/setter
 * hashCode
 * toString
 * copy
 * componentN (N번째 필드 조회 시 사용하는 메서드)
 * ```
 */
data class DataClass(
  val name: String,
  val value: Int,
) {
  companion object {
    @JvmStatic
    fun main(args: Array<String>) {
      val mydata = DataClass("MyData", 123)
      val copiedData = mydata.copy()

      println("- ToString")

      println(mydata)
      println(copiedData)

      println("\n- Field")
      println(mydata.name)
      println(mydata.value)

      println("\n- ComponentN")
      println(mydata.component1())
      println(mydata.component2())

      println("\n- HashCode")
      println(mydata.hashCode())
      println(copiedData.hashCode())

      println("\n- Equals")
      println(mydata == copiedData)
      println(mydata === copiedData)
    }
  }
}
