/**
 * Created by Anish Arya on 27-Jun-17.
 */
package Mark1

fun main(args: Array<String>){
    val numList2 = 1..20

    val listSum = numList2.reduce{x ,y -> x+y}
    println("Reduce Sum :$listSum")

    val listSum2 = numList2.fold(5){x,y -> x+y}     //counting starts off from 5
    println("Fold Sum : $listSum2")

    println("Evens: ${numList2.any{it % 2 == 0}}")
    println("Evens: ${numList2.all{it % 2 == 0}}")

    val big3 = numList2.filter { it>3 }
    big3.forEach{n -> println(">3 : $n")}

    // map allows us to perform an action on every single item and then returns a new list
    val times7 = numList2.map{it*7}
    times7.forEach { n -> println("*7 : $n") }

}