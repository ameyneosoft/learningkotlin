package exceptionhandling

fun main (){
    var arr : IntArray = IntArray(6){0}
    try {
//        println(arr[9])
    }catch (e : Exception){
        println("Something went wrong")
    }

    finally {
        println("I will run anyhow")
    }


    // try should always come either with catch or finally
    try{

    }catch (e : Exception){
    }

    try {

    }finally {

    }
    createUsers(2)
    createUsers(-1)
}

fun createUsers ( count : Int){
    if(count <= 0){
        throw IllegalArgumentException()
    }else{
        println("$count users created")
    }
}

