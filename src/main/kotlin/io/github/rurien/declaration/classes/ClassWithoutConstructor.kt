package io.github.rurien.declaration.classes

class ClassWithoutConstructor {
  val name: String = "Foo"
  val age: Int = 10

  // 최초 생성 시 실행
  init {
    println("$name created")
  }

  fun introduce() {
    println("My name is $name. I'm $age years old.")
  }

  companion object {

    @JvmStatic
    fun main(args: Array<String>) {
      val person = ClassWithoutConstructor();
      person.introduce()
    }
  }
}