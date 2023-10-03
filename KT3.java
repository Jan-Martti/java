//Jan-Martti Olop
//harjutus 19


import java.util.Scanner;

public class KT3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sisesta kümnendsüsteemi arv: ");
        int decimal = scanner.nextInt();

        String binary = Integer.toBinaryString(decimal);

        System.out.println("Kahendsüsteemi teisendus: " + binary);

        scanner.close();
    }
}