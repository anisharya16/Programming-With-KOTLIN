/**
 * Created by Anish Arya on 26-Jun-17.
 */
package Mark1

fun main(args: Array<String>){
    val oneTo10 = 1..10                     //Produces Range Starting From 1 To 10
    val alpha = "A".."Z"                    //Ranges From A to Z

    println("2 in oneTo10: ${2 in oneTo10}")
    println("R in alpha: ${"R" in alpha}")

    val tenTo1 = 10.downTo(1)               // Counts From 10 to 1
    val twoTo20 = 2.rangeTo(20)             // Range Starting From Certain value to the end of the range
    val range3 = oneTo10.step(3)            // Starts counting with gap of 3

    for(x in range3) println("Range3 : $x")
    for(x in tenTo1.reversed()) println("Reverse: $x")
    for (x in twoTo20) println(x)
}