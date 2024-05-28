package modifiers

fun main(){
    var b = B()
    b.method()
}
// by default all variables are public nin Kotlin
// top level declaration
open class A{
    public val p = 1
    internal val q = 2
    private val r = 3
    protected val s = 4
    fun aMethod(){
        println(p)
        println(q)
        println(r) //R cannot be accecesd
        println(s)
    }
}

class B : A(){
    fun method(){

    }
}


var  a = 30
// Visibility for Top Level Variables
// public -> everywhere
// internal -> accesible to the module
// private -> accessible only the file /
// protected -> CANNOT BE USED IN TOP LEVEL DECLARATION
//

// Visibility for data members in class
// public  - > everywhere
// internal -> same module
// protected -> subclasses
// private -> only to class