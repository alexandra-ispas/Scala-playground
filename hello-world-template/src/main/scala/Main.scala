object Main extends App {

  def pow(e: Int, b: Int): Unit = {
    var result = b
    for (i <- 2 to e) {
      result *= b
    }
    println(s"result = $result")
  }
  pow(3, 2)
  println("Hello, World!")

  def concatNtimes(n: Int, s: String): String = {
    def helper(n1: Int, result: String): String = 
      if (n1 == 0) result else helper(n1 - 1, result + s)
    
    helper(n, "")
  }

  println(concatNtimes(13, "da"))

  def isPrime(n: Int): Boolean = {
    def helper(div: Int): Boolean = if (div > Math.sqrt(n)) true 
      else (n % div != 0) && helper(div + 1)

    helper(2)
  }

  println(isPrime(12))
  println(isPrime(13))
  println(isPrime(2))
  println(isPrime(17))
  println(isPrime(4))
  println(isPrime(32))

  def fibonacci(n: Int): Int = {
    def helper(n1: Int, last: Int, secondToLast: Int): Int = 
      if (n1 == n) last
      else helper(n1 + 1, last + secondToLast, last)

    helper(0, 1, 0)
  }

  println(fibonacci(3))
  println(fibonacci(4))
  println(fibonacci(5))

  def somePatternMathing(param: Any) = param match {
    case _: Int => s"it an integer"
    case _: Double => s"it s a double"
    case _: String => s"it s a string"
    case _ => s"default"
  }

  println(somePatternMathing(2.0))
  println(somePatternMathing(2))
  println(somePatternMathing("ana"))

  println(({x: String => s"hello $x"})("ana"))

  val sum: (Int, Int) => Int = { (a, b) => a + b }

  val dif: (Int, Int) => Int = _ - _
  println(dif(1,2))


  val multiply: (String, Int) => Int = _.length * _
  val toDouble: Int => Double = _.toDouble
  val concat: (String, String) => String = _ + _
  val inverseConcat: (String, String) => String = {(x1, x2) => x2 + x1}
  val myLongFunc: String => String = x => x.reverse * x.length

  println(multiply("ana", 3))
  println(toDouble(2))
  println(concat("ana", "are"))

  println(inverseConcat("ana", "are"))
  println(myLongFunc("ana"))

  val transform: PartialFunction[String, String] = {
    case x if x.startsWith("a") => x.reverse
    case x if x.startsWith("s") => x.toUpperCase
  }

  println(transform("ana are mere"))
  println(transform("sa termin scala odata"))

  val func: (Int, Int) => Int = _ + _


  try {
    val b = "hello".toBoolean
  } catch {
    case ex: IllegalArgumentException => 
      println("argument de type dif")
      0
  }

}