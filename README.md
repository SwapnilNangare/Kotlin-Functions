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

  var name: String? = null
  
  var name_1: String? = "hello"

    name_1?.let {
       
        println(it.reversed())
       
       println(it.length)
    }

}

# 2 .with function

The with function has a return type as the lambda result, and the context object is the this keyword, which refers to the object itself. Let’s consider the example in the code snippet below

class Person{

   var firstName: String = "Elena Wilson"

var age: Int = 28
}
fun main() {

  val person = Person()

 println(person.firstName)

println(person.age)

}

In the code snippet above, we created a Person class and assigned some properties, firstName and age. Next, in our main function, we printed out the values using println, which is used for cli output.

Let’s imagine that we had over twenty properties in the Person class, which would result in multiple code repetitions. We can correct this by using the with function and passing the person object in the lambda expression using the this keyword:


The context object here refers to the person object on which the operation is performed. The return value of the with function is a lambda result. Imagine we decide to add ten years to the age and store the value in a variable called personInfo, which is of the type integer:

val person = Person()

val personInfo : String = with (person) {

println(this.firstName)
 
 println(this.age)
 
 age + 10

"I love the game of football"

}

println(personInfo)

}

# 3. run function

The run function returns the lambda result, and we refer to the context object by using the this keyword. The run function is a combination of the with and let functions. Let’s consider the example in the code snippet below:

fun main {

val person: Person? = Person()

val bio = person?.run {

println(name)

println(age)

"LogRocket rocks!!!"

}

println(bio)

}

Assuming we decide to assign a null value to the person object, we’d have to prevent a NullPointerException from occurring. We can achieve this by calling the run function with the person object. Next, we’ll return the lambda function bio

# 4.apply function

apply is a higher order function. The apply function returns a context object, and the context object returns this. Let’s consider the following example:

val car = Car()

  var carName: String = ""

var carColor: String = ""

fun main {

 val car = Car().apply {
 
 carName = "Lamborghini"
 
 carColor = "Navy blue"
 
 }
 # 5.also function
 The also function is similar to the previous functions in that it is used to perform an operation on a particular object after it has been initialized. The also function returns the context object, and the context object can be referred to using the it identifier. Let’s refer to the code snippet below for further detail:

fun main(){

val numberList: mutableList<Int> = mutableListOf(1,2,4,5)
    
 numberList.also{
 
println("The list of items are: $numberList")

numberList.add(6)

 println("The list of items after adding an element are: $numberList")

 numberList.remove(4)

println("The list of items after removing an element are: $numberList")
 
 }

 }
From the code above, we created a numbersList object with five integer values and performed some operations under the numbersList object. We then utilized the also function. Note that in the also function, we can refer to the numberList by using the it identifier, as seen in the code snippet below:

fun main(){

val numberList: mutableList<Int> = mutableListOf(1,2,4,5)
 
 val multipleNumbers = numberList.also {

 println("The list of items are: $it")

it.add(6)

 println("The list of items after adding an element are: $it")

it.remove(4)

 println("The list of items after removing an element are: $it")
 
 }

 println("The original numbers are: $numberList")

 println("The multipleNumbers are: $multipleNumbers)

 }
Another way to implement the also function is using the it and also keywords like in the code snippet below. We use the also function to modify the value of the firstName variable by assigning Eden Peter to it:

fun main {

 val person = Person().apply {

 firstName = "Eden Elenwoke"
 
 age = 22
 
 }
 
 with(person){
 
 println(firstName)
 
 println(age)
 
 }

person.also{
 
 it.firstName = "Eden Peter"

 println("My new name is: + ${it.firstName}")
 
 }

 }

 
 
 
}
 
 with(car){
 
 println(carName)
 
 println(carColor)
 
 }
