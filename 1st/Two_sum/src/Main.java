import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 3, 46, 2, 5, 6};
        int target = 48;
        //Найдем индексы чисел дающие нам сумму 9

        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.twoSum(arr, target)));
    }

}

class Solution {
    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            int firstNum = nums[i];
            for (int j = i + 1; j < nums.length; j++) {

                if (firstNum + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}

//TODO: Given an array of integers nums and an integer target,
// return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
// You can return the answer in any order.