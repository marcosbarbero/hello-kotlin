/**
 *
 * @author Marcos Barbero
 * @since 2017-05-30
 */
fun main(args: Array<String>) {
    Hello("Kotlin").say()
    val basics = BasicSyntax()

    val doubled = basics.double(7)
    println("What if $doubled")

    val result = basics.inferredSum(2, 3)
    println("The sum of 2 and 3 is $result")

    val defaultMultiplier = basics.multiply(2.0)
    println("Using default multiplier: $defaultMultiplier")

    val multiply = basics.multiply(2.0, 3)
    println("Using a diff multiplier: $multiply")

    val marcos = basics.nullableArgs("Marcos")
    println(marcos)

    val there = basics.nullableArgs(null)
    println(there)

    CollectionsSyntax().filterNullValues()
    CollectionsSyntax().printAll()
}