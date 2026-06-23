class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val prefixArray = IntArray(nums.size)
        val suffixArray = IntArray(nums.size)
        val output = IntArray(nums.size)
        prefixArray[0] = 1 
        suffixArray[nums.size-1] = 1

        for (i in 1..nums.size-1) {
            prefixArray[i] = nums[i-1] * prefixArray[i-1]
        }

        for (i in nums.size-2 downTo 0) {
            suffixArray[i] = nums[i+1] * suffixArray[i+1]
        }

        for (i in 0 until nums.size) {
            output[i] = prefixArray[i] * suffixArray[i]
        }

        return output
    }
}
