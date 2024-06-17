object Main extends App {
    def Discount(n:Int):Double = 24.95*n*0.4
    def Discountedprice(n:Int):Double = 24.95*n - Discount(n)
    def Shipping(n:Int):Double = if(n<50){3*n}else{3*50+((n-50)*0.75)}
    def Total(n:Int):Double = Discountedprice(n)+Shipping(n) 

    println("Total Wholesale cost = "+Total(60))
}