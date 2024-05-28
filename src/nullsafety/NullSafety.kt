package nullsafety

fun main(){
    var str1 : String?= "Male"
    val str2 : String? = null
    val bool : Boolean? = null
    println(str2)

    // Safe call operator
    println(str1?.uppercase())

    str1?.let { // No need to use safe call operator in let
        println("upper case value is ${str1.uppercase()}")
    }
    str2?.let { // "it" also refers to the value on which safe operator is applied
        println("upper case value is ${it.uppercase()}")
    }
    // If we want to assign a default value to variable  in case of null
    // we use Elvis operator "?:"
    var myvar: String = str2?: "NA"
    println(myvar)
    // if we want to throw exception if its null and work as expected in non -null
    // use of  not null asserted operator "!!"

    var v1 : String = str1!!.lowercase()
    var v2 : String = str2!!.uppercase() // will throw null pointer exception
    println(v1)
    println(v2)
}
