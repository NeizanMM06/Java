package bucles;

import java.util.Random;
import java.util.Scanner;

public class e9 {
    static final int MIN = 0;
    static final int MAX = 100;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();

        boolean sortir = false;
        int num, numeroAleatori = rn.nextInt(MIN, MAX + 1);

        while (!sortir) {
            System.out.println("Indica -1 per sortir del joc");
            System.out.println("Adivina el numero aleatori del 0 al 100: ");
            num = sc.nextInt();
            sc.nextLine();
            if (num == -1){
                System.out.println("Has sortit del joc, fins aviat");
                sortir = true;
            } else {
                if (num == numeroAleatori) {
                    System.out.println("Has adivinat el numero");
                    sortir = true;
                } else if (num > numeroAleatori) {
                    System.out.println("El numero es mes petit");
                } else {
                    System.out.println("El numero es mes gran");
                }
            }
        }
    }
}
