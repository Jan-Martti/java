//Jan-Martti Olop
//Harjutus 8
import java.util.Scanner;

public class H8 {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Rööpküliku pindala (1)\nRistküliku pindala (2)\nKolmnurga pindala (3)\nRisttahuka ruum (4)\nparallelepipedi ruum  (5)\nRistküliku ruum (6)\nVali tegevus (7): ");
        String valik = scanner.next();

        System.out.print("Sisesta alus: ");
        double alus = Double.parseDouble(scanner.next());
        System.out.print("Sisesta kõrgus: ");
        double korgus = Double.parseDouble(scanner.next());
        System.out.print("Sisesta laius: ");
        double laius = Double.parseDouble(scanner.next());
       

        double s;
        switch (Integer.parseInt(valik)) {
            case 1:
                s = Pindalad.roopkylikS(alus, korgus);
                System.out.printf("Rööpküliku pindala on %.2f", s); //see prindib välja rööpküliku valemi vastuse mis paned consoli kui tahab suuruseid
                break;
            case 2:
                s = Pindalad.ristkylikS(alus, korgus);
                System.out.printf("Ristküliku pindala on %.2f", s); 
                break;
            case 3:
                s = Pindalad.kolmnurkS(alus, korgus);
                System.out.printf("Kolmnurga pindala on %.2f", s); 
                break;
            case 4:
                s = Ruumalad.ristahuka(alus, korgus, laius);
                System.out.printf("Risttahuka ruumala on %.2f", s);
                break;
            case 5:
                s = Ruumalad.parallelepipedi(alus, korgus, laius);
                System.out.printf("Parallelepipedi ruumala on %.2f", s);
                break;
            case 6:
                s = Ruumalad.Ristkülik(alus,korgus,laius);
                System.out.printf("Ristküliku ruumala on %.2f", s);
                break;
            default:
                System.out.print("Valikust arusaamine ebaõnnestus!");
                break;
        }

        scanner.close();
    }
}
