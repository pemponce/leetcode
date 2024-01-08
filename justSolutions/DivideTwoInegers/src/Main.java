public class Main {
    public static void main(String[] args) {
        int dividend = 2147483647;
        int divisor = -1;

        Solution solution = new Solution();
        System.out.println(solution.divide(dividend, divisor));
    }
}

class Solution {
    public int divide(int dividend, int divisor) {
        int result = 0;
        int shit = 0;
        boolean fl1 = true;
        boolean fl2 = true;

        if (checkEquals(dividend, divisor, result) == 1 || checkEquals(dividend, divisor, result) == -1) {
            result = checkEquals(dividend, divisor, result);
        } else if (divisor == 1) {
            result = dividend;
        } else if (divisor == -1) {
            if (dividend > 0) {
                result = -dividend;
            } else {
                if (dividend == -2147483648) {
                    result = -dividend - 1;
                }
            }
        } else {
            if (dividend == -2147483648) {
                shit = dividend;
                dividend = -dividend - 1;
                fl1 = false;
            } else if(dividend < 0) {
                dividend = -dividend;
                fl2 = false;
            }
            while (true) {
                if (divisor > 0) {
                    dividend -= divisor;
                    if (dividend < 0) {
                        break;
                    } else {
                        result++;
                    }

                } else {
                    dividend += divisor;
                    if (dividend < 0) {
                        break;
                    } else {
                        if (divisor < 0) {
                            result--;
                        } else {
                            break;
                        }
                    }
                }
            }
        }

        if (!fl1) {
            if (divisor == 2 || divisor == 4) {
                result = -result - 1;
            } else {

                result = -result;
            }
        }
        if(!fl2) {
            result = -result;
        }
        return result;
    }

    public int checkEquals(int dividend, int divisor, int result) {

        if (dividend > 0 && divisor > 0) {
            if (dividend - divisor == 0) {
                result = 1;
            }
        } else if (dividend < 0 && divisor < 0) {
            if (dividend - divisor == 0) {
                result = 1;
            }
        } else if (dividend > 0 || divisor > 0) {
            if (dividend + divisor == 0) {
                result = -1;
            }
        }
        return result;
    }
}

