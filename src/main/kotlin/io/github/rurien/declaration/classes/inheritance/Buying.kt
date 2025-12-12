package io.github.rurien.declaration.classes.inheritance

import java.time.LocalDate

fun main() {
  val gv70 =
    PurchasedCar(
      "GV70",
      10000.0,
      "Hyundai",
      LocalDate.now().minusDays(1L),
    )

  val gv80 =
    PurchasedCar(
      "GV80",
      20000.0,
      "Hyundai",
      LocalDate.now().minusDays(2L),
    )

  gv70.printInformation()
  gv70.printPurchasedDate()

  gv80.printInformation()
  gv80.printPurchasedDate()

  gv70.compareTo(gv80)
}
