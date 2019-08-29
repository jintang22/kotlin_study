fun main() {

    val numbers = listOf(1, -2, 3, -4, 5, -6)      // 1

    val positives = numbers.filter { x -> x > 0 }  // 2

    val negatives = numbers.filter { it < 0 }      // 3



    println("$numbers")

    println("$positives")

    println("$negatives")

    val numbers2 = listOf(1, -2, 3, -4, 5, -6)     // 1

    val doubled = numbers2.map { x -> x * 2 }      // 2

    val tripled = numbers2.map { it * 3 }          // 3

    println("$numbers2")

    println("$doubled")

    println("$tripled")

}