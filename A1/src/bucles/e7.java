package bucles;

import java.util.Scanner;

public class e7 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 11; i++) {
            System.out.print(i + ": ");
            for (int j = 0; j < 11; j++) {
                System.out.print(j + "x" +  i + "=" + j*i + " ");
            }
            System.out.println();
        }
    }
}
