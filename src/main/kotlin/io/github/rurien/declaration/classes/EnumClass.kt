package io.github.rurien.declaration.classes

/**
 * ### 열거형 클래스
 *
 * ```
 * 인스턴스 생성, 상속 방지
 * 타입 안정성 보장
 * 코드 간략화
 * ```
 */
enum class EnumClass(
  val desc: String,
  val value: Int,
  val operation: (Int, Int) -> Int,
) {
  PLUS("더하기", 1, { i, j -> i + j }),
  MINUS("빼기", 2, { i, j -> i - j }),
  MULTIPLY("곱하기", 3, { i, j -> i * j }),
  DIVIDE("나누기", 4, { i, j -> i / j }),
}
