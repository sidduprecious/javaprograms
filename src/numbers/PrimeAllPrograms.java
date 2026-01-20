package numbers;
public class PrimeAllPrograms {

	// common prime number metod

	static boolean isPrime(int n) {

	    if (n <= 1) {
	        return false;
	    }
	    else {
	        for (int i = 2; i < n; i++) {   // check till n-1
	            if (n % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	}

	public static void main(String[] args) {

		// check prime or not
		int n = 17;

		if (isPrime(n))
			System.out.println(n + " is Prime");
		else
			System.out.println(n + " is Not Prime");

		// prime num in range
		int n1 = 10, n2 = 30;

		System.out.println("\nPrimes in range:");
		for (int i = n1; i <= n2; i++) {
			if (isPrime(i)) {
				System.out.println(i);
			}
		}

		// sum of prime number in range

		int sum = 0;

		for (int i = n1; i <= n2; i++) {
			if (isPrime(i)) {
				sum += i;
			}
		}
		System.out.println("\nSum of primes in range = " + sum);

		// first N prime numbers
		int N = 10; // first 10 primes
		int count = 0;
		int num = 2;

		System.out.println("\nFirst " + N + " prime numbers:");
		while (count < N) {
			if (isPrime(num)) {
				System.out.println(num);
				count++;
			}
			num++;
		}
	}
}
