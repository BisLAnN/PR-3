import java.util.*
import kotlin.math.sqrt

fun main() {

     //1
    val myAge : Int = 18
    val isTeenager =  myAge >= 13 && myAge <=19


    //2
    val theirAge: Int = 30
    val bothTeenager = theirAge >= 13 && theirAge <=19 && isTeenager


    //3
    val reader: String ="Бислан"
    val author: String = "Richard Lucas"
    val authorlsReader = reader == author


    //4
    val readerBeforeAuthor = reader<author


    //5
    val myAge2 : Int = 18
    if (myAge2>=13 && myAge2<=19) println("Подросток")
    else println("Не подросток")


    //6
    val answer = if (myAge >= 13 && myAge <= 19) println("Подросток")
    else println("Не подросток")


    //7
    var counter : Int =0
    while (counter<10) {
        println("X= $counter")
        counter +=1
    }


    //8
    counter = 0
    var roll : Int = 0
    do {
        roll == Random().nextInt(6)
        counter += 1
        println("После $counter бросков, roll равен $roll")
    } while (counter != 0)


    //9
    val range : IntRange = 1..10
    for ( i in range){
        val square = i*i
        println(square)
    }


    //10
    for (i in range){
        val squareRoot = sqrt(i.toDouble())
    }


    //11
    var sum: Int = 0
    for (row in 1 until 8 step 2) {
        for (column in 0 until 8) {
            sum += row * column
        }
    }
    println(sum)
}