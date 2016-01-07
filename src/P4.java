/*
 * A palindromic number reads the same both ways.
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */

public class P4 {
	public static void main(String[] args) {

		int prevpal = 0;
		int p2 = 0;

		for (int i = 999; i >= 100; i--) {
			// no need to check the same numbers
			if (i < p2) {
				break;
			}
			for (int j = 999; j >= 100; j--) {
				Boolean check = true;
				int pal = i * j;
				String pals = String.valueOf(pal);
				int length = pals.length();
				for (int k = 0; k < length / 2; k++) {
					// compares characters at mirror indexes
					if (pals.charAt(k) != pals.charAt(pals.length() - k - 1)) {
						check = false;
						break;
					}
				}
				if (check) {
					if (pal > prevpal) {
						prevpal = pal;
						p2 = j; // save j factor of largest palindrome
					}
				}
			}
		}
		System.out.println(prevpal);
	}
}
