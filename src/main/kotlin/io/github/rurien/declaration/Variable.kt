package io.github.rurien.declaration

/** 변수 선언 */
class Variable {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            // 정적 변수 선언
            val name: String = "Foo"
            val org: String = "Bar"

            // 동적 변수 선언
            var age: Int = 0
            age = 10

            printFrom("Name", name)
            printFrom("Org", org)
            printFrom("Age", age)
        }

        // Any 타입은 모든 타입의 상위 타입 (자바 기준 Object)
        fun printFrom(
            variableName: String,
            variable: Any,
        ) {
            println("$variableName: $variable")
        }
    }
}
