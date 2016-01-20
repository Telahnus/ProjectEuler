/*
 * A Pythagorean triplet is a set of three natural numbers,
 * a < b < c, for which, a^2 + b^2 = c^2
 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */
public class P9 {

	public static void main(String[] args) {
		Boolean isPy = false;
		Boolean isSum = false;
		int sum = 1000;
		for (int c = 3; c < 1000; c++) {
			for (int b = 2; b < c; b++) {
				for (int a = 1; a < b; a++) {
					isPy = false;
					if (a * a + b * b == c * c) {
						isPy = true;
					}
					if (isPy) {
						if (a + b + c == sum) {
							isSum = true;
						}
					}
					if (isPy & isSum) {
						System.out.println(a + " " + b + " " + c);
						System.out.println((long) a * b * c);
						System.exit(1);
					}
				}
			}
		}
	}
}
