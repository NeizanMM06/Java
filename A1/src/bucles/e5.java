package bucles;

import java.sql.SQLOutput;
import java.util.Scanner;

public class e5 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int comptador = 0, num, compSuspesos = 0, compAprovats = 0;
        while (comptador!=5) {
            System.out.println("Introdueix la nota d'un alumne: ");
            num = sc.nextInt();
            sc.nextLine();

            if (!(num > 0 && num < 10)) System.out.println("Nota incorrecta torna ha intentar");
            else if(num < 5) {
                compSuspesos++;
                comptador++;
            }else if (num >= 5) {
                compAprovats++;
                comptador++;
            }
        }

        System.out.println(compAprovats + " alumnes han aprovat");
        System.out.println(compSuspesos + " alumnes han suspes");
    }
}
