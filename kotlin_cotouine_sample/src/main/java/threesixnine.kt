
fun print369(paramNumber: Int) {
    if (paramNumber <= 0) {
        println("게임 안하니?")
        return
    }else{
        println("게임시작 ! ")

        val str = "3 : 짝, 6 : 짝, 9 : 짝"
        val target = "9"
        val target_num = str.indexOf(target)
//        println(target_num)


        var start =0
        while (paramNumber > start) {
            start++
            print("${game(start)} ")
        }
    }


}


fun game(count: Int): String {

    var clapCount = 0;
    var a = count.toString();
    a.forEach {
        when (it) {
            '3', '6', '9' -> clapCount++;
        }
    }

    var retStr = "";

    if( 0 == clapCount )
        retStr = count.toString()
    else {
        for( i in 1 .. clapCount) {
            retStr += "짝"
        }
    }
    return retStr;
}