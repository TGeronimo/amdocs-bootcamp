package desafio1;

import java.io.IOException;
import java.util.Scanner;

public class Colchao {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int A = leitor.nextInt();
        int B = leitor.nextInt();
        int C = leitor.nextInt();
        int H = leitor.nextInt();
        int L = leitor.nextInt();

        //Complete o problema com o seu código .
        boolean AFits = A < H || A < L;
        boolean BFits = B < H || B < L;
        boolean CFits = C < H || C < L;

        if ( AFits && BFits || AFits && CFits || BFits && CFits ) {
            System.out.println("S");
        } else System.out.println("N");

    }

}
