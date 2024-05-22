package arrays

fun main(){


    var arr1 = arrayOf("One", "Two", "Three");
    for (i in arr1){
        println(i)
    }
    for ((i, e) in arr1.withIndex()){
        println("$i -> $e")
    }
    arr1.set(2, "Four");
    println(arr1.get(2));
    val arr = arrayOf<Int>(3, 4, 5)
    for(i in arr){
        println(i)
    }

    for(c in arr1[2]){
        print(c)
    }
}