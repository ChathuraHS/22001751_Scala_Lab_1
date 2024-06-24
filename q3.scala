object Main extends App{

    def normal(h:Int):Int = h*250*4
    def OT(h:Int):Int = h*85*4
    def tax(v:Int):Double = v*0.12
    def salary(n:Int, o:Int):Double = normal(n)+OT(o)-tax(normal(n)+OT(o))

    println("Salary of a typical employee = "+salary(40,30))

}