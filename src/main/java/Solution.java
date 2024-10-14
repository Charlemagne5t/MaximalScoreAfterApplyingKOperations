import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Comparator.reverseOrder());

        for (int x : nums) {
            pq.offer(x);
        }
        long res = 0;
        while (k != 0) {
            int x = pq.poll();
            res += x;
            int newX = x % 3 == 0 ? x / 3 : x / 3 + 1;
            pq.offer(newX);
            k--;
        }

        return res;
    }
}