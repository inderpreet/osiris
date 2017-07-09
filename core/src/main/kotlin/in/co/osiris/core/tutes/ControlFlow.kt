package `in`.co.osiris.core.tutes

object ControlFlowRunner {

    fun run() {
        val cf = ControlFlow()
        println(cf.max1(1, 2))
        println(cf.max2(3, 4))
        println(cf.numberString(1))
        println(cf.isOneOrTwo(1))
        println(cf.isOneOrTwo(3))
        println(cf.checkValidity(2))
        println(cf.checkValidity(12))
        println(cf.checkValidity(22))
        println(cf.checkValidity(32))
        cf.simpleForLoop()
    }
}

class ControlFlow {

    // Conditional Expression
    fun max1(a: Int, b: Int): Int {
        if (a > b) {
            return a
        } else {
            return b
        }
    }

    // As an expression
    fun max2(a: Int, b: Int) = if (a > b) a else b

    // When Expression
    fun numberString(a: Int): String {
        when (a) {
            1 -> return "One"
            2 -> return "Two"
            3 -> return "Three"
            else -> return "I only know 1 to 3"
        }
    }

    // When Expression: Multiple conditions checked
    fun isOneOrTwo(x: Int): String {
        when(x) {
            1, 2 -> return "x is either 1 or 2. In fact it is $x."
            else -> return "x is not 1 or 2. In fact it is $x."
        }
    }

    fun checkValidity(x: Int): String {
        val validNumbers = 11..20
        when(x) {
            in 1..10 -> return "You are in the lower range. $x is within 1..10"
            in validNumbers -> return "You are in the higher range. $x is within 11..20"
            !in 1..20 -> return "You are out of bounds. $x is neither in lower nor higher range."
            else -> return "I don't know why you are here..."
        }
    }

    fun simpleForLoop() {
        val fruits = arrayListOf<String>("Apple", "Pear", "Banana")
        for (fruit in fruits) {
            println(fruit)
        }

        for ((index, value) in fruits.withIndex()) {
            println("the element at $index is $value")
        }
    }
}

