import java.util.*;

public class Main {
    public static void main(String[] args) {

        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;

        int[] expectedNums = {};

        Solution solution = new Solution();

        int k = solution.removeElement(nums, val);
        assert k == expectedNums.length;

        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
            System.out.println(nums[i]);
        }
    }
}

class Solution {
    public int removeElement(int[] nums, int val) {

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i: nums) {
            if(i != val) {
                arr.add(i);
            }
        }

        int j = 0;
        for (int num: arr) {
            nums[j] = num;
            j++;
        }

        return arr.size();
    }
}