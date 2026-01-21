package strings;

import java.util.HashMap;

public class charactercount {

	public static void main(String[] args) {
		String s = "Siddhartha";

		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		
		for(char c : s.toCharArray())
		{
			hmap.put(c, hmap.getOrDefault(c, 0)+1);
		}
		
		System.out.println(hmap);
	}

}
