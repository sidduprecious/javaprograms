package numbers;
import java.util.Scanner;

public class posnegzeronumber {

	public static void main(String[] args) {
	
		int n;
		Scanner sc = new Scanner(System.in);
		n= sc.nextInt();
		if(n>0)
		{
			System.out.println("positive number");
		}
		else if(n<0)
		{
			System.out.println("negative number");
		}
		else if(n==0)
		{
			System.out.println("number is zero");
		}
		else
		{
			System.out.println("not a number");
		}
	}

}
