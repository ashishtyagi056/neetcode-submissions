class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        var left = 0
        var maxLength = 0
        val set = HashSet<Char>()
        for (right in s.indices) {
            while (set.contains(s[right])) {
                set.remove(s[left])
                left++
            }
            set.add(s[right])
            maxLength = maxOf(maxLength, right-left+1)
        }
        return maxLength
    }
}
