package codingbat;

public class TwoasOne {
	public static boolean twoAsOne(int a, int b, int c) {
		 if(a+b==c ||b+c==a || a+c==b)
		 {
		   return true;
		 }
		 return false;
		}


	public static void main(String[] args) {
System.out.println(twoAsOne(1,2,3));
System.out.println(twoAsOne(3,1,2));
System.out.println(twoAsOne(3,2,2));
	}

}
