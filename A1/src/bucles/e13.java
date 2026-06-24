package bucles;

import java.util.Scanner;

public class e13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        do {
            System.out.println("Introdueix un valor positiu: ");
            num = sc.nextInt();

            if (num <= 0) {
                System.out.println("Error: el número ha de ser positiu.");
            }
        }while (num < 0);

        int comptador = 0;
        for (int i = 2; i <= num; i++) {
            int divisors = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) divisors++;
            }
            if (divisors == 2) {
                System.out.println(i + " es primer");
                comptador++;
            }
        }

        System.out.println("Total de nombres primers entre 1 i " + num + ": " + comptador);
    }
}