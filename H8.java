//Jan-Martti Olop
//Harjutus 8
import java.util.Scanner;
public class H8 {

	private static Scanner scanner = new Scanner (System.in);

	public static void main(String[] args) {

		System.out.print("Rööpküliku pindala (1) \nRistküliku pindala (2) \nKolmnurga pindala (3) \nRisttahuka ruum (4) \nparallelepipedi ruum  (5) \nRistküliku ruum (6) \nVali tegevus (7): "); 
		String valik = scanner.next();

		
		System.out.print("Sisesta alus: ");
		String alus = scanner.next();
		System.out.print("Sisesta kõrgus: ");
		String korgus = scanner.next();
		System.out.print("Sisesta laius: ");
		String laius = scanner.next();
		scanner.close();
		

		double s;
		switch (Integer.parseInt(valik)) {
		case 1:
			s = Pindalad.roopkylikS(alus, korgus);
			System.out.printf("Rööpküliku pindala on %.2f ",s); //see prindib välja rööpküliku valemi vastuse mis paned consoli kui tahab suuruseid
			break;
		case 2:
			s = Pindalad.ristkylikS(alus, korgus);
			System.out.printf("Ristküliku pindala on %.2f ",s); //See prindib välja ristküliku valemi
			break;
		case 3:
			s = Pindalad.kolmnurkS(alus, korgus);
			System.out.printf("Kolmnurga pindala on %.2f ",s); //See prindib välja kolmnurga valemi
			break;
        case 4:
            s = Ruumalad.ristahuka(alus, korgus, laius);
            System.out.printf("Risttahuka ruumala on %.2f ",s);
            break;
		case 5:
			s = Ruumalad.parallelepipedi(alus, korgus, laius);
			System.out.printf("Risttahuka ruumala on %.2f ",s);
            break;
		case 6:
			s = Ruumalad.Ristkülik(alus, korgus, laius);
			System.out.printf("Ristküliku ruumala on %.2f ",s);
			break;

		default:
			System.out.print("Valikust arusaamine ebaõnnestus!"); //see annab errori kui ei valinud mida teha tahaksid
			break;

		}
	}
}
