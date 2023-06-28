import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSum {
/*
    https://leetcode.com/problems/two-sum/submissions/981493186/
*/
    public int[] twoSum(int[] nums, int target) {
        List<Integer> output = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    output.add(i);
                    output.add(j);
                }
            }
        }

        return output.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
