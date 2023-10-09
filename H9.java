//Jan-Martti Olop
//Harjutus 9
//   10/10/2023  00:38

class Motikas {
    private String mudel;

    public Motikas(String mudel, int tootmisaasta) {
        this.mudel = mudel;
        System.out.println("Motika toomis aasta " + tootmisaasta);
    }

    public void käivita() {
        System.out.println(mudel + " pandi tööle");
    }

    public String toString() {
        return mudel;
    }
}

//soitjate klass
class Soitja {
    public String nimi;
    public Soitja(String nimi) {
        this.nimi = nimi;
    }
    public void soida(Motikas tsikkel) {
        System.out.println(nimi + " soidab " + tsikkel + " tsikliga.");
    }
    public String toString() {
        return nimi;
    }
}

//treeningraja klass
class Treeningrada {
    private int pikkus; //MEETRITES!!!!!!!!!!
    public Treeningrada(int pikkus) {
        this.pikkus = pikkus;
    }
    public void alustaTreeningut(Soitja soitja) {
        System.out.println(soitja + " alustab treeningut " + " treeningrajal, mis on " + pikkus + " meetrit pikk.");
    }
}

//main klass
public class H9 {
    public static void main(String[] args) {
        Motikas Husqvarna = new Motikas("Apriilia Wr", 2006);
        Soitja soitja1 = new Soitja("Jaanus");
        Motikas kawasaki = new Motikas("Kawasaki Ninja H2R", 2018);
        Soitja soitja2 = new Soitja("Janar");
        //Näited objektide kasutamisest
        Husqvarna.käivita();            //käivitab Husqvarna
        soitja1.soida(Husqvarna);       //soidab Husqvarnaga
        kawasaki.käivita();
        soitja2.soida(kawasaki);
    }
}