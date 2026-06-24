package bucles;

import java.util.Scanner;

public class e12 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int resposta, numAnterior = 1, comptador = 0;
        String fibonacci = "0 1";
        do {
            System.out.println("Introdueix un valor per fer la secceccio de fibonacci: ");
            resposta = sc.nextInt();
            sc.nextLine();
        } while (resposta < 0);

        while(comptador != 20) {
            fibonacci += " " + resposta;
            resposta = numAnterior + resposta;
            numAnterior = resposta;
            comptador++;
        }
        System.out.println(fibonacci);
    }
}
