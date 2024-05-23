package getterandsetter

fun main(){
    var p1 = Person("amey", 12)
    p1.age = -2
    println(p1.name)
//    p1.message = "I am amey"
    println(p1.message) // If accessecd without initialisation
    // will throw UninitializedPropertyAccessException
    //lateinit property message has not been initialized

}

class Person (nameParams : String, ageParams : Int){
    var name = nameParams
    get(){
        return field.toUpperCase()
    }
    var age = ageParams
        get() = field
    set(value){
        if(value < 0){
            println("Age cannot be -ve")
        }else{
           field = value
        }
    }

    lateinit var message :String
    // default getter and setter

}