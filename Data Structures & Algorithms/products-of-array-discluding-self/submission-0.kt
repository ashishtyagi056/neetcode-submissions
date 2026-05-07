class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val prefixProductArray = IntArray(nums.size)
        val sufixProductArray = IntArray(nums.size)
        val outputProductArray = IntArray(nums.size)
        for (i in 0..<nums.size) {
            if (i == 0) {
                prefixProductArray[i] = 1
            } else prefixProductArray[i] = nums[i-1] * prefixProductArray[i-1]
        }
    
        for (i in nums.size-1 downTo 0) {
            if (i == nums.size-1) {
                sufixProductArray[i] = 1
            } else sufixProductArray[i] = nums[i+1] * sufixProductArray[i+1]
        }

        for (i in 0..<nums.size) {
            outputProductArray[i] = prefixProductArray[i] * sufixProductArray[i]
        }

        return outputProductArray
    }
}
