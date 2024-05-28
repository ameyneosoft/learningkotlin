package polymorphism

fun main(){

    // Polymorphism means parent reference can store child objects
    // Parent can call methods of child classes based on reference
    // Parent reference can only call method that are common

    // Advantages of Polymorphism
    // helps in maintainable and extensible code
    // helps in interacting objects using common interfaces

    // method name is same but it behaves differently based on the objects

    // circle is a shape IS- A relationship inheritance

    var myShape : Shape = Circle(2);
    println(myShape.area());

    myShape = Square(4);
    println(myShape.area());

    var shapes = arrayOf(Circle(6), Square(4),Square(2))
    calculateAreas(shapes)

    // Compiler will only allow to call method which are present in the class
    // or hierarchy of class
    println(myShape.toString())
}

open class Shape{
    open fun area() : Double{
        return 0.0
    }

    override fun toString(): String {
        return "I am in Shape"
    }
}

class Circle(val radius : Int) : Shape(){
    override fun area(): Double {
        return Math.PI * radius * radius
    }
}

class Square(val side : Int) : Shape(){
    override fun area(): Double {
        return  (side * side).toDouble()
    }
}
fun calculateAreas(shapes : Array<Shape>){
    for(shape in shapes){
        println(shape.area())
    }
}

