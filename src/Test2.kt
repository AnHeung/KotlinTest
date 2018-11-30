

typealias personList =  List<String>

fun main (args: Array<String>){

    val person  = Person4(18)

    val personList : List<Person4> =  listOf(Person4(1), Person4(19) , Person4(20) , Person4(40) , Person4(16))

    printAdults(personList)

    doSomethings { println("하하") }
    inlineDoSomething { println("하하") }

    person.send()

}

class Person4 (val age : Int){

    val adult : Boolean = age > 19

    val cities : Map<String,String> = hashMapOf(Pair("a","b") , Pair("c","d"), Pair("e","f"))

    val list : List<Int> = listOf(1,2,3,4,5)



    fun send(){
        for ((city, name) in cities){
            println("city $city  , name $name")
        }

        cities.forEach{city,name->println("city $city  , name $name")}

        list.forEach{ println(it)}
    }

}

fun printAdults(people : List<Person4>){

    people.filter{ person-> person.adult}
            .forEach{ println("adult : ${it.age}")}

    people.filter(Person4 :: adult)
            .forEach{ println()}

}

fun doSomethings(body : ()-> Unit) {
    println("onPreExecute")
    body()
    println("onPostExecute")
}

inline fun inlineDoSomething(body : ()->Unit){
    println("onPreExecute")
    body()
    println("onPostExecute")
}
