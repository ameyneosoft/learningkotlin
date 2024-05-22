package functions

import kotlin.math.pow

fun printHello(count : Int = 4){
    for(i in 1..count)
        println("Hello")
}


fun main() {
// 	printHello();
    // Function overloading
    println(addition(b =3, a =4)) // Named Arguments
    println(addition(3.0, 3.4))



    //HOC

    var myFun  :(a : Int, b :Int) -> Int = :: addition
    myFun(1, 3);
    myFun = :: multiply
    myFun( 4, 3 )
    var x :Any = 33
    println(x)
    x = arrayOf(1,2,4)
    println(x)

}



fun addition(a : Double, b : Double) : Double {
    return a+b
}

fun addition(a : Int, b: Int):Int {
    println("value of a is $a and b is $b")
    return a + b
}

fun multiply(a : Int, b : Int) : Int{
    println("value of a is $a and b is $b")
    return a * b
}