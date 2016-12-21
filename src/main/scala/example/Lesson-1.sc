
// Variables, Standard Types, Inference, Vars, lazy, OOP
val x = 5


// Tuples, Lists - accessing elements, length, Map,



// If expressions, for loops, sum with var, blocks
if(x <= 0) -x else x

for(i <- 0 to 3) println(i)

// Simple functions, abs, max
def greet() = "Hello!"

// EXERCISE: Write add, sum function









// Advanced: recursion, fibonacci, nested

def fibLoop(n:Int, prev:Int, cur:Int):Int = ???

// EXERCISE: Write factorial
def factorial(number: Int, accumulator: Int) : Int = ???





// Default parameters - add, polymorphic, higher order functions



def applyTwice(x:Int, f: Int => Int) = ???

// EXERCISE: Define functions f1: x + 3, f2 : x * 5 and call applyTwice

//applyTwice polymorphic

//def compose


// EXERCISE: Write recursive,nested isSorted function.
// Hint: Compare each element up to the length of the list.
def isSorted[A](xs: List[A], gt: (A,A) => Boolean): Boolean = ???
