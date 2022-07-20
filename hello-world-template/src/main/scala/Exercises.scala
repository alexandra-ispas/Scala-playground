import scala.language.postfixOps


object Exercises extends App {

    class Writer(firstname: String, surname: String, val year: Int) {
        def fullname: String = firstname + " " + surname
    }

    class Novel(name: String, year: Int, author: Writer) {
        def authorAge = year - author.year
        
        def isWrittenBy(auth: Writer) = auth == author

        def copy(new_year: Int) = new Novel(name, new_year, author)
    }

    class Counter(x: Int) {
        def currentCount = x

        def increment = new Counter(x + 1)
        def increment(by: Int) = new Counter(x + by)

        def decrement = new Counter(x - 1)
        def decrement(by: Int) = new Counter(x - by)
    }

    class Person(val name: String, favouriteMovie: String, val age: Int = 10 ) {
        def +(x: String): Person = new Person(name + " (" + x + ")", favouriteMovie)

        def unary_+ = new Person(name, favouriteMovie, age + 1) 

        def learns(str: String): String = s"$name learns $str"

        def learnsScala = learns("scala")

        def apply(nr: Int): String = s"$name watched the movie $favouriteMovie $nr times"
    }

    val mary = new Person("Mary", "some movie")

    val aux = mary + "the rockstar"
    println(aux.name)

    val ceva = +mary
    println(ceva.age)

    println(mary learnsScala)

    println(mary(2))

}