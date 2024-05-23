package inheritance

fun main(){
    var c = Child()
    // while creating object parent constructor is called 1st then child
    c.myMethod1()
    c.myMethod2()

}
 // open keyword must be present in clas declaration to make it inheritable
open class Parent {
     init{
         println("Parent contractor  called")
     }
     var name: String = "";
     fun myMethod1(){
         println("parent method is invoked")
     }
}
 // A class can inherit only one class
class Child : Parent(){
    init {
        println("Child class constructor called")
    }
    var name2 :String ="";
    fun myMethod2(){
        println("method from child class")
    }
}
