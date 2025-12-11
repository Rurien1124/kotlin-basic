package io.github.rurien.declaration

/** 데이터 타입 추론 */
class DataType {

    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            // 숫자형
            val intType = 1
            val longType = 1L
            val doubleType = 1.1
            val floatType = 1.1F

            // 논리형
            var booleanType = true
            booleanType = false

            // 문자형
            val characterType = 'c'
            val stringType = "Str"
        }
    }
}