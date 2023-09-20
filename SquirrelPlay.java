package codingbat;

public class SquirrelPlay {
	public static boolean squirrelPlay(int temp, boolean isSummer) {
		  if(isSummer==true && temp>=60 && temp<=100)
		  {
		    return true;
		  }
		  else if(temp>=60 && temp<=90)
		  {
		    return true;
		  }
		  {
		    return false;
		  }
		}


	public static void main(String[] args) {
		System.out.println(squirrelPlay(70,true));
		System.out.println(squirrelPlay(95,false));
		System.out.println(squirrelPlay(95,true));

	}

}
