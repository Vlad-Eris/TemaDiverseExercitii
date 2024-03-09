import java.util.Scanner;

public class Exercitiu7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		double suma = 0;
		
		for(int i=0; i<=n; i++)
		{
			suma = suma+i;
		}
		System.out.println(suma/n);


	}

}
