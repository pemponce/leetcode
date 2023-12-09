public class Main {
    public static void main(String[] args) {
        int[] array = {1, 3};

        Solution solution = new Solution();

        System.out.println(solution.searchInsert(array, 3));
    }
}

class Solution {
    public int searchInsert(int[] nums, int target) {

        int result = 0;

        if(nums.length > 1) {
            for (int j = 0; j < nums.length / 2; j++) {
                for (int i = 0; i < nums.length - 1; i++) {
                    if (nums[i] > nums[i + 1]) {
                        int temp = nums[i];
                        nums[i] = nums[i + 1];
                        nums[i + 1] = temp;
                    }
                }
            }


            for (int k = 0; k < nums.length - 1; k++) {
                if (nums[k] == target) {
                    result = k;
                } else {
                    if (nums[k] < target && target < nums[k + 1]) {
                        result = k + 1;
                    } else if (nums[nums.length - 1] < target) {
                        result = nums.length;
                    } else if(nums[k] == target) {
                        result = k;
                    } else if(nums[k + 1] == target) {
                        result = k + 1;
                    }
                }
            }
        } else {
            if(nums[0] > target) {
                return result;
            } else if(nums[0] < target){
                result = 1;
            } else {
                return result;
            }
        }

        return result;
    }
}