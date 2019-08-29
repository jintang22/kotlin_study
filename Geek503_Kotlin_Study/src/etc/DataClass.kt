
data class Person(var name : String, var age : Int) {

    var address : String
    init {
        address = "GFC"
    }
}

val Person.email : String
    get() = "jintkim@ebay.com"

fun main() {

    val man1 = Person("jintkim", 35)
    val man2 = Person("jintkim", 35)
    man2.address = "Gangnam"

    println(man1.address)
    println(man1.email)
    println(man1)
    println(man1.hashCode())
    println(man2.hashCode())

}
/*


    println("man1's hashCode is ${man1.hashCode()}")

    val man2 = Person("abc", 15)

    println("man2's hashCode is ${man2.hashCode()}")

    man2.name = "jintkim"
    man2.age = 35

    println("man1's hashCode is ${man1.hashCode()}")
    println("man2's hashCode is ${man2.hashCode()}")



}

 */