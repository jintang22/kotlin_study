
/*
import java.io.File
import java.util.*

fun sadAvergage() {

    val fileInput = Scanner(File("input.txt"))

    val totalInput = fileInput.nextInt()

    //println(totalInput)

    for( i in 1..totalInput) {

        val totalPoint = fileInput.nextInt()
        val pointArray = ArrayList<Double>(5)

        for( j in 0..totalPoint-1) {
            pointArray.add(fileInput.nextDouble())
        }

        //println(pointArray.toString())

        printOverAverge(pointArray)

    }
}

fun printOverAverge(pointArray : ArrayList<Double>) {

    val average = getAverage(pointArray);

    //println("average = $average")

    var count : Double = 0.0;

    pointArray.forEach{
        if( it > average ) count++
    }

    //println("overaverage = $count")

    //println(pointArray.size)
    var overAverageRate = count / pointArray.size * 100
    //println("over average rate = $overAverageRate")

    overAverageRate = Math.round(overAverageRate*1000.0) / 1000.0;

    //println("over average rate = $overAverageRate")

    println(String.format("%.3f", overAverageRate)+"%")
}

fun getAverage(pointArray : ArrayList<Double>) : Double {

    var sum = 0.0;

    pointArray.forEach { sum+=it }

    //println("sum = $sum")

    return sum / pointArray.size
}*/