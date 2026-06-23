class Solution {
    fun countSubstrings(s: String): Int {
        var count = 0
        for (i in 0 until s.length) {
            for (j in i until s.length) {
                val subStr = s.substring(i,j+1)
                if (isPalindrome(subStr)) {
                    count++
                }
            }
        }
        return count
    }

    fun isPalindrome(s: String): Boolean {
        var left = 0
        var right = s.length-1
        while (left < right) {
            if (s[left] != s[right]) return false
            left++
            right--
        }
        return true
    }
}
