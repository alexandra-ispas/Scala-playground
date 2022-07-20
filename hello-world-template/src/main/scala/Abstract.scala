abstract class MyList {
    def head: Int
    def tail: MyList
    def isEmpty: Boolean
    def add(element: Int): MyList
    def printElements: String
    override def toString: String = "[" + printElements + "]"
}

object Empty extends MyList {
    def head: Int = throw new NoSuchElementException
    def tail: MyList = throw new NoSuchElementException
    def isEmpty: Boolean = true
    def add(element: Int): MyList = new Cons(element, Empty)
    def printElements: String = ""
}

class Cons(h: Int, t: MyList) extends MyList {
    def head: Int = h
    def tail: MyList = t
    def isEmpty: Boolean = false
    def add(element: Int): MyList = new Cons(element, this)
    def printElements: String = if (t.isEmpty) "" + h else h + " " + t.printElements
}

object ListTest extends App {
    val list = new Cons(1, new Cons(2, new Cons(3, Empty)))
    println(list.tail.head)
    println(list.add(4).head)
    println(list.isEmpty)

    println(list.toString)
}

class Person(name: String, age: Int = 0) {
    def presentYourself = s"I am $name and I am $age years old"
}

class Teacher(name: String, age: Int = 0) extends Person(name, age) {
    def presentTeacher = s"hi, i'm a teacher"
}

class Student(name: String, age: Int, id: Int) extends Person(name, age) {
    def presentStudent = s"hi i'm a student and my id is $id"
}

object PersonTest extends App {
    val p1 = new Person("ana", 12)
    val p2 = new Person("bogdan", 14)

    println (p1.presentYourself)
    println (p2.presentYourself)

    println((new Teacher("maria", 32).presentTeacher))
}