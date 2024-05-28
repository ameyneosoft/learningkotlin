package dataclasses

fun main(){
    val p1 = Person(1, "John")
    val p2 = Person(1, "John")
    // data classes doesn't have functions/ behaviour
    println(p1)
    println(p2)
    println(p1.hashCode())
    println(p1 == p2)
    // output before declaring data class
//    dataclasses.Person@448139f0
//    dataclasses.Person@7cca494b
//    1149319664
//    false

    // data class automatically writes hashcode , toString and equals method

//    Person(id=1, name=John)
//    Person(id=1, name=John)
//    2314570
//    true

    val p3 = p1.copy(id = 3) // sets he passed data and copies other data
    println(p3)
    // component1 ,2 will give its attributes serially
    println(p3.component1())
    println(p3.component2())

    // object destructuring internally calls component1 and component 2
    val (id , name) = p1
    println(id)
    println(name)
}

data class Person(val id :Int, val name : String){

}