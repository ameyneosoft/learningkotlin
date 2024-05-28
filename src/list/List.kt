package list

fun main(){
    var li = listOf(1,2,3)
//    li[0] = 4  Will give error because its immutable List

    // Can replace element in array
    var ar = arrayOf(1,2,4)
    ar[1] = 7

    // add/ remove /replace element
   var ml = mutableListOf(2,3,4)
    ml.add(5)
    ml.add(7)
    ml.remove(5)
    println(ml)

}