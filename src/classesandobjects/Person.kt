package classesandobjects

fun main(){
    val i : Int = 20;
    println(i.plus(30));
    println(i.toFloat());

    val p1 : Person= Person("A", 17);
    println(p1.canVote());
    p1.age = 22
    println(p1.canVote());

}
// Primary Constructor
class Person( var name : String, var age :Int){
    fun canVote() : Boolean{
        return age >18
    }
}