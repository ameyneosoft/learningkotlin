package classesandobjects

class Car(val  name : String, val kms : Int, val  fuelType  : String){
    fun drive(){
        println("$name is moving");
    }

    fun fillFuel(){
        println("$fuelType is being filled in $name")
    }
}

fun main(){
    var i20 = Car("i20", 200, "Petrol");
    var swift = Car("swift", 500, "Diesel")

    swift.fillFuel();
    i20.drive();
    println(i20.kms);
}