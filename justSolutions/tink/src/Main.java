import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] item = new int[n];

        for (int i = 0; i < n; i++) {
            item[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (item[i] <= m) {

                int lside = item[i] - 1;
                int rside = m - item[i];
                m = Math.max(lside, rside);
            }
        }

        System.out.println(m);

    }
}