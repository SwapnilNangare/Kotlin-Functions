package com.example.scopefunctions

fun main() {
    val scope = ScopedFunctions()
    scope.age = 25
    scope.name = "Swapnil"


     //1 .apply -> it

//    var emp = scope.apply {
//        name = "Swapnil"
//        age = 25
//    }
//    println(emp)

    //2.let -< scope return value is last statement value


//    var x = scope.let {
//        println(it.age)
//        println(it.name)
//        //"Hello"
//    }
//    println(x)

    // 3.with  this -> directly access the property, scope return value is last statement value
    var a = with(scope) {
        age = 22
        name = "Akash"

    }
    println(a)
//
//    // 4 run -> scope return value is last statement value
//   var m = scope.run {
//        age = 35
//        name = "PQR"
//    }
//    println(m)


}


data class ScopedFunctions(var name: String = "", var age: Int = 18) {

    /* Scoped functions are functions that execute a block of code within the context of an object.
     There are five scoped functions in Kotlin: let , run , with , also and apply. Let’s go through them one by one.
     Differences in these functions:

** There are mainly two differences among these functions:
Way of referring to a context object (i.e. using either ‘this’ or ‘it’ keyword)
return value (i.e. returns either ‘context object’ or ‘lambda result’)

Function Object | Reference | Return Value
                |           |
let             | it        | Lambda result
run             | this      | Lambda result
with            | this      | Lambda result

apply           | this      | Context object
also            | it        | Context object    */


}