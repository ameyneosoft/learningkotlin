package constructors

fun main(){
    // if no -constructor is created
    // kotlin will calls automatically default constructor
    // which has no parameters Parameterless constructor
    val calculator = Calculator();
    println(calculator.add(1, 2))
    println(calculator.multiply(2,3))

}

// No constructor in calculator class
class Calculator {
    //  you can initialise variable after creation of object
    // using lateinit
    // it must be var and cannot be float , Integer,  Boolean
    lateinit var message :String ;
    fun add (a :Int, b :Int) : Int{
        return a+b
    }
    fun multiply(a : Int, b : Int) : Int{
        return a*b
    }
}