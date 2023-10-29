import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int[] expectedNums = {};

        Solution solution = new Solution();

        int k = solution.removeDuplicates(nums);
        assert k == expectedNums.length;

        for(int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
            System.out.println(nums[i]);
        }
    }
}

class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new TreeSet<>();
        for(int i: nums) {
            set.add(i);
        }
        int n = 0;
        for(int num: set) {
            nums[n] = num;
            n++;
        }
        return set.size();
    }
}