package bucles;

import java.util.Scanner;

public class e8 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix un numero positiu: ");
        int num = sc.nextInt();
        boolean fi = false;
        String binari = "";

        do {
            binari = num % 2 + binari;
            num = num / 2;
            if (num == 1 || num == 0) {
                binari = num + binari;
                fi = true;
            }

        }while (!fi);
        System.out.println(binari);
    }
}
