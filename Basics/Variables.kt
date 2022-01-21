fun main() {
    // var signifies declared variable is mutable
    var todaysDate: String = "01/19/2022"
    println(todaysDate)

    // val signifies declared variable is immutable
    val pi: Double = 3.14
    println(pi)

    // compiler can infer type based on initialized value but if mutating the var, the new value must be the same type as initalized value
    var typeTest = 6
    println("${typeTest::class.simpleName}")

    // String - double quotes - ""
    var textString: String = "some text"
    println(textString)

    // char - single quotes - ''
    var textChar: Char = 'c'
    println(textChar)

    // string concatenation
    val dog = "Chocolate Lab"
    val food = "Cheese"
    println("This " + dog + " loves " + food)

    // string templates
    val plant = "orchid"
    val potSize = 6
    val dayNum = 7 

    val templateString = "An $plant in a $potSize inch pot must be watered every $dayNum days."
    println(templateString)

    // get input from user
    println("Please type your name and hit Enter.")
    val name = readLine()
    println("Your name is $name!")

    // compile to jar through CLI
    // kotlinc Variables.kt -include-runtime -d Variables.jar

    // run with
    // java -jar Variables.jar
}