/**
 *
 * @author Marcos Barbero
 * @since 2017-06-16
 */
class BasicSyntax {

    fun sum(first: Int, second: Int): Int {
        return first + second
    }

    fun inferredSum(first: Int, second: Int) = first + second


    fun double(x: Int) = 2 * x

    fun multiply(input: Double, multiplier: Int = 2) = input * multiplier

    fun nullableArgs(name: String?): String {
        return if (name != null) "Hi $name" else "Hi there"
    }

}