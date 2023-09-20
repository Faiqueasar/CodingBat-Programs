package codingbat;

public class More20 {
	public static boolean more20(int n) {
		  if((n-2)%20==0 || (n-1)%20==0)
		{
		  return true;
		}
		{
		  return false;
		}
		  
		}


	public static void main(String[] args) {
		System.out.println(more20(20));
		System.out.println(more20(21));
		System.out.println(more20(22));

	}

}
