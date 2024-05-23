package constructors

fun main(){
    val c1  = Car("seltos", "kia");
    val c2 = Car("alcazar", "hyundai", 7);
    println(c1.toString());
    println(c2.toString());

}

class Car(val name : String, val brand : String, val seatingCapacity : Int){
    // Secondary constructor is defined using keyword "constructor"
    // secondary constructor must call primary constructor
    // after colon ":"
    constructor(name : String, carManufacturer :String ):
        this(name,carManufacturer,5)

    override fun toString(): String {
        return "${this.name} , ${this.brand} , ${this.seatingCapacity} "
    }
}