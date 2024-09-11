package leetcode.p1512;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    // 1512. Number of Good Pairs
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int goodPairs = 0;

        for (Integer num : nums) {
            int count = map.getOrDefault(num, 0);
            goodPairs += count; // 이미 존재하는 동일한 숫자들이 있으면 그만큼 쌍을 추가
            map.put(num, count + 1);
        }
        return goodPairs;
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        int[] nums = {1, 2, 3, 4};
        System.out.println(test.numIdenticalPairs(nums));
    }
}
