import java.util.Scanner;

public class Exercitiu9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti un numar diferit de 0 sau 1: ");
        int n = scanner.nextInt();

        // Verificarea dacă numărul este diferit de 0 sau 1 și apoi verificarea primalității în codul principal
        if (n != 0 && n != 1) {
            boolean estePrim = true;

            if (n < 2) {
                estePrim = false;
            } else {
                for (int i = 2; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        estePrim = false;
                        break;
                    }
                }
            }

            if (estePrim) {
                System.out.println(n + " este un numar prim.");
            } else {
                System.out.println(n + " nu este un numar prim.");
            }
        } else {
            System.out.println("Numarul trebuie sa fie diferit de 0 sau 1.");
        }

    }
}
