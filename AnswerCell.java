package codingbat;

public class AnswerCell {
	public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
		  if(isAsleep==true || isMorning==true && isMom==false)
		{
		  return false;
		}
		{
		  return true;
		}
		  
		}



	public static void main(String[] args) {
		System.out.println(answerCell(false,false,false));
		System.out.println(answerCell(false,false,true));
		System.out.println(answerCell(true,false,false));

	}

}
