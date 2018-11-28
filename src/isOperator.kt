import java.io.IOException

val obj : String = "2"
val intVal : Double = 1.0

fun cal (age :Int){

    val age : Int = 25
    val ageRange : String
    val number : Int = 20

    val bags : Int =1

    val text : String = "하하"



    if(age >= 10 && age< 20){
        ageRange = "10대"
    }else if(age >=20 && age<30){
        ageRange = "20대"
    }else{
        ageRange = "기타"
    }

    val ageRange2 : String = if(age >= 10 && age <20)"10대" else if(age >= 20 && age <30 )"20대" else "기타"

    val numbers = if(number % 2 == 0) "짝" else "홀"

    when(bags){

        0 -> println("No bag Items")
        1 -> println("$bags item")
        2 -> println("$bags item")
        else -> println("default")
    }

    println(when(text){
        "haha"-> "s"
        "hkhk","하하"-> "yes"
        else ->"hah"
    })

    val e : Exception? = null

    when(e){
        is IOException -> println("이럴수가")
        is Exception-> println("하하")
        else -> println("망")
    }


    var a: Int  =0
    var b: Int = 10

    while(a < b){

        println("a : $a  b :  $b")
        a += 2
        b++
    }

    val names : List<String> = listOf("a","b","c")

    for(i in names.indices){
        println(names[i])
    }

    val myRange : IntRange = 0..10

    for(i in myRange){
        println(i)
    }

    for(i in 1..4){
        println(i)
    }

    val foo : Boolean =  5 in 0..10

    val foo2 : Boolean = 5 !in 0..10

    println("foo $foo foo2 $foo2")

    for(i in 5 downTo 1 step 2){ println(i)}


}

fun main (args : Array<String>){

    printTypeName(obj)

    val asVal = Integer.parseInt(obj)

    val asInt = 1

    val oo : Unrelated = Unrelated(Outer())
    val sub : Subclass =  Subclass()

    cal(30)


    val outer : Outer.Nested = Outer().Nested()


//    val outer : Outer.Nested = Outer.Nested()



    println(" asVal : $asVal asInt  : $asInt" )
}

fun printTypeName(obj : Any) {

    if(obj is Int){
        println("obj is ${obj.javaClass.name}")
    }else if(obj is String){
        println("obj is ${obj.javaClass.name}")
    }else if(obj is Float){
        println("obj is ${obj.javaClass.name}")
    }
}

data class Te constructor(val name :String){

}








open class Outer {
    private val a = 1
    protected val b = 2
    internal val c = 3

    val d = 4 // 기본으로 public

     inner class Nested {
        public val e: Int = 5
         val f : Int = c

    }

    interface Container<T : Void>{

        fun put(item :T)

        fun<X> put2(item: X)

        fun take():T

    }
}

class Subclass : Outer() {
    // a,b에 접근 불가
    //c 그리고 d에 접근 가능
    // Nested와 e에 접근 불가능
}

class Unrelated(o: Outer) {


    // o.a, o.b에 접근 불가
    // o.c(같은 모듈)와 o.d에 접근 가능
    // Outer.Nested에 접근 불가, 그리고 Nested::e에도 접근 불가

}
