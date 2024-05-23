package constructors

fun main(){
    val car : Automobile = Automobile("Car", 4, 5);
    println("tyres ${car.tyres} maxSeating ${car.maxSeating}")

    val st1 = Student();
    // default values
    println("name- ${st1.name} age - ${st1.age} canVote - ${st1.canVote}")

    st1.name = "StudentA"
    st1.age =22;
    println("name- ${st1.name} age - ${st1.age} canVote - ${st1.canVote}")


}


// parameters with var / val will be properties of class
// other parameters will be arguments to constructor functions
class Automobile(var name :String, var tyres : Int, noOfSeating : Int){
    var maxSeating :Int = noOfSeating;

}
// Constructor assigns default value to the object
class Student(){
    // init block will be invoked during creation of object
    init{
        println("Student created")
    }

    // Properties of objects must be initialed in kotlin while creation
    var name : String =""
    var age : Int = 0;
    var canVote : Boolean = age >= 18
    // can have multiple init , will execute in order
    init{
        println("2nd init block invoked")
    }
}
