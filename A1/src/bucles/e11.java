package bucles;

import java.util.Random;
import java.util.Scanner;

public class e11 {
    static final int MIN = 0;
    static final int MAX = 10;

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();
        int opcio, correctes, intents = 0;

        do {
            System.out.println("""
                    VENVINGUT AL JOC DE LES OPERACIONS, INDICA UNA DE LES SEGUENTS OPCIONS INDICANT EL NUMERO CORRESPONENT
                    0. SORTIR
                    1. SUMES
                    2. RESTES
                    3. MULTIPLICACIONS
                    4. DIVISIONS""");

            opcio = sc.nextInt();
            sc.nextLine();
            correctes = 0;

        switch (opcio) {
            case 0 -> {
                System.out.println("Has sortit del joc, fins aviat");
            }
            case 1 -> {
                System.out.println("Has seleccionat el joc de les sumes");
                while (correctes != 5){
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
            case 2 -> {
                System.out.println("Has seleccionat el joc de les restes");
                while (correctes != 5){
                    int numA = rn.nextInt(MIN, MAX + 1), numB = rn.nextInt(MIN, MAX + 1), resposta;

                    System.out.println("Fes la seguent operacio: " + numA +"-" + numB );
                    resposta = sc.nextInt();
                    sc.nextLine();

                    if (resposta == (numA - numB)) {
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
            case 3 -> {
                System.out.println("Has seleccionat el joc de les multiplicacions");
                while (correctes != 5){
                    int numA = rn.nextInt(MIN, MAX + 1), numB = rn.nextInt(MIN, MAX + 1), resposta;

                    System.out.println("Fes la seguent operacio: " + numA +"X" + numB );
                    resposta = sc.nextInt();
                    sc.nextLine();

                    if (resposta == (numA * numB)) {
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
            case 4 -> {
                System.out.println("Has seleccionat el joc de les divisions");
                while (correctes != 5){
                    int numA = rn.nextInt(MIN, MAX + 1), numB = rn.nextInt(MIN, MAX + 1), resposta;

                    System.out.println("Fes la seguent operacio: " + numA +"/" + numB );
                    resposta = sc.nextInt();
                    sc.nextLine();

                    if (resposta == (numA / numB)) {
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
            default -> {
                System.out.println("Has seleccionat una dada incorrecta, torna ha intentar");
            }
        }
        }while (opcio!=0);
    }
}
