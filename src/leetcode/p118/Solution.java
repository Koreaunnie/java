package leetcode.p118;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(List.of(1));

        for (int j = 0; j < numRows - 1; j++) {
            var prev = result.getLast();
            var last = new ArrayList<Integer>();
            last.add(1);

            for (int i = 0; i < prev.size() - 1; i++) {
                last.add(prev.get(i) + prev.get(i + 1));
            }
            last.add(1);
            result.add(last);
        }
        return result;
    }
}
