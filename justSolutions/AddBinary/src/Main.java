import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Time;
import java.time.LocalTime;
import java.util.Scanner;
import java.util.Timer;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 100
        String a = scanner.nextLine();
        // 010

        String b = scanner.nextLine();

        Solution solution = new Solution();
        System.out.println(solution.addBinary(a, b));
    }
}

class Solution {
    public String addBinary(String a, String b) {

        BigInteger res = toDecimal(a).add(toDecimal(b));

        return res.toString(2);
    }

    public BigInteger toDecimal(String bin) {
        int c = 0;

        BigInteger resultNumber = BigInteger.valueOf(0);

        for (int i = bin.length() - 1; i >= 0; i--) {
            BigInteger digit = BigInteger.valueOf(Integer.parseInt(String.valueOf(bin.charAt(c))));
            resultNumber = resultNumber.add(digit.multiply(BigInteger.valueOf(2).pow(i)));
            c++;
        }

        return resultNumber;
    }
}


//import java.math.BigInteger;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter the first binary string:");
//        String a = scanner.nextLine();
//
//        System.out.println("Enter the second binary string:");
//        String b = scanner.nextLine();
//
//        Solution solution = new Solution();
//        System.out.println(solution.addBinary(a, b));
//    }
//}
//
//class Solution {
//    public String addBinary(String a, String b) {
//        BigInteger decimalSum = toDecimal(a).add(toDecimal(b));
//        return decimalSum.toString(2);
//    }
//
//    private BigInteger toDecimal(String bin) {
//        BigInteger resultNumber = BigInteger.ZERO;
//
//        for (int i = bin.length() - 1, c = 0; i >= 0; i--, c++) {
//            BigInteger digit = BigInteger.valueOf(Integer.parseInt(String.valueOf(bin.charAt(c))));
//            resultNumber = resultNumber.add(digit.multiply(BigInteger.valueOf(2).pow(i)));
//        }
//
//        return resultNumber;
//    }
//}
