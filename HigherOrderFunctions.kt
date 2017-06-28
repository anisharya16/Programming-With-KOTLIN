/**
 * Created by Anish Arya on 27-Jun-17.
 */
package Mark1

fun main(args: Array<String>){
    // we want to use a filter which is going to be a collection operator, to find even values in a range
    val numList = 1..20
    val evenList = numList.filter{it % 2 == 0}
    /*If a function Literal has only one parameter, we might remove it's declaration,
    alongwith -> and it's name will bi "it"
     */
    evenList.forEach{n -> println(n)}

    //Call a function that would dynamically return a created function
    val mult3 = makeMathFunc(3)
    println("5 * 3 = ${mult3(5)}")

    //Function which is going to recieve a list and a function to use upon that list
    val multiply2 = {num1:Int -> num1*2}
    val numList2 = arrayOf(1,2,3,4,5)

    mathOnList(numList2,multiply2)
}

fun makeMathFunc(num1:Int) : (Int) -> Int = {num2 ->num1*num2}

fun mathOnList(numList: Array<Int>, myFunc:(num:Int) -> Int){
    for(num in numList){
        println("MathOnList ${myFunc(num)}")
    }
}