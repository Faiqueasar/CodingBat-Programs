package codingbat;

public class NearTen {
	public static boolean nearTen(int num) {
		 if(num%10<=2 || num%10>=8)
		 {
		   return true;
		 }
		 {
		   return false; 
		 }
		}
	public static void main(String[] args) {
		System.out.println(nearTen(12));
		System.out.println(nearTen(17));
		System.out.println(nearTen(19));
	}


}
