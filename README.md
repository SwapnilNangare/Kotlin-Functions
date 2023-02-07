# Kotlin-Functions
Demo Application of Scope functions

Scoped functions are functions that execute a block of code within the context of an object. There are five scoped functions in Kotlin: let , run , with , also and apply. Let’s go through them one by one.
 Differences in these functions:
 
There are mainly two differences among these functions:
Way of referring to a context object (i.e. using either ‘this’ or ‘it’ keyword)
return value (i.e. returns either ‘context object’ or ‘lambda result’)



| Function Object |Reference | Return Value |
| --- | --- | --- |
| let | it | Lambda result |
| run | this| Lambda result |
| with | this| Lambda result |
| apply | this| Context object |
| also | it| Context object |

# 1 .let function
The let function has numerous applications, but it is generally used to prevent a NullPointerException from occurring. The let function returns the lambda result and the context object is the it identifier. Let’s consider the following example:

fun main (){ 

val name: String? = null

println(name!!.reversed)

println(name.length)

}
