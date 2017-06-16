/**
 *
 * @author Marcos Barbero
 * @since 2017-06-16
 */
class CollectionsSyntax {

    val nullableList: List<Int?> = listOf(1, 2, null, 4)

    fun filterNullValues() {
        println(nullableList.filterNotNull())
    }

    fun printAll() {
        println(nullableList)
    }
}