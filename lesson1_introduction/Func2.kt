fun main() {

	infix fun Int.times(str: String) = str.repeat(this)        // 1
	println(2 times "Bye ")                                    // 2

	println("yaho".repeat(3))

	val pair = "Ferrari" to "Katrina"                          // 3
	println(pair)

	infix fun String.onto(other: String) = Pair(this, other)   // 4
	val myPair = "McLaren" onto "Lucas"
	println(myPair)

	val sophia = Person("Sophia")
	val claudia = Person("Claudia")
	sophia likes claudia                                       // 5

	print("she's name : ")
	println(sophia.name)

	infix fun String.print(lf : Int) = println(this)

	"yaho" print 1

                                      // 4
}

class Person(val name: String) {
  val likedPeople = mutableListOf<Person>()
  infix fun likes(other: Person) { likedPeople.add(other) }  // 6
}
