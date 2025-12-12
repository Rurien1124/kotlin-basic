package io.github.rurien.declaration.classes.inheritance

import java.time.LocalDate

class PurchasedCar(
  name: String,
  price: Double,
  brand: String,
  purchasedDate: LocalDate,
) : Car(name, price, brand, purchasedDate) {
  override fun printPurchasedDate() {
    println("PurchasedDate: $purchasedDate")
  }
}
