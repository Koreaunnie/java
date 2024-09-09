package leetcode.p2032;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    // 2032. Two Out of Three
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> set3 = new HashSet<>();
        Set<Integer> answer = new HashSet<>(); // 중복을 제거하기 위한 Set

        // 각 배열의 값을 set에 추가
        for (int n : nums1) {
            set1.add(n);
        }
        for (int n : nums2) {
            set2.add(n);
        }
        for (int n : nums3) {
            set3.add(n);
        }

        // set[a]의 값이 set[b] 또는 set[c]에 있는지 확인하고 answer에 추가
        for (int n : set1) {
            if (set2.contains(n) || set3.contains(n)) {
                answer.add(n);
            }
        }
        for (int n : set2) {
            if (set1.contains(n) || set3.contains(n)) {
                answer.add(n);
            }
        }
        for (int n : set3) {
            if (set1.contains(n) || set2.contains(n)) {
                answer.add(n);
            }
        }

        // answer을 리스트로 변환하여 반환
        return new ArrayList<>(answer);
    }

    public static void main(String[] args) {
        Solution test = new Solution();

        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 5, 1, 4};
        int[] nums3 = {4, 3, 2};

        System.out.println(test.twoOutOfThree(nums1, nums2, nums3));
    }
}
