/**
 * Created by Anish Arya on 27-Jun-17.
 */
package Mark1

fun main(args: Array<String>){
    fun add(num1: Int, num2: Int): Int = num1 + num2            // One line function
    println("5 + 4 : ${add(4,5)}")

    fun subtract(num1: Int = 2, num2: Int = 1) = num1 - num2    // one line function doesn't need a return value
    println(subtract())
    println("5 - 4 : ${subtract(5,4)}")

    println("4 - 5 : ${subtract(num2 = 5, num1 = 4)}")          // parameterized function

    fun sayHello(name :String) : Unit = println("Hello $name")
    sayHello("Anish")                           //Function not having any return value uses "Unit" instead "void"

    val(two,three) = nextTwo(1)
    println("1 $two $three")
}
fun nextTwo(num: Int) : Pair<Int,Int>
{
    return Pair(num+1,num+2)
}