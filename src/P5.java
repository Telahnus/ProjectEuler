/*
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 *
 * Really simple, brute force method
 * Possible to optimize more?
 */
public class P5 {

	public static void main(String[] args) {
		// optimized by increasing by 20
		for (int i = 20; i < 1000000000; i += 20) {
			Boolean check = true;
			for (int j = 1; j <= 20; j++) {
				if (i % j != 0) {
					check = false;
					break;
				}
			}
			if (check) {
				System.out.println(i);
				break;
			}
		}
		System.out.println("done");
	}

}
