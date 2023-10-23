//Jan-Martti Olop
//harjutus 10

public class KT4 {
    public static void main(String[] args) {
        try {
            int arv = 1; // Algab muutuja 'arv' väärtusega 1

            while (arv <= 66) { // See on while-tsükkel, mis jätkub niikaua kui 'arv' on väiksem või võrdne 66-ga
                for (int i = 0; i < 5; i++) { // See on pesitsusfor-tsükkel, mis kordub 5 korda
                    if (arv <= 66) { // Kontrollitakse, kas 'arv' on endiselt väiksem või võrdne 66-ga
                        System.out.print(arv); // Prinditakse 'arv' praegune väärtus ilma rea vahetamata
                        arv++; // Suurendatakse 'arv' väärtust 1 võrra
                    }
                }
                System.out.println(); // Liigutatakse uuele reale pärast numbreid pesitsusfor-tsükli sees
            }
        } catch (Exception e) { // Käideldakse võimalikke erandeid
            System.out.println("Erind tekkis: " + e); // Prinditakse teade, kui erand tekib, koos erandi üksikasjadega
        }
    }
}
