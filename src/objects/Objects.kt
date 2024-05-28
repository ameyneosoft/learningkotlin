package objects

fun main (){
    SharingWidget.display()
    SharingWidget.incrementTwitterLikes()
    SharingWidget.incrementFbLikes()
    SharingWidget.incrementFbLikes()
    SharingWidget.incrementFbLikes()
    SharingWidget.incrementTwitterLikes()
    SharingWidget.display()
    SharingWidget.function()

}

// Single Object
// Singelton Pattern
// no constructor (init can be used)
// can inherit class and interface

object SharingWidget : A(){
    private var twitterLikes = 0
    private var fbLikes = 0
    fun incrementTwitterLikes(){
        twitterLikes++
    }
    fun incrementFbLikes(){
        fbLikes++
    }
    fun display(){
        println("FB likes -${fbLikes} , Twitter Likes - ${twitterLikes}")
    }
}

open class A(){
    fun function(){
        println("Inside A fun")
    }
}