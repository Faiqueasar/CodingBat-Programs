package codingbat;

public class AlarmClock {
	public static String alarmClock(int day, boolean vacation) {
		  if (vacation==false && day>=1 && day<=5)
		  {
		    return "7:00";
		  }
		  else if(vacation==false && (day==0 || day==6 )||(vacation==true && day>=1 && day<=5))
		  {
		    return "10:00";
		  }
		  {
		    return "off";
		  }
		}
	public static void main(String[] args) {
		System.out.println(alarmClock(1,false));
		System.out.println(alarmClock(5,false));
		System.out.println(alarmClock(0,false));
	}

}
