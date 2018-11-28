val a: Pair<Char, Int> = Pair('A', 65)
val b = a
val c: Pair<Char, Int> = Pair('A', 65)

val aEqualsToB: Boolean = a == b
val aEqualsToC: Boolean = a == c
val aIdenticalToB : Boolean =  a === b
val aIdenticalToC : Boolean =  a === c


fun main(args: Array<String>) {

    println("aEqualsToB  : $aEqualsToB")
    println("aEqualsToC : $aEqualsToC")
    println("aIdenticalToB : $aIdenticalToB")
    println("aIdenticalToC : $aIdenticalToC")

    val carList : MutableList<Car>  = arrayListOf()
    val sedanList : List<Sedan> = listOf()

    FunctionClass.append(carList , carList)

}


