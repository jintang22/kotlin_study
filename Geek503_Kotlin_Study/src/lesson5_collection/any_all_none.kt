

fun main() {

    val numbers = listOf(1, -2, 3, -4, 5, -6)            // 1

    val anyNegative = numbers.any { it < 0 }             // 2

    val anyGT6 = numbers.any { it > 6 }                  // 3

    println("$anyNegative")

    println("$anyGT6")


    val allEven = numbers.all { it % 2 == 0 }            // 2

    val allLess6 = numbers.all { it < 6 }                // 3

    println("allEvent = $allEven")

    println("allLess6 = $allLess6")

    val noneEven = numbers.none { it % 2 == 0 }           // 2

    val noneLess6 = numbers.none { it < 6 }              // 3

    println("noneEven = $noneEven")

    println("noneLess6 = $noneLess6")




}