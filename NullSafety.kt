/**
 * Created by Anish Arya on 28-Jun-17.
 */
package Mark1

fun main(args: Array<String>){

    //var nullVal: String = null
    //by default we cannot assign null value
    //however we can still allow a null value using '?'
    var nullVal: String? = null
    println(nullVal)

    //function may also return null
    fun returnNull(): String?{
        return null
    }

    var nullVal3 = returnNull()

    //var nullVal3 = nullVal2!!length
    var nullVal4:String = returnNull()?: "No Name"      //?: ->Elvis Operator
    println(nullVal4)
}