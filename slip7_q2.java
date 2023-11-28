package java_Slips;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class slip7_q2 {
    public static void main(String[] args) {
        // Replace "input.txt" with the path to your text file
        String filePath = "sample.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            StringBuilder content = new StringBuilder();

            // Read each line from the file
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }

            // Reverse the content and change the case
            String reversedContent = reverseAndChangeCase(content.toString());

            // Print the result
            System.out.println(reversedContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String reverseAndChangeCase(String input) {
        // Use StringBuilder to reverse the content
        StringBuilder reversed = new StringBuilder(input).reverse();

        // Change the case
        for (int i = 0; i < reversed.length(); i++) {
            char c = reversed.charAt(i);
            if (Character.isUpperCase(c)) {
                reversed.setCharAt(i, Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                reversed.setCharAt(i, Character.toUpperCase(c));
            }
        }

        return reversed.toString();
    }
}
