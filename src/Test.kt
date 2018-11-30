import java.awt.Image
import javax.xml.ws.Response

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

inline fun doSomething(body : ()->Unit){
    body()
}

fun printss(body: (Int, Int) ->Int){
    print(body(5,5))
}


fun main(args: Array<String>) {

    println("aEqualsToB  : $aEqualsToB")
    println("aEqualsToC : $aEqualsToC")
    println("aIdenticalToB : $aIdenticalToB")
    println("aIdenticalToC : $aIdenticalToC")

    val carList: MutableList<Car> = arrayListOf()
    val sedanList: List<Sedan> = listOf()

    val foo2 : Foo  = Foo()

    val bars : Int  = foo2 as? Int ?:0

    println("bars   : $bars")


    FunctionClass.append(carList, carList)

    val valid: Boolean = try {
        true
    } catch (e: Exception) {
        false
    }

    val nullableString: String? = null

    val nonNull: String = "F"

    val str: String? = formatAddress("1", "2")

    val postalCode: String = formatAddress("1", "2") ?: "NONO"

    val testVal: String = formatAddress("", "") ?: formatAddress2("")

    val foo: String = "foo"

    val bar: Int? = foo as? Int ?: 1

    val fooIns: Foo? = Foo()

    val nonNullFoo: Foo = fooIns!!

    var vol  = Volume(2,3)

    println(vol++)

    fooIns!!.bar()

//    val Persons : Persons = Persons()

//    val name1 : String = Persons.name

//    val name2 : String? = Persons.name

    val ahn : PersonTest  = PersonTest("안", "20")

    val ahn2: PersonTest = PersonTest("안","20")

    val park : PersonTest = PersonTest("박", "30")

    val lamda : ()->Unit = { print("안녕")}

    val squares : (Int)->Int = {x->x*x}

    val test  = {{ println()}}

    val test2 =  {x: Int ->x*x }

    val testFun : ()->Unit = fun(){ println("와웅")}

    testFun()

    println("나오는값 ${test2(1)}")


    println("ahn == ahn2 : ${ahn==ahn2}")

    println("ahn == park : ${ahn==park}")

    println("ahn.hashCode() : ${ahn.hashCode()}")

    val Per :Person3 =  Person3("",22)
    Per.address
    Per.address = "하니"
    println(Per.address)

    formatAddress(line = "1" , line2 = "2")

}

fun formatAddress(line: String, line2: String): String? {
    return ""
}

fun formatAddress2(line: String): String {
    return ""
}

fun generateMap(address: String): Image? {

    val postal = formatAddress("2", "3") ?: return null

    return null
}

fun getString(): String? {

    val post = formatAddress("", "") ?: return ""

    return ""
}

class Foo {

    fun bar() {

    }

}

data class PersonTest(val name : String , val age : String)


class Person(record: Record) {


    private val name: String
    private val address: String

    init {
        name = record.data1
        address = record.data2!!
    }
}

class Record(val data1: String, val data2: String?)


sealed class SealClassTest(val os :String){

    class Android (os: String , packagename: String): SealClassTest(os)

    class Ios (os : String , packagename : String) : SealClassTest(os)

    class Window (os :String, packagename: String) : SealClassTest(os)

    fun who(app : SealClassTest) = when(app){

        is SealClassTest.Android -> println("android")

        is SealClassTest.Ios -> println("Ios")

        else-> println("Window")
    }
}

class Person3(val name: String , val age : Int){

    private val adult : Boolean get() = age >=19

    var address : String = ""
        get() = if(field.length > 0) field
        else "하하"
        set(value){
        field = value.substring(0..1)
    }
}

class Volume (var left : Int, var right : Int) {


    operator fun inc() : Volume{
        this.left += left
        this.right += right
        return this
    }
}



