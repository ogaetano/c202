import java.util.*

public class fac {
	
	public static void main (String[] args) {
		
		int num = Integer.parseInt(args[0]);

		switch ( num) {
			case 0:
				System.out.println("Last digit is 0");
				break;
			case 1:

				System.out.println("Last digit is 1");
				break;
			case 2:
				System.out.println("Last digit is 2");
				break;
			case 3:
				System.out.println("Last digit is 6");
                                break;
			case 4:
				System.out.println("Last digit is 4");
                                break;
			default:
				System.out.println("Last digit is 0");
		} //switch
	}// main
} //fac class
