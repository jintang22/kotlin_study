

fun main() {


    val numbers = listOf(1, -2, 3, -4, 5, -6)            // 1

    val totalCount = numbers.count()                     // 2
    val evenCount = numbers.count { it % 2 == 0 }        // 3

    println("$totalCount")
    println("$evenCount")

    val eventCount2 = numbers.filter { x -> 0 == x % 2 }.count()

    println("$eventCount2")

}