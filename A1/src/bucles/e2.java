package bucles;

import java.util.Scanner;

public class e2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, comptador = 0, sumaParells = 0;

        while (comptador != 10) {
            System.out.println("Entra un numero positiu: ");
            num = sc.nextInt();
            if (num%2 == 0) sumaParells += num;
            comptador++;
        }
        System.out.println(sumaParells);
    }
}
