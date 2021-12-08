fun main() {
    val discountBorder1 = 1_000_00
    val discount1 = 100_00
    val discountBorder2 = 10_000_00
    val discountBoughtALot = 0.05
    val discountMusicLover = 0.01

    val previousPurchaseAmount = 1234_00
    val isMusicLover = true
    var purchaseValue = 123_00

    val intermediateDiscount : Int
    if (previousPurchaseAmount > discountBorder1 && previousPurchaseAmount <= discountBorder2){
        intermediateDiscount = purchaseValue - discount1
    } else if (previousPurchaseAmount > discountBorder2){
        intermediateDiscount = (purchaseValue * ( 1 - discountBoughtALot)).toInt()
    } else intermediateDiscount = purchaseValue

    val finalDiscount : Int
    if (isMusicLover) {
        finalDiscount =  (intermediateDiscount * ( 1 - discountMusicLover)).toInt()
    } else {
        finalDiscount = intermediateDiscount
    }
    println("покупка - " + purchaseValue / 100 +"."+ purchaseValue % 100 + " \u20BD")
    println("после применения скидки - " + intermediateDiscount / 100 +"."+intermediateDiscount % 100 + " \u20BD")
    println("после применения 1% скидки - " + finalDiscount / 100 +"."+finalDiscount % 100 + " \u20BD")
}