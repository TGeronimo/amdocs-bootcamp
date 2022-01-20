package desafio2;

import java.util.Scanner;

public class SomaImparesConsecutivos {

    static int somaDosImpares = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        somaDosImpares = somaImpares(x, y);

        System.out.println(somaDosImpares);
    }

    static int somaImpares(int x, int y) {

        if (x > y) {
            if ((x % 2) != 0) x--;
            for (; x > y; x--) {
                if ((x % 2) != 0) somaDosImpares += x;
            }
        } else if (x < y) {
            if ((x % 2) != 0) x++;
            for (; x < y; x++) {
                if ((x % 2) != 0) somaDosImpares += x;
            }
        }
        return somaDosImpares;
    }

}
