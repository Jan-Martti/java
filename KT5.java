import java.util.Scanner;

public class KT5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Palun sisesta tekst: ");
        String inputText = scanner.nextLine();

        if (isPalindrome(inputText)) {
            System.out.println(inputText + " on palindroom.");
        } else {
            System.out.println(inputText + " ei ole palindroom.");
        }

        scanner.close();
    }

    public static boolean isPalindrome(String text) {
        // Eemalda kõik mitte-tähtedevahelised sümbolid ja teisenda tekst väiketähtedeks
        text = text.replaceAll("[^a-zA-Z]", "").toLowerCase();

        int length = text.length();
        for (int i = 0; i < length / 2; i++) {
            if (text.charAt(i) != text.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
