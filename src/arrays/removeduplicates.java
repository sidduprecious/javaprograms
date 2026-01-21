package arrays;

public class removeduplicates {

    public static void main(String[] args) {

        int a[] = {10, 20, 30, 40, 50, 0, 222222, -1, 20, 30};
        int b[] = new int[a.length];

        int temp = 0;
        int index = 0;

        // ---------- SORT THE ARRAY ----------
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        // ---------- REMOVE DUPLICATES ----------
        for (int i = 0; i < a.length; i++) {

            if (i > 0 && a[i] == a[i - 1]) {
                continue;   // skip duplicate
            }

            b[index] = a[i];  // store unique value
            index++;
        }

        // ---------- PRINT UNIQUE ELEMENTS ----------
        System.out.print("After removing duplicates: ");
        for (int i = 0; i < index; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
