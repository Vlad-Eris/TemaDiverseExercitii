import java.util.Scanner;

public class Exercitiu17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();	
		int max = -9999;

		for(int i=1; i<=n; i++)
		{
			int a=n%10;
			if(a>=max)
			{
				max=a;
			}
			n=n/10;

		}
		System.out.println(max);

		

	}

}
