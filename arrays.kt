/**
 * Created by Anish Arya on 25-Jun-17.
 */
package Mark1

fun main(args: Array<String>)
{
    var myarray = arrayOf("Vicky","Arya","Anish")
    println(myarray[2])
    myarray[2]="Anish Arya"
    println("Array Length : ${myarray.size}")
    println("Vicky Is In Array : ${myarray.contains("Vicky")}")
    println(myarray)
    var partofarray = myarray.copyOfRange(0,1)
    println(partofarray)
    println("First Element: ${myarray.first()}")
    println("Last Element: ${myarray.last()}")
    println("Vicky's Index : ${myarray.indexOf("Vicky")}")

    val sqArray = Array(5,{ x -> x * x})
    println(sqArray[2])

    var arr2: Array<Int> = arrayOf(1,2,3,4,5,6)
    println(arr2)
}