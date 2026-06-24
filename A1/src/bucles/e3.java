package bucles;

import java.util.Scanner;

public class e3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, factorial = 1, comptador;
        String operacio = "";
        System.out.println("Introdueix el numero que vols fer el factorial: ");
        num = sc.nextInt();

        comptador = num;
        while (comptador != 1) {
            operacio += comptador + " x ";
            factorial *= comptador;
            comptador--;
        }
        System.out.println(num + "! = " + operacio + "1 = " + factorial);

    }
}
