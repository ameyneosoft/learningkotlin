package override

fun main(){
    val mob = Mobile("General")
    mob.display()
    val op = OnePlus("SmartPhone")
    op.display()
    op.switchOff()
    println(op.size)
    println(op.type)

    // Every class is a subclass of Any Class
    // Inside any class there are 3 open methods - toString, equals, hashCode
    println(op.toString())
}

open class Mobile(val type : String){
    // if you want to override property/ method it must be declared
    // open
    open var name : String = "Mobile"
    open var size : Int = 5
    open fun display() = println("Mobile is displaying")
    fun powerOff() = println("Shutting down")

}

// Subclass must invoke  superclass constructor
class OnePlus(typeParam : String) : Mobile(typeParam){
    override var name :String = "OnePlus"
    override var size =6
    override fun display() = println("OnePlus is displaying")
    fun switchOff() {
        // to access methods of super class one can access by super keyword
        super.powerOff()
    }

    override fun toString(): String {
        return "OnePlus(name='$name', size=$size)"
    }

}