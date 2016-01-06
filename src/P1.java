public class P1 {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 3; i < 1000; i += 3) {
			count += i;
			//System.out.println(i);
		}
		for (int i = 5; i < 1000; i += 5) {
			count += i;
			//System.out.println(i);
		}
		for (int i = 15; i < 1000; i += 15) {
			count -= i;
			//System.out.println(i);
		}
		System.out.println(count);
	}

}
