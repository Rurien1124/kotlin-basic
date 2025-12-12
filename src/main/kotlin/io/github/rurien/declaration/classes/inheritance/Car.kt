package io.github.rurien.declaration.classes.inheritance

import java.time.LocalDate

abstract class Car(
  val name: String,
  val price: Double,
  val brand: String,
  val purchasedDate: LocalDate,
) {
  fun printInformation() {
    println("Name: $name\n Price: $price\n Brand: $brand")
  }

  fun compareTo(comparedCar: Car) {
    println("Comparing cars")
    println("Name: $name | ${comparedCar.name}")
    println("Brand: $brand | ${comparedCar.brand}")
    println("Price: $price$ | ${comparedCar.price}$")
  }

  open fun printPurchasedDate() {
    println("This car was not purchased.")
  }
}
