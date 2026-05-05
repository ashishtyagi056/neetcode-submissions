class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        return s.sort() == t.sort()
    }

    fun String.sort(): String {
        return this.toCharArray().sorted().joinToString("") 
    }
}
