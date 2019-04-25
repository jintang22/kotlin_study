

fun main() {
	
	fun max(a: Int, b: Int) = if (a > b) a else b         // 1

	// fun min(a: Int, b: Int) = a < b ? a : b
	// 코틀린엔 삼항연산자가 없다.

	println(max(99, -42))

}

