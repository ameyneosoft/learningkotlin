package companion

fun main(){
    // With companion class can directly access the members of the companion object
    // Only one companion mode be created
    println(Kia.Telluride.platform)
    println(Kia.platform)
}

class Kia{
    var country = "Korea"
    var owner = "Hyundai"
    //
    companion object Seltos{
        var platform = "K2"
        var chasis = "monocoque"

    }

    object Telluride{
        var platform = "K1"
        var chasis = "Ladder Frame"
    }
}