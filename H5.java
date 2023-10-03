//Jan-Martti Olop
// harjutus 5
import java.util.Scanner;

public class H5 {
    public static void main(String[] args){
        calc();
    }
    public static void calc(){
        for (int i = 0; i < 3; i++){
            Scanner scan = new Scanner(System.in);
            System.out.println("sisesta esimene arv: ");
            double nr1 = scan.nextInt();
            System.out.println("sisesta teine arv: ");
            double nr2 = scan.nextInt();

            
            if (nr1 <= 0 || nr2 <= 0) {
                System.out.println("arvud ei jagu");
                System.exit(0);
            }
            System.out.println("vastus on: " + nr1/nr2);
            scan.close();
        }
    }
}
