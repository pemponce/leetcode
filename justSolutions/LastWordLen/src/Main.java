public class Main {
    public static void main(String[] args) {
        String string = "Hello World  ";

        Solution solution = new Solution();
        System.out.println(solution.lengthOfLastWord(string));
    }
}

class Solution {
    public int lengthOfLastWord(String s) {

        int result = 0;

        for (int i = s.length() - 1; i >= 0; i--) {

            char charString = s.charAt(i);

            if(result == 0) {
                if(charString != ' ') {
                    result++;
                }
            } else if(result > 0) {
                if(charString != ' ') {
                    result++;
                } else {
                    break;
                }
            }
        }

        return result;
    }
}