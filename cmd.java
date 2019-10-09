import java.util.*;

public class cmd{
	public static void main(String[]args){
		
		switch(args[0]) {
			case -a:
				for (int i = 0; i<args.length; i++){
                                System.out.print(args[i]);
                       	 	} //for
				break;
			case -i:
				if (args[1].equals("2"))
                                	System.out.println(Integer.parseInt(args[2])+ 1);
                        	else if (args[1].equals("3"))
                                	System.out.println(args[3]);
                        	else
                                	System.out.println(Double.parseDouble(args[4]) + 1);
				break;
			case -ai:
			case -ia:
				System.out.println((Integer.parseInt(args[1])+ 1));
        	                System.out.println(args[2]);
	                        System.out.println((Double.parseDouble(args[3])+ 1));
				break;
			case -h:
				System.out.println("-a");
	                        System.out.println("\tPrints every argument");
        	                System.out.println("\n-i");
                	        System.out.println("\tPrints chosen argument incremented by 1");
                        	System.out.println("\n-ia or -ia");
                        	System.out.println("\tPrints every argument incremented by 1");
				break;
			default:
				if (args[0].equals("1"))
	                                System.out.println(args[1]);
        	                else if (args[0].equals("2"))
                	                System.out.println(args[2]);
                        	else
                                	System.out.println(args[3]);
				
		} //switch		
	} //main
} //class
