
public class CloseFar {
	public static boolean closeFar(int a, int b, int c) {
		  if (Math.abs(a - b) <= 1 && Math.abs(a - c) >= 2 && Math.abs(b - c) >= 2){
		      return true;
		  } else if (Math.abs(a - c) <= 1 && Math.abs(a - b) >= 2 && Math.abs(b - c) >= 2){
		      return true;
		  }else{
		      return false;
		  }
		  
		}


	public static void main(String[] args) {
		System.out.println(closeFar(1, 2, 10));
		System.out.println(closeFar(1, 2, 3));
		System.out.println(closeFar(4, 1, 3));

	}

}
