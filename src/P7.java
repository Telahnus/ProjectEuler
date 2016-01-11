import java.util.ArrayList;

/*
 * By listing the first six prime numbers:
 * 2, 3, 5, 7, 11, and 13,
 * we can see that the 6th prime is 13.
 * What is the 10001st prime number?
 */

public class P7 {

	public static void main(String[] args) {

		ArrayList<Integer> primes = new ArrayList<Integer>();
		primes.add(2);
		int count = 1;
		int num = 3; // starting number to check

		while (count < 10001) { // find up to the 10001st prime
			boolean prime = true;
			for (int p : primes) { // trial division only by previous primes
				if (p > Math.sqrt(num)) { // check up to sqrt of current candidate
					break;
				}
				if (num % p == 0) { // if an even division, then composite
					prime = false;
					break;
				}
			}
			if (prime) {
				primes.add(num);
				count++;
			}
			num += 2;
		}
		// print last prime found
		System.out.println(primes.get(primes.size() - 1));
		//System.out.println(primes);
	}
}
