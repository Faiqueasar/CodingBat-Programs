package codingbat;
public class ShareDigit{

public static boolean shareDigit(int a, int b) {
	  if(a/10==b/10||a/10==b%10)
	  {
	    return true;
	  }
	  else if((a%10==b%10||a%10==b/10))
	{
	  return true;
	}
	{
	  return false;
	}
}


	public static void main(String[] args) {
System.out.println(shareDigit(12,23));
System.out.println(shareDigit(12,43));
System.out.println(shareDigit(12,44));

	}
}


