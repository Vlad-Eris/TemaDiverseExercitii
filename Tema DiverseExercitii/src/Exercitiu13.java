import java.util.Scanner;

public class Exercitiu13 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for (int a = 0; a <= 1000; a++) {
            for (int b = 0; b <= 1000; b++) {
                if (a + b == 1000 && (a % 17 == 0) && (b % 19 == 0)) {
                    System.out.println("a: " + a + ", b: " + b);
                }
            }
        }

        scanner.close();
    }
}
