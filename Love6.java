package codingbat;

public class Love6 {
	public static boolean love6(int a, int b) {
		  if((a+b==6)||(a==6)||(b==6)||(Math.abs(a-b)==6))
		  {
		    return true;
		  }
		  {
		    return false;
		  }
		}


	public static void main(String[] args) {
		System.out.println(love6(6,4));
		System.out.println(love6(1,5));
		System.out.println(love6(4,5));

	}

}
