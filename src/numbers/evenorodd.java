package numbers;
import java.util.Scanner;

public class evenorodd {

	public static void main(String[] args) {
	
		int n;
		Scanner sc = new Scanner(System.in);
		n= sc.nextInt();
		if(n%2==0)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}
		
	}

}
