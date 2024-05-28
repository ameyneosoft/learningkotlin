package enumclasses

// when we want to assign value from particular set of values variable
// we use ENUM classes

fun main(){
    val day = Day.TUESDAY
    println(day)
    println(day.id)
    day.printValue()
    for(i in Day.entries){
        println(i)
    }
}

enum class Day(val id : Int){
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);
    fun printValue(){
        println("Day is $this")
    }
}

