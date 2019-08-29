fun rentPrice(standardDays: Int, festivityDays: Int, specialDays: Int): Unit {  //1

    val dayRates = object {                                                     //2
        var standard: Int = 30 * standardDays
        var festivity: Int = 50 * festivityDays
        var special: Int = 100 * specialDays
    }

    val total = dayRates.standard + dayRates.festivity + dayRates.special       //3

    print("Total price: $$total")                                               //4

}

object DoAuth {                                                 //1 

	var a = 0

    fun takeParams(username: String, password: String){         //2 
        println("input Auth parameters = $username:$password")
		a++;
    }
}

class BigBen {                                  //1 
    companion object Bonger {                   //2
        fun getBongs(nTimes: Int) {             //3
            for (i in 1 .. nTimes) {
                print("BONG ")
            }
        }
    }
}


fun main(){
    DoAuth.takeParams("foo", "qwerty")                          //3

	var a = DoAuth;
	a.takeParams("dd", "aa")

	println(a.a)

	var b = DoAuth;
	b.takeParams("33", "44")

	var c = DoAuth;

	println(c.a)

    rentPrice(10, 2, 1)                                                         //5

	println()
	println()

	BigBen.getBongs(12)

	println()

	BigBen.Bonger.getBongs(343)

}