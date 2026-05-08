class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        val startNums = mutableListOf<Int>()
        for (i in nums.indices) {
            if (nums[i]-1 !in nums) startNums.add(nums[i])
        }
        var maxLength = 0
        for (i in startNums) {
            var currentNum = i
            var currentLength = 1
            while(currentNum+1 in nums) {
                currentLength++
                currentNum++
            }
            maxLength = maxOf(maxLength, currentLength) 
        }
        return maxLength
    }
}
