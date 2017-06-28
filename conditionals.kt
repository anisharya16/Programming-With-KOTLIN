/**
 * Created by Anish Arya on 26-Jun-17.
 */
package Mark1

fun main(args: Array<String>){
    val age = 8
    if(age<5)
    { println("Go To Preschool") }
    else if ( age == 5 )
    { println("Go to Kindergarden") }
    else if ((age>5) && (age<17)) {
        val grade = age - 5
        println("Go to grade $grade")
    }
    else
    { println("Go to college") }
    val age_new = 7
    when(age_new){
        0,1,2,3,4 -> println("Go to preschool")
        5 -> println("Go to kindergarden")

        in 6..17 ->{
            val grade = age_new-5
            println("Go to grade $grade")
        }
        else -> println("Go to college")
    }
}