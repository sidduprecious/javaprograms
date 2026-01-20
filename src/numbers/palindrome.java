package numbers;
import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
	
		int n;
		Scanner sc = new Scanner(System.in);
		n= sc.nextInt();
		int ncopy = n;
		int rev=0;
		int lastdigit=0;
		while(n>0)
		{
			lastdigit = n%10;
			rev = rev * 10 + lastdigit;
			n = n/10;
		}
		
		System.out.println(rev);
		
		if(ncopy == rev)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
	}
	

}
