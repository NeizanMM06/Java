package bucles;

import java.util.Scanner;

public class e6 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad = 0, comptador = 0, adults = 0, suma = 0;
        float mitja = 0;

        while (edad!=-1) {
            System.out.println("Introdueix la edad d'un alumne, per sortir indica la edad -1: ");
            edad = sc.nextInt();
            sc.nextLine();

            if (edad != -1) {
                if (edad >= 18) adults++;
                suma += edad;
                comptador++;
            }
        }
        mitja = (float)suma/ comptador;
        System.out.println("El total de edats es: " + suma);
        System.out.println("La mitja de edad es : " + mitja);
        System.out.println("S'ha intoduit un total de: " + comptador + " alumnes");
        System.out.println("S'han detectat: " + adults + " alumnes majors de edad");
    }
}
