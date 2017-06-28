/**
 * Created by Anish Arya on 27-Jun-17.
 */
package Mark1

fun main(args: Array<String>){

    var list1:MutableList<Int> = mutableListOf(1,2,3,4,5)       //MUTABLE list
    val list2:List<Int>                                         //IMMUTABLE list

    list1.add(6)                                                //adding an item in the list

    println("1st Element: ${list1.first()}")                    //printing First element
    println("2nd Element: ${list1[1]}")                         //printing second element
    println("Last Element: ${list1.last()}")                    //printing last Element

    var list3 = list1.subList(0,3)                              //creating sublist
    println("Sublist of list1: $list3")

    println("Length : ${list1.size}")                           //printing the length of the list

    //list3.clear()                                               //clearing the list
    list1.remove(1)                                             // removing an item
    list1.removeAt(1)                                           // removing at certain position
    list1.forEach { n -> println("Mutable List: $n") }

}