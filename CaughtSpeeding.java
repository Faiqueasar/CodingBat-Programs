package codingbat;

public class  CaughtSpeeding {
	public static int caughtSpeeding(int speed, boolean isBirthday) {
		  int ticket = 0;
		if (isBirthday) {
		speed -= 5;
		}
		if (speed > 60 && speed <= 80) {
		ticket = 1;
		}
		else if (speed > 80) {
		ticket = 2;
		}
		return ticket;
		}


	public static void main(String[] args) {
  System.out.println(caughtSpeeding(60,false));
  System.out.println(caughtSpeeding(65,false));
  System.out.println(caughtSpeeding(65,true));
	}

}
