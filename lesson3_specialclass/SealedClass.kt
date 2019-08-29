sealed class Mammal(val name: String)                                                   // 1

class Cat(val catName: String) : Mammal(catName)                                        // 2
class Human(val humanName: String, val job: String) : Mammal(humanName)

fun greetMammal(mammal: Mammal): String {
    when (mammal) {                                                                     // 3
        is Human -> return "Hello ${mammal.name}; You're working as a ${mammal.job}"    // 4
        is Cat -> return "Hello ${mammal.name}"                                         // 5     
    }                                                                                   // 6
}

fun main() {

    println(greetMammal(Cat("Snowy")))

	println(greetMammal(Human("jintae", "no job")))

	//println(greetMammal(Mammal("aaa")))
	//var a = Mammal("aaa")
	// sealed class 는 인스턴스화 할 수 없다.
}