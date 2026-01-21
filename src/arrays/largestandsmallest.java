package arrays;

public class largestandsmallest {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,0,222222,-1};
		
		int largest = a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>largest)
			{
				largest = a[i];
			}
		}
		
		System.out.println(largest);

	}

}
