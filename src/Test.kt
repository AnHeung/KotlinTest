import java.awt.Image

val a: Pair<Char, Int> = Pair('A', 65)
val b = a
val c: Pair<Char, Int> = Pair('A', 65)

val aEqualsToB: Boolean = a == b
val aEqualsToC: Boolean = a == c
val aIdenticalToB: Boolean = a === b
val aIdenticalToC: Boolean = a === c

fun checkAge(age: Int) {

    if (age < 0) {
        throw IllegalAccessException("Invalid age : $age")
    }
}


fun main(args: Array<String>) {

    println("aEqualsToB  : $aEqualsToB")
    println("aEqualsToC : $aEqualsToC")
    println("aIdenticalToB : $aIdenticalToB")
    println("aIdenticalToC : $aIdenticalToC")

    val carList: MutableList<Car> = arrayListOf()
    val sedanList: List<Sedan> = listOf()

    FunctionClass.append(carList, carList)

    val valid: Boolean = try { true } catch (e: Exception) { false }

    val nullableString : String? = null

    val nonNull : String = "F"

    val str : String? = formatAddress("1" , "2")

    val postalCode : String = formatAddress("1","2") ?: "NONO"

    val testVal : String = formatAddress("","")?:formatAddress2("")

    val foo: String = "foo"

    val bar : Int? = foo as? Int ?: 1

}

fun formatAddress(line : String ,line2 : String) : String?{
        return ""
}

fun formatAddress2(line : String) : String{
    return ""
}

fun generateMap(address: String) :Image? {

    val postal = formatAddress("2","3") ?: return null

    return null
}

fun getString(): String?{

    val post = formatAddress("", "") ?: return ""

    return ""
}


