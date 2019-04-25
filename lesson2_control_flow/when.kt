


fun main() {
    cases("Hello")
    cases(1)
    cases(0L)
    cases(MyClass())
    cases("Hello")

	var hello = "Hello"

	if( hello == "hello" || hello == "Hello" ) {
		println("hello is string or hell !is Int")
	}
}

fun cases(obj: Any) {                                // 1
    when (obj) {
        1 -> println("One")                          // 2
        "Hello" -> println("Greeting or IS string")               // 3
        is Long -> println("Long")                   // 4
        !is String -> println("Not a string")        // 5
		is String -> println("Is String")
		false -> println("false");
        else -> println("Unknown")                   // 6
    }   
}

class MyClass