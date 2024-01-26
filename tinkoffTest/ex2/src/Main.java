import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int[] array = new int[length];

        int i = 0;

        while (length != 0) {
            array[i] = scanner.nextInt();
            i++;
            length -= 1;
        }

        Solution solution = new Solution();
        int stacksCount = solution.stacksCount(array);
        int[] recurringNumbersCounter = solution.recurringNumbersCounter(array, stacksCount);
        System.out.println(stacksCount);
        for (int nums : recurringNumbersCounter) {
            System.out.print(nums + " ");
        }
    }
}

class Solution {
    public int stacksCount(int[] array) {

        HashSet<Integer> newArray = new HashSet<>();

        for (int i : array) {
            newArray.add(i);
        }

        return newArray.size();
    }

    public int[] recurringNumbersCounter(int[] array, int stacksCount) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int number : array) {
            countMap.put(number, countMap.getOrDefault(number, 0) + 1);
        }

        int[] repNums = new int[stacksCount];
        int index = 0;

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            repNums[index++] = entry.getValue();
        }

        int temp;
        for (int i = 0; i < stacksCount; i++) {
            if (i != stacksCount - 1) {
                if (repNums[i] > repNums[i + 1]) {
                    temp = repNums[i];
                    repNums[i] = repNums[i + 1];
                    repNums[i + 1] = temp;
                }
            }
        }

        return repNums;
    }
}