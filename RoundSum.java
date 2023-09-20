
public class RoundSum {
	public static int roundSum(int a, int b, int c) {
		  return round10(a) + round10(b) + round10(c);
		}

		public static int round10(int n) {
		  if (n % 10 < 5)
		    return n - (n%10);
		  else
		    return n + (10 - (n%10));
		}

	public static void main(String[] args) {
		System.out.println(roundSum(16, 17, 18));
		System.out.println(roundSum(12, 13, 14));
		System.out.println(roundSum(6,4,4));

	}

}
