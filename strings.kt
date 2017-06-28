/**
 * Created by Anish Arya on 19-Jun-17.
 */
package Mark1

fun main(args: Array<String>)
{
    val name = "Anish Arya"
    val longstr = """ This is a
long string"""              // multi-line string
    var fname: String = "Anish"
    var lname: String = "Arya"

    fname = "Vicky"

    var fullname = fname + " " + lname
    println("Name: $fullname")
    println("1 + 2 = ${1+2}")
    println("String length of longstr: ${longstr.length}")          // finding length of string

    var str1 = "A random string"
    var str2 = "a random string"

    println("String Equals: ${str1.equals(str2)}")                  // String1 equals String2
    println("Compare A To B: ${"A".compareTo("C")}")                //comparing two objects
    println("2nd Index: ${str1[2]}")                                // finding particular element of a string
    println("Index 2 - 7 : ${str1.subSequence(2,8)}")               // getting a sequence of a string
    println("contains random: ${str1.contains("random")}")          // contains an element in a string
}