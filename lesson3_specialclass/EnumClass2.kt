enum class Color(val rgb: Int) {                      // 1
    RED(0xFF0000),                                    // 2
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00);

    fun containsRed() = (this.rgb and 0xFF0000 != 0)  // 3

	// and 연산자 를 and 라고 한다...
}

fun main() {
    val red = Color.RED
    println(red)                                      // 4
    println(red.containsRed())                        // 5
    println(Color.BLUE.containsRed())                 // 6

	var a = 3
	
	if( a / 3 == 0 && a % 3 == 0 )
	{
		println("yaho")
	}
	else {
		println("yaho2")
	}
}