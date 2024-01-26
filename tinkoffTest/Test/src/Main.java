import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String fileName = "passwords.txt";
        Scanner scanner = new Scanner(System.in);

        try {
            File file = new File(fileName);
            file.createNewFile();

            String text = scanner.nextLine();

            FileWriter writer = new FileWriter(file);
            writer.write(text);
            writer.close();

            Solution solution = new Solution();

            System.out.println(solution.outputTxt(fileName));

        } catch (IOException e) {
            System.out.println("Ошибка при создании файла");
            e.printStackTrace();
        }
    }

}

class Solution {
    public String outputTxt(String fileName) throws IOException {
        StringBuilder result = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains("code")) {
                    line = line.replaceAll("code\\d+", "???");
                }
                result.append(line).append("\n");
            }
        }

        return result.toString();
    }
}
