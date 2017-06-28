/**
 * Created by Anish Arya on 27-Jun-17.
 */
package Mark1

fun main(args: Array<String>){
    val bowser = Animal("Bowser",20.0,13.5)
    bowser.getInfo()

    val BlackBeard = Dog("BlackBeard",22.0,14.5,"Sherlock")
    BlackBeard.getInfo()

    val tweety = Bird("Tweety",true)
    tweety.fly(10.0)
}
    //Class
open class Animal(val name: String, var height: Double, var weight: Double) {
    init {
        val regex = Regex(".*\\d+.*")
        require(!name.matches(regex)) { "Animal name can't contain numbers" }
        require(height > 0) { "Height must be greater than 0" }
        require(weight > 0) { "Weight must be greater than 0" }
    }

    open fun getInfo(): Unit {
        println("$name is $height tall and weighs $weight")
    }
}
    //Inheritance
class Dog(name: String,height: Double,weight: Double, var owner: String): Animal(name,height,weight){
        override fun getInfo(): Unit {
            println("$name is $height tall and weighs $weight and owned by $owner")
        }
}
    //Interface
interface Flyable{
    var flies:Boolean
    fun fly(distMiles:Double): Unit
}

class Bird constructor(val name: String, override var flies: Boolean = true) : Flyable{
    override fun fly(distMiles: Double): Unit{
        if(flies){
            println("$name flies $distMiles")
        }
    }
}