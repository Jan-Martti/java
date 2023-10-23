//Jan-Martti Olop
//harjutus 19


import java.util.Scanner;

public class KT3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Kutsutakse alamprogrammi, et teisendada kümnendsüsteemi arv kahendsüsteemi ja käidelda erandeid
            convertDecimalToBinary(scanner);
        } catch (Exception e) { // Käideldakse erandeid, mis võivad tekkida
            System.out.println("Erind tekkis: " + e); // Prinditakse erandi teade koos üksikasjadega
        } finally {
            scanner.close(); // Scanner tuleb lõpuks sulgeda
        }
    }

    // Alamprogramm, mis teisendab kümnendsüsteemi arvu kahendsüsteemi
    public static void convertDecimalToBinary(Scanner scanner) {
        System.out.print("Sisesta kümnendsüsteemi arv: ");
        int decimal = scanner.nextInt(); // Loetakse sisend kasutades scannerit

        String binary = Integer.toBinaryString(decimal); // Teisendatakse arv kahendsüsteemi

        System.out.println("Kahendsüsteemi teisendus: " + binary); // Prinditakse teisendatud arv
    }
}
