package arrays;

import java.util.HashMap;

public class frequencyofeachelement {

	public static void main(String[] args) {
		int[] arr = {1,2,2,3,1};
		
		HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
		
		for(int i:arr)
		{
			hmap.put(i, hmap.getOrDefault(i,0) +1);
		}
		
		System.out.println(hmap);
	}

}
