public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();
        System.out.println(solution.mySqrt(4));
    }
}

class Solution {
    public int mySqrt(int x) {

        int res = 0;
        if(x == 1) {
            res = 1;
        } else {

            for (int i = 0; i < x; i++) {
                res = i * i;

                if (res > x) {
                    res = i - 1;
                    break;
                } else if (res == x) {
                    res = i;
                }
            }
        }


        return res;
    }
}