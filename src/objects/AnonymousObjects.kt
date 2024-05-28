package objects
//
fun main(){
    // Anonymous object  , here only 1 object is created
    // Object Expression
   val testObj = object {
       var name = "Amey"
       fun namePrinter(){
           println("Name - $name")
       }
   }
   testObj.namePrinter()

    var cloner  = object : Cloneable {
         override fun clone(){
            println("Cloneable implementation in cloner")
        }
    }
    cloner.clone()

    var myObject = object :Person("Amey"){
        override fun myFullName() {
            println("My name from object is $name")
        }
    }
    myObject.myFullName()


}

open class Person(val name: String){
    open fun myFullName(){
        println("My Full Name is $name")
    }
}

interface Cloneable {
    fun clone()
}

class AnyClass {

}