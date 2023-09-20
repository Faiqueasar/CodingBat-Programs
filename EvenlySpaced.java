import java.util.Arrays;

public class EvenlySpaced {
	public static boolean evenlySpaced(int a, int b, int c) {
		  int[] anArray = {a, b, c};
		  Arrays.sort(anArray);

		  int diffLow = anArray[1] - anArray[0];
		  int diffHi = anArray[2] - anArray[1];

		  if (diffLow == diffHi)
		    return true;
		  else
		    return false;  

		}


	public static void main(String[] args) {
		System.out.println(evenlySpaced((2, 4, 6));
		System.out.println(evenlySpaced((4, 6, 2));
		System.out.println(evenlySpaced((4, 6, 3));

	}

}
