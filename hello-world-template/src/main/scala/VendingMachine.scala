class VendingMachine {
 
    var chocolateBar = 0    
    var granolaBar = 0      
    
    var totalMoney = 0.0    

    def buy(product: String, money: Double): String = {
        if (isProductAvailable(product) &&
            isMoneySufficient(money)) {
                completeRequest(product, money)
                s"bought $product for $money"
        } else "not enough founds"
    }

    def isProductAvailable(product: String): Boolean = ???
    def isMoneySufficient(money: Double): Boolean = ???
    def completeRequest(product: String, money: Double) = ???
}