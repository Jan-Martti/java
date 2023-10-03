//Jan-Martti Olop
//Harjutus 8
import java.util.Scanner;

public class H8 {
    // Meetod kuupühimiku ruumala arvutamiseks
    public static double kuupuhikuRuumala(double külg) {
        return külg * külg * külg;
    }

    // Meetod risttahuka ruumala arvutamiseks
    public static double risttahukaRuumala(double pikkus, double laius, double kõrgus) {
        return pikkus * laius * kõrgus;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tere tulemast Ruumalade kalkulaatorisse!");

        System.out.print("Kas soovite arvutada kuupühimiku (K) või risttahuka (R) ruumala? ");
        String valik = scanner.next();

        if (valik.equalsIgnoreCase("K")) {
            System.out.print("Sisestage kuupühimiku külje pikkus: ");
            double külg = scanner.nextDouble();
            double ruumala = kuupuhikuRuumala(külg);
            System.out.println("Kuupühimiku ruumala on " + ruumala);
        } else if (valik.equalsIgnoreCase("R")) {
            System.out.print("Sisestage risttahuka pikkus: ");
            double pikkus = scanner.nextDouble();
            System.out.print("Sisestage risttahuka laius: ");
            double laius = scanner.nextDouble();
            System.out.print("Sisestage risttahuka kõrgus: ");
            double kõrgus = scanner.nextDouble();
            double ruumala = risttahukaRuumala(pikkus, laius, kõrgus);
            System.out.println("Risttahuka ruumala on " + ruumala);
        } else {
            System.out.println("Vigane valik! Palun valige K või R.");
        }

        scanner.close();
    }
}
