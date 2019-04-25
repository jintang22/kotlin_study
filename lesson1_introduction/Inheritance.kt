open class Dog {                // 1

	open val type = "Dog"

    open fun sayHello() {       // 2
        println("wow wow!")
    }
}

class Yorkshire : Dog() {       // 3	

	override val type = "York"

	override fun sayHello() {   // 4
        println("wif wif!")
    }
	
}

fun main() {
    val dog: Dog = Yorkshire()
    dog.sayHello()

	println(dog.type)
}