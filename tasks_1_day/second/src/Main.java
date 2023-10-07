public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int x = 12131;

        System.out.println(solution.isPalindrome(x));

    }
}

class Solution {
    public boolean isPalindrome(int x) {
        String x_toStr = String.valueOf(x);
        int lastInd = x_toStr.length();
        char[] arr = new char[lastInd];
        StringBuilder ans = new StringBuilder();

        for (int j = 0; j < lastInd; j++) {
            arr[j] = x_toStr.charAt(j);
        }

        for (int i = 0; i < lastInd; i++) {
            ans.append(arr[lastInd - i - 1]);
        }

        return x_toStr.equals(ans.toString());

    }
}