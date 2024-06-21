class Solution {
    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        var answer = n
        lost.sort()
        reserve.sort()
        val l = lost.toMutableList()
        val r = reserve.toMutableList()

        l.removeAll(reserve.toMutableList())
        r.removeAll(lost.toMutableList())

        for(i in r.indices) {
            if(l.contains(r[i] - 1))  l.remove(r[i] - 1)
            else if(l.contains(r[i] + 1)) l.remove(r[i] + 1)
        }

        return answer-l.size
    }
}
