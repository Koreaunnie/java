package leetcode.p2206;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution2 {
    public boolean divideArray(int[] nums) {
        Map<Integer, Long> map = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));

        return map.values()
                .stream()
                .allMatch(e -> e % 2 == 0);

    }
}
