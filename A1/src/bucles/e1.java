package bucles;

import java.util.Scanner;

public class e1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("introdueix un valor: ");
        num = sc.nextInt();

        while (num != 0) {
            System.out.println(num);
            num--;
        }
    }
}
