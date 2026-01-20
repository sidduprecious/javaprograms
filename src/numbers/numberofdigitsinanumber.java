package numbers;
import java.util.Scanner;

public class numberofdigitsinanumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		n= sc.nextInt();
		int count=0;
		int lastdigit=0;
		while(n>0)
		{
			lastdigit =n%10;
			count++;
			n=n/10;
		}
		System.out.println(count);
		
	}
}
