
trait MyFunction[A, B] {
    def apply(element: A): B
}

object AnotherExample extends App {

    // def main(args:[String]): Unit { 

    // }

    val doubler = new MyFunction [Int, Int] {
        override def apply(element: Int) = element * 2
    }

    val stringToInt = new MyFunction[String, Int] {
        override def apply(element: String) = element.toInt
    }

    // val concatenation = new Function2[String, String, String] {
    //     override def apply(element: String, element2: string): String = element + element2
    // }
    println(doubler(2))
    println(stringToInt("22"))

    def forfunc[A](list: List[A], f: A => Unit): Unit = {
        for {
            el <- list
        } yield f(el)
    }

    forfunc[Int](List(1, 2, 3, 4, 5), {x => println(x)})
    // println(doubler 2)
}