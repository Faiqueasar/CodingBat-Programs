package codingbat;

public class Squirrels {
	public static boolean cigarParty(int cigars, boolean isWeekend) {
		if(isWeekend==true && cigars>=40)
		{
		  return true;
		}
		else if(!(isWeekend)&& cigars>=40 && cigars<=60)
		{
		  return true;
		}
		{
		  return false;
		}
		  
		}
	public static void main(String[] args) {
		System.out.println(cigarParty(30,false));
		System.out.println(cigarParty(50,false));
		System.out.println(cigarParty(70,true));

	}

}
