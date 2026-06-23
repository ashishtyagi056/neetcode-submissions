class Solution {
    fun maxProfit(prices: IntArray): Int {
        var minPrice = prices[0]
        var maxProfit = 0
        for (price in prices) {
            if (price < minPrice) {
                minPrice = price
            } else {
                maxProfit = maxOf(maxProfit, price-minPrice)
            }
        }
        return maxProfit
    }
}
