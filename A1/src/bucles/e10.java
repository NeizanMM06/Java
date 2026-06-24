package bucles;

import java.util.Random;
import java.util.Scanner;

public class e10 {
    static final int MIN = 0;
    static final int MAX = 10;

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();
        int correctes = 0, intents = 0;

        while (correctes != 5) {
            int numA = rn.nextInt(MIN, MAX + 1), numB = rn.nextInt(MIN, MAX + 1), resposta;

            System.out.println("Fes la seguent operacio: " + numA +"+" + numB );
            resposta = sc.nextInt();
            sc.nextLine();

            if (resposta == (numA + numB)) {
                System.out.println("¡CORRECTE!");
                correctes++;
            }else {
                System.out.println("¡INCORRECTE!");
                correctes = 0;
            }
            intents++;
        }
        System.out.println("Felicitats has aconseguit ensertar 5 seguides!");
        System.out.println("Has fet: " + intents + " intents");
    }
}
