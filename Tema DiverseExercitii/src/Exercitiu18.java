import java.util.Scanner;

public class Exercitiu18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();	
		int min = 9999;

		for(int i=1; i<=n; i++)
		{
			int a=n%10;
			if(a<=min)
			{
				min=a;
			}
			n=n/10;

		}
		System.out.println(min);

		

	}

}
