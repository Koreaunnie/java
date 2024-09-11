package leetcode.p2206;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Solution {
    // 2206. Divide Array Into Equal Pairs
    public boolean divideArray(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        // 배열을 전체 탐색 해서
        // 각 수가 몇 개인지 저장 (map)
        for (Integer n : nums) {
            if (map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
            } else {
                map.put(n, 1);
            }
        }
        // map을 전체 탐색해서 value가 홀수인 것이 있으면
        // return false
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : entries) {
            Integer key = entry.getKey();
            Integer val = entry.getValue();

            for (Integer n : map.values()) {
                if (val % 2 == 1) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        int[] nums1 = {1, 2, 2, 3, 3};
        int[] nums2 = {2, 2, 3, 3};

        System.out.println(test.divideArray(nums2));
    }
}
