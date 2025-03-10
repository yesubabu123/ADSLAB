import java.util.ArrayList;
import java.util.List;
public class SumOfSubsets {
        public static List<List<Integer>> sumOfSubsets(int[] nums, int target) {
            List<List<Integer>> result = new ArrayList<>();
            backtrack(nums, target, 0, new ArrayList<>(), 0, result);
            return result;
        }
       private static void backtrack(int[] nums, int target, int start, List<Integer> path, int currentSum, List<List<Integer>> result) {
       if (currentSum == target) {
            result.add(new ArrayList<>(path));
            return;
        }
        if (currentSum > target) {
            return;
        }
       for (int i = start; i < nums.length; i++) {
            path.add(nums[i]);  
            backtrack(nums, target, i + 1, path, currentSum + nums[i], result); 
            path.remove(path.size() - 1);  
        }
    }
    public static void main(String[] args) {
        int[] nums = {3, 34, 4, 12, 5, 2};
        int target = 9;
        List<List<Integer>> subsets = sumOfSubsets(nums, target);
        System.out.println("Subsets that sum up to " + target + " are:");
        for (List<Integer> subset : subsets) {
            System.out.println(subset);
        }
    }
}