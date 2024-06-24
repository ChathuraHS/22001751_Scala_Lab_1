object Main extends App{
    var a = 2
    var b = 3
    var c = 4
    var d = 5
    var k: Float = 4.3f  

    println("--b*a + c&d = "+(b*a + c*d)) //In scala --b = b (Double negation cancels out)

    println("a++ = "+a) //Scala doen not support ++ operator
    a += 1

    println("-2*(a-k)+c = "+((-2*(a-k))+c))

    println("c=c++ = "+c)
    c += 1

    c += 1
    val temp = c * a
    a += 1
    c = temp
    println("c = ++c*a++ = "+c)

}