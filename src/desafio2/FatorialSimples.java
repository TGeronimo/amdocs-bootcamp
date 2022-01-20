package desafio2;

import java.util.Scanner;

public class FatorialSimples {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int fatorialDeN = fatorialSimples(n);
        System.out.println(fatorialDeN);
    }

    static int fatorialSimples(int n) {
        int aux = n - 1;
        int fatorial = n;
        while(aux > 1) {
            fatorial *= (aux);
            aux--;
        }
        return fatorial;
    }
}
