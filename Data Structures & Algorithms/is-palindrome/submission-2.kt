class Solution {
    fun isPalindrome(s: String): Boolean {
        val str = s.trim().filter { it.isLetterOrDigit() }.lowercase()
        var left = 0
        var right = str.length - 1
        
        while (left < right) {
            if (str[left] != str[right]) return false
            left++
            right-- 
        }
        return true
    }
}
