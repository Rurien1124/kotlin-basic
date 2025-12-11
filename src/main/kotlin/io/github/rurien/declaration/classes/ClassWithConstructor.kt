package io.github.rurien.declaration.classes

class ClassWithConstructor( // 주 생성자
  private val name: String,
  private val age: Int
) {

  private var gender: Gender = Gender.MALE

  // 부 생성자
  constructor(name: String) : this(name, 10)

  // 추가 생성자
  constructor(name: String, age: Int, gender: Gender) : this(name, age) {
    this.gender = gender
    println("Set gender to $gender")
  }

  fun introduce() {
    println("My name is $name.")
    println("I'm $age years old.")
    println("My gender is ${gender.desc}\n")
  }

  enum class Gender(val desc: String) {
    MALE("male"),
    FEMALE("female")
  }

  companion object {

    @JvmStatic
    fun main(args: Array<String>) {
      val person = ClassWithConstructor("Foo", 20);
      person.introduce()

      val personBar = ClassWithConstructor("Bar")
      personBar.introduce()

      val male = ClassWithConstructor("Foo", 20, Gender.FEMALE)
      male.introduce()
    }
  }
}