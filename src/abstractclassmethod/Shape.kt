package abstractclassmethod

fun main (){
    // we cannot create instance of abstract class
    var circle  = Circle(2)
    println(circle.area())
}
// abstract class can have abstract and non-abstract method
abstract class Shape{
    // abstract method does not have method body
    // abstract method are open by default no need of declaring open
    // abstract method must be in abstract class
    abstract fun area() : Double
}

class Circle( val radius : Int) : Shape(){
    override fun area(): Double {
        return Math.PI * radius * radius
    }
}