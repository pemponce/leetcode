import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] listOfDigits = {9};

        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.plusOne(listOfDigits)));
    }
}

class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
        }

        int[] newarr = new int[n + 1];
        newarr[0] = 1;

        return newarr;
    }
}