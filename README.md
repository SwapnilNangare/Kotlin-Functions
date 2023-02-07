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
