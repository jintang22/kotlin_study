


fun main() {

	var neverNull: String = "This can't be null"            // 1

	//neverNull = null                                        // 2
	// nullable 불가능 
	// nullable 하려면 ? 가 필요

	var nullable: String? = "You can keep a null here"      // 3

	nullable = null                                         // 4

	var inferredNonNull = "The compiler assumes non-null"   // 5

	// 기본은 nullable 이 아님
	//inferredNonNull = null                                  // 6

	fun strLength(notNull: String): Int {                   // 7
		return notNull.length
	}

	fun strLength(a : String?) : Int? {
		return a?.length
	}

	println(strLength(neverNull))                                    // 8
	println(strLength(nullable))                                    // 9
}