package `in`.co.osiris.core.tutes

object ClassesRunner {

    fun run() {
        // In this case, a Person would be created with age 21 and with no name. And name cannot be set later on ;)
        val aPerson = Person(21)
        println(aPerson.toString())

        // Well, in this case, age can be set after the person has been created.
        val anotherPerson = Person("Amarjeet")
        anotherPerson.age = 47
        println(anotherPerson)
    }
}

// Class with a Primary constructor

class Person(val firstName: String) {

    var age: Int

    init {
        // Do anything here if you want to, when an object of this class is constructed using the Primary c'tor.
        age = 0
    }

    // Note how the primary constructor is being called with an empty string
    constructor(age: Int = 0) : this("") {
        this.age = age
    }

    override fun toString(): String {
       return "firstName: $firstName, age: $age"
    }
}

// Inheritance and Overrides

open class Base(p: Int) {
    open fun v() {
        println("v() from Base")
    }
}

class Derived(p: Int) : Base(p) {
    override fun v() {
        println("v() from Base")
    }
}

// Yet another style
open class AnotherBase {
    constructor(x: Int)
}

class AnotherDerived : AnotherBase {
    constructor(x: Int) : super(x)
}