package intefaces

// Group objects on basis of behaviour not on the type of objects
// to use polymorphism in different classes

// Interface is a contract which states that whoever implements the interface must
// provide implementation for  the behaviour/methods
// Interface can have abstract as well as concrete method

fun main(){
    var objects = arrayOf(Circle(6),Player("Amey"))
    dragObjects(objects)
}

fun dragObjects(objs :Array<Draggable>){
    for(obj in objs)
        obj.drag()
}

interface Draggable {
    // by default method in interfaces are abstracts
    fun drag()

}
abstract class Shape :Draggable{
    open fun area() : Double{
        return 0.0
    }

}

class Circle(val radius : Int) : Shape(){
    override fun area(): Double {
        return Math.PI * radius * radius
    }

    override fun drag() {
        println("Circle is dragging")
    }
}

class Player(val name:String) : Draggable{
    override fun drag() {
        println("Player is dragging")
    }
}