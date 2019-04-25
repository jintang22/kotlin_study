

fun main() {
	
	fun printAll(vararg messages: String) {                            // 1
		for (m in messages) println(m)
	}
	printAll("Hello", "Hallo", "Salut", "Hola", "你好")                 // 2

	fun printAllWithPrefix(vararg messages: String, prefix: String) {  // 3
		for (m in messages) println(prefix + m)
	}
	printAllWithPrefix(
		"Hello", "Hallo", "Salut", "Hola", "你好",
		prefix = "Greeting: "                                          // 4
	)

	fun log(vararg entries: String) {
		printAll(*entries)                                             // 5
		
		//At runtime, a vararg is just an array. To pass it along into a vararg parameter,
		// use the special spread operator * that lets you pass in *entries (a vararg of String)
		// instead of entries (an Array<String>).
	}
	fun printAll2(strArray : Array<out String>) {
		for ( m in strArray ) {
			println(m)
		}
	}

	fun log2(vararg entries: String) {

		printAll2(entries)                                             
	}


	log("this", "is", "log")
	log2("this", "is", "log2")
}