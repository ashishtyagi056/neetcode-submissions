class Solution {
    fun isValid(s: String): Boolean {
        val queue = ArrayDeque<Char>()
        val map = mapOf(')' to '(', '}' to '{', ']' to '[')
        for(i in s) {
            if (i in "({[") {
                queue.addLast(i)
            } else if (queue.isEmpty() || queue.removeLast() != map[i]) {
                return false
            }
        }
        return queue.isEmpty()
    }
}
