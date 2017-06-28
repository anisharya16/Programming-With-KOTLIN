/**
 * Created by Anish Arya on 27-Jun-17.
 */
package Mark1

fun main(args: Array<String>){
    val divisor = 0
    try {
        if (divisor == 0) {
            throw IllegalArgumentException("Can;t Divide By Zero")
        } else {
            println("5/$divisor = ${5 / divisor}")
        }
    }   catch(e:IllegalArgumentException){
            println("${e.message}")
        }
}