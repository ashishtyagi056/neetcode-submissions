class Solution {
    fun isPalindrome(s: String): Boolean {
        val fStr = s.trim().filter { it.isLetterOrDigit() }.lowercase()
        var left = 0
        var right = fStr.length - 1
        
        while (left < right) {
            if (fStr[left] != fStr[right]) return false
            left++
            right--
        }
        return true
    }
}
