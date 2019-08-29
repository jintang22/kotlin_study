fun main () {


    val numbers = listOf(1, 2, 3)
    val empty = emptyList<Int>()

    println("Numbers: $numbers, min = ${numbers.min()} max = ${numbers.max()}") // 1
    println("Empty: $empty, min = ${empty.min()}, max = ${empty.max()}")        // 2


    // list 는 mutableList로 타입이
    val aa = mutableListOf<Int>()
    //aa = mutableListof<Int>()

    aa.add(3)

    println("Empty: $aa, min = ${aa.min()}, max = ${aa.max()}")        // 2

}