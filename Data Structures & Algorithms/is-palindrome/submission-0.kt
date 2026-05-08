class Solution {
    fun isPalindrome(s: String): Boolean {
        val trimedString = s.trim().filter { it.isLetterOrDigit() }.lowercase()
        var left = 0
        var right = trimedString.length - 1
        
        while (left < right) {
            if (trimedString[left] != trimedString[right]) return false
            left++
            right--
        }
        return true
    }
}
