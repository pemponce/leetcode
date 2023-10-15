import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class RomanToInteger {

    public static int romanToInt(String s) {
        Map<Character, Integer> romanNumerals = new HashMap<>();
        romanNumerals.put('I', 1);
        romanNumerals.put('V', 5);
        romanNumerals.put('X', 10);
        romanNumerals.put('L', 50);
        romanNumerals.put('C', 100);
        romanNumerals.put('D', 500);
        romanNumerals.put('M', 1000);

        int result = 0;
        int prevValue = 0;

            for (int i = s.length() - 1; i >= 0; i--) {
            int value = romanNumerals.get(s.charAt(i));
            if (value < prevValue) {
                result -= value;
            } else {
                result += value;
            }
            prevValue = value;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String romanNumber = scanner.nextLine();
        int arabicNumber = romanToInt(romanNumber);
        System.out.println(arabicNumber);
    }
}
