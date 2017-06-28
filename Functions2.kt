/**
 * Created by Anish Arya on 27-Jun-17.
 */
package Mark1

/* NOTE :
   tailrec allows some algorithms that would normally be written using loops instead written using a recursive function,
   BUT WITHOUT  THE RISK OF OVERFLOW i.e, compiler optimises out the recursion, leaving behind a fast and efficient loop
   based version instead.
 */

fun main(args: Array<String>){
    println("Sum = ${getSum(1,2,3,4,5)}")

    val multiply = {num1: Int,num2: Int -> num1 * num2}     //function literals
    println("5 * 3 = ${multiply(5,3)}")

    println("5! = ${fact(5)}")
}
    //If the value argument in Java has an array type, it becomes a vararg parameter in Kotlin
fun getSum(vararg nums:Int) : Int {
    var sum = 0
    nums.forEach { n -> sum += n }
    return sum
}
    // factorial function
fun fact(x:Int) : Int{
    tailrec fun factTail(y:Int, z:Int) : Int{
        if(y==0) return z
        else return factTail(y-1,z*y)
    }
    return factTail(x,1)
}