package arrays;

import java.util.ArrayList;

public class arraylistduplicateremoval {

	public static void main(String[] args) {

		int a[] = { 10, 20, 30, 40, 50, 0, 222222, -1, 20, 30 };

		ArrayList al = new ArrayList();

		for (int i = 0; i < a.length; i++) {

			if (!al.contains(a[i])) {
					al.add(a[i]);
			}

		}
		
		System.out.println(al);

	}
}
