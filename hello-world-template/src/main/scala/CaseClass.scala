
object DemoCase extends App {
    case class Person(name: String, age: Int)
    val p1 = new Person("ana", 21)

    def welcome: PartialFunction[Person, String] = { 
        case Person(_, 18) => "Are 18"
        case Person("ana", _) => "e ana"
    }

    val p = Person("ana", 28)

    println(welcome(p))
    println(welcome(Person("ceva", 18)))

    def stats(str: String, predicate: Char => Boolean): Int = {
        str.count(predicate)
    }

    def size(c: Char): Boolean = {
        true
    }

    def checkDigit(c: Char): Boolean = {
        c.isDigit
    }

    def checkLetter(c: Char): Boolean = {
        c.isLetter
    }



    println(stats("ana", size))
    println(stats("123nfierfienrife", checkDigit))
    println(stats("123nfierfienrife", _ == 'f'))

    def foo(f: Int => Double = _.toDouble): Double = {
        f(42) + 2
    }

    println(foo())

    def operationWithFallback(n: Int, operation: Int => Int, fallback: Int) = {
        val res = operation(n)
        if (res > 0) res else fallback
    }



    def ceva(n: Int, f: Int): Int = n
                                        // -> default type of evaluation is applicative
    ceva(2, {println("ceva"); 12})      // the params are evaluated first
}