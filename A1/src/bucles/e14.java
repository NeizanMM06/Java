package bucles;

import java.util.Scanner;

public class e14 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica la quantitat de linies que tindra el dibuix: ");
        int linies = sc.nextInt();
        sc.nextLine();

        System.out.println("""
                Indica quina opcio vols:
                0. sortir
                1. opcio 1
                2. opcio 2
                3. opcio 3
                4. opcio 4
                5. opcio 5
                6. opcio 6
                """);
        int opcio = sc.nextInt();
        sc.nextLine();
        
        switch (opcio) {
            case 0 -> {
                System.out.println("Has sortit del programa");
            }
            case 1 -> {
                System.out.println("opcio 1");
                for (int i = 0; i < linies; i++) {
                    System.out.println();
                    for (int j = 1; j < i; j++) {
                        System.out.print("*".repeat(j));
                    }
                    
                }
            }
            case 2 -> {
                System.out.println("opcio 2");
            }
            case 3 -> {
                System.out.println("opcio 3");
            }
            case 4 -> {
                System.out.println("opcio 4");
            }
            case 5 -> {
                System.out.println("opcio 5");
            }
            case 6 -> {
                System.out.println("opcio 6");
            }
            default -> {
                System.out.println("opcio incorrecta");
            }
            
        }
        
    }
}
