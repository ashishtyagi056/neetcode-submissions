class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        return nums.sorted().zipWithNext()
        .any { it.first == it.second }
    }
}
