package numbers;
import java.util.Scanner;

public class productofdigits {

	public static void main(String[] args) {
	
		int n=1234;
		int product = 1;
		int lastdigit=0;
		while(n>0)
		{
			lastdigit = n%10;
			product = product * lastdigit;
			n = n/10;
		}
		System.out.println(product);
	}
}
