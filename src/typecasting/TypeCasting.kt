package typecasting


fun main(){
    val objects : Array<Draggable> = arrayOf(Circle(6),Player("Amey"))
    for(obj in objects){
        // Since Circle implements Draggable is Circle won't show error
        // but is Test will show error
        if(obj is Circle){ // Smart Casting
            // Smart casting
            //  obj can call the method of circle does not have error in compilation
            obj.area()
        }else{
            // Typecasting
            // obj will start having access to player method
            (obj as Player).drag()
        }
    }

    val objs : Array<Any> = arrayOf(Circle(6), Player("Hemil"),Test());
    for(obj in objs){
        if(obj is Circle){
            obj.area()
        }else{
            // Throws ClassCastException
            (obj as Player).drag()
        }
    }

}

fun dragObjects(objs :Array<Draggable>){
    for(obj in objs)
        obj.drag()
}

interface Draggable {
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

class Test {

}