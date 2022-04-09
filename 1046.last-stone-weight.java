/*
 * @lc app=leetcode id=1046 lang=java
 *
 * [1046] Last Stone Weight
 */

// @lc code=start
class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int stone : stones) {
            pq.offer(stone);
        }
        for (int i = 0; i < stones.length - 1; i++) {
            pq.offer(pq.poll() - pq.poll());
        }
        return pq.poll();
    }
}
// @lc code=end

