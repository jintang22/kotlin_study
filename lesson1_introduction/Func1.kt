fun printMessage(message: String): Unit {                               // 1
    println(message)
}

fun printMessage2(message: String) {                               // 1
    println(message)
}


fun printMessageWithPrefix(message: String, prefix: String = "Info") { // 2
    println("[$prefix] $message")
}

fun printMessageWithPrefixEx(message: String = "Log", prefix: String) { // 2
    println("[$prefix] $message")
}

fun sum(x: Int, y: Int): Int {                                          // 3
    return x + y
}

fun multiply(x: Int, y: Int) = x * y                                    // 4

fun main() {

	printMessage2("Hello")                                               

	//printMessageWithPrefixEx("yaho")
	printMessageWithPrefixEx(prefix = "yaho")

    printMessage("Hello")                                               // 5                    
    printMessageWithPrefix("Hello", "Log")                              // 6
    printMessageWithPrefix("Hello")                                     // 7
    printMessageWithPrefix(prefix = "Log", message = "Hello")           // 8
    println(sum(1, 2))                                                  // 9

	println(multiply(3,4))

	println(
		multiply(
			x = 3,
			y = 6
		)
	)


	println("$1")

	var x : Int
	x = 3
	println("$x")
	var xx : String
	xx = "$x"
	println("$$x")

	println(xx)
}