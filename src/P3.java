/*
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */
public class P3 {

	private static long num = 600851475143L;

	public static void main(String[] args) {
		long cur = num;
		while (cur % 2 == 0) {
			cur /= 2;
			System.out.println("pf:" + 2 + ", cur:" + cur);
		}
		// potential factor
		for (int i = 3; i * i <= cur; i += 2) {
			//System.out.print(i + ",");
			while (cur % i == 0) {
				cur /= i;
				System.out.println("pf:" + i + ", cur:" + cur);
			}
		}
		if (cur > 1) {
			System.out.println("top pf: " + cur);
		}
	}
}