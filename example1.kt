/**
 * Created by Anish Arya on 19-Jun-17.
 */
package Mark1

fun main(args : Array<String>)
{
    println("Hello World!")

    val name = "Anish"          // Immutable Value [CANNOT BE CHANGED]
    var age = 21                // Mutable Value [CAN BE CHANGED]

    println("Name: $name")
    println("Age: $age")

    var BigInt: Int = Int.MAX_VALUE            // Gives Max Value for Integer
    var SmallInt: Int = Int.MIN_VALUE          // Gives Min Value For Integer

    println("Largest Integer is:" + BigInt)
    println("Smallest Integer is: $SmallInt") //String Interpolation. We Use $ sign for this.

    var ex1: Double = 1.1111111111111111
    var ex2: Double = 1.1111111111111111
    println("Sum is:" + (ex1 + ex2))

    var lettergrade: Char = 'A'
    println("A is a char: ${lettergrade is Char}")

    // TYPECASTING
    println("3.14 to Integer: " + (3.14.toInt()))
    println("A to Int: " + 'A'.toInt())
    println("65 to char: " + 65.toChar())


}