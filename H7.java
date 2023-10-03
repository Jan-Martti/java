//Jan-Martti Olop
//harjutus 7

import java.util.InputMismatchException;
import java.util.Scanner;

public class H7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Sisesta esimene arv: ");
                double nr1 = scanner.nextDouble();
                
                System.out.print("Sisesta teine arv: ");
                double nr2 = scanner.nextDouble();

                double tulemus = nr1 + nr2;

                System.out.println("vastus: " + tulemus);
                break;
            } catch (InputMismatchException e) {
                System.out.println("See ei olnud number kirjuta uuesti");
                scanner.nextLine();
            }
        }

        scanner.close();
    }
}