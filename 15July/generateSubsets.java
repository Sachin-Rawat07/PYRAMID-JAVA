import java.util.*;
public class generateSubsets {
    public static List<List<Integer>> findSubsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        int n = nums.length;
        int totalSubsets = 1 << n; 

        for (int i = 0; i < totalSubsets; i++) {
            List<Integer> subset = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    subset.add(nums[j]);
                }
            }
            subsets.add(subset);
        }

        return subsets;
    }


    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> subsets = findSubsets(nums);

        for (List<Integer> subset : subsets) {
            System.out.println(subset);
        }
    }
}
