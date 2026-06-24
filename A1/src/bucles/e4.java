package bucles;

import java.util.Scanner;

public class e4 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, quadrat;
        String sortir = "";

        while (!sortir.equals("si")) {
            System.out.println("Introdueix un numero: ");
            num = sc.nextInt();
            sc.nextLine();

            quadrat = num * num;

            if (num > 0)System.out.println("El numero es: positiu");
            else System.out.println("El numero es: negatiu");
            System.out.println();
            if (num%2 == 0)System.out.println("El numero es: parell");
            else System.out.println("El numero es : inparell");
            System.out.println();
            System.out.println("El quadrat de " + num + " es: " + quadrat);
            System.out.println("-------------------------------------");
            System.out.println();
            System.out.println("Indica -si- si vols sortir, sino introdueix cualsevol lletra: ");
            sortir = sc.nextLine().toLowerCase();
            if (sortir.equals("si")) System.out.println("Fins aviat");
        }
    }
}
