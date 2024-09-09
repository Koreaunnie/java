package leetcode.p2215;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    // 2215. Find the Difference of Two Arrays
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // nums1의 모든 요소를 set1에 추가
        for (int n1 : nums1) {
            set1.add(n1);
        }

        // nums2의 모든 요소를 set2에 추가
        for (int n2 : nums2) {
            set2.add(n2);
        }

        // nums1에서 nums2에 없는 요소 찾기
        List<Integer> diff1 = new ArrayList<>();
        for (int num : set1) {
            if (!set2.contains(num)) {
                diff1.add(num);
            }
        }

        // nums2에서 nums1에 없는 요소 찾기
        List<Integer> diff2 = new ArrayList<>();
        for (int num : set2) {
            if (!set1.contains(num)) {
                diff2.add(num);
            }
        }

        // 결과 리스트 작성
        List<List<Integer>> answer = new ArrayList<>();
        answer.add(diff1);
        answer.add(diff2);

        return answer;
    }

    public static void main(String[] args) {
        Solution test = new Solution();

        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 6};

        System.out.println(test.findDifference(nums1, nums2));
        // Output: [[1, 3], [4, 6]]
    }
}
