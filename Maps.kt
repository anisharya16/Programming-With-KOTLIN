/**
 * Created by Anish Arya on 27-Jun-17.
 */
package Mark1

fun main(args: Array<String>){
    val map = mutableMapOf<Int,Any?>()          //mutable list
    val map2 = mutableMapOf(1 to "Anish",2 to 42)

    map[1]="Vicky Arya"
    map[2]=22

    println("Map: $map")
    println("Map2: $map2")
    println("Map Size: ${map.size}")

    map.put(3,"India")
    map.remove(2)
    for((x,y) in map){
        println("Key: $x Value: $y")
    }
}