object Main extends App{
    def Cost(p:Int):Int = 500 + Attendance(p)*3
    def Attendance(p:Int):Int = 120 + (15-p)*4
    def Revenue(p:Int):Int = Attendance(p)*p
    def Profit(p:Int):Int = Revenue(p) - Cost(p)

    println("Ticket price   Profit")
    println("      5         "+Profit(5))
    println("      10         "+Profit(10))
    println("      15         "+Profit(15))
    println("      20        "+Profit(20))
    println("      25        "+Profit(25)) //optimal ticket price
    println("      30        "+Profit(30))
    println("      35         "+Profit(35))
    println("      40         "+Profit(40))
    println("      45         "+Profit(45))

}