// Jan-Martti Olop
// 01/10/2023
// harjutus 9

public class KT {
    public static void main(String[] args) {
        try {
            // Kutsutakse alamprogrammi, et prindiks arvud ja käidelda erandeid
            printNumbers();
        } catch (Exception e) { // Käideldakse erandeid, mis võivad tekkida
            System.out.println("Erind tekkis: " + e); // Prinditakse erandi teade koos üksikasjadega
        }
    }

    // Alamprogramm, mis prindib arvud 1-66 või mis iganes sa valid 
    public static void printNumbers() {
        for (int i = 1; i <= 66; i++) {
            System.out.print(i); // Prinditakse arv
        }
        System.out.println(); // Liigutakse uuele reale
    }
}



