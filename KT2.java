//Jan-Martti Olop
//harjutus 11

public class KT2 {
    public static void main(String[] args) {
        try {
            // Kutsutakse alamprogrammi, et prindiks arvud, mis on jaguvad 3-ga ja käidelda erandeid
            printNumbersDivisibleByThree();
        } catch (Exception e) { // Käideldakse erandeid, mis võivad tekkida
            System.out.println("Erind tekkis: " + e); // Prinditakse erandi teade koos üksikasjadega
        }
    }

    // Alamprogramm, mis prindib arvud , mis jaguvad 3-ga
    public static void printNumbersDivisibleByThree() {
        for (int i = 1; i <= 66; i++) {
            if (i % 3 == 0) { // Kontrollitakse, kas arv on jaguv 3-ga
                System.out.print(i + ", "); // Prinditakse arv, kui see on jaguv 3-ga
            }
        }
        System.out.println(); // Liigutakse uuele reale
    }
}
