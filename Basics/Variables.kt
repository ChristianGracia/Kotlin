fun main() {
    // var signifies declared variable is mutable
    var todaysDate: String = "01/19/2022"
    println(todaysDate)

    // val signifies declared variable is immutable
    val pi: Double = 3.14
    println(pi)

    // compiler can infer type based on initialized value but if mutating the var, the new value must be the same type as initalized value
    var typeTest = 6
    print("${typeTest::class.simpleName}")

    // String - double quotes - ""
    var textString: String = "some text"
    println(textString)

    // char - single quotes - ''
    var textChar: Char = 'c'
    println(textChar)

    val dog = "Chocolate Lab"
    val food = "Cheese"
    println("This " + dog + " loves " + food)
}