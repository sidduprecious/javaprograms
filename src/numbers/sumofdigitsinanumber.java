package numbers;
import java.util.Scanner;

public class sumofdigitsinanumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		n= sc.nextInt();
		int sum=0;
		int lastdigit=0;
		while(n>0)
		{
			lastdigit= n%10;
			sum = sum + lastdigit;
			n=n/10;
		}
		System.out.println(sum);
	}

}
