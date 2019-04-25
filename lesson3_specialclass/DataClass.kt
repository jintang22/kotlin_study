
data class User(var name: String, val id: Int)            // 1

fun main() {
    val user = User("Alex", 1)
    println(user)                                          // 2

    val secondUser = User("Alex", 1)
    val thirdUser = User("Max", 2)

    println("user == secondUser: ${user == secondUser}")   // 3
    println("user == thirdUser: ${user == thirdUser}")

    println(user.hashCode())                               // 4
	println(secondUser.hashCode())
    println(thirdUser.hashCode())

    // copy() function
    println(user.copy())                                   // 5
    println(user.copy("Max"))                              // 6
    println(user.copy(id = 2))                             // 7
    
    println("name = ${user.component1()}")                 // 8
    println("id = ${user.component2()}")
	// data class 의 첫번째 값 부터 component N 으로 함수가 자동 생성된다.

	var user2 = user.copy()
	user.name = "Alex2"
	
	println( "user2 = $user2")
	println( user2.hashCode() )
	println( user2.toString() )

	//var (name, id) = user;

	var (a, asdf) = user;

	println("namename : = $asdf")
}