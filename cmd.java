import java.util.*;

public class cmd{
	public static void main(String[]args){
		if (args[0].equals("-a")){
			for (int i = 0; i<args.length; i++){
				System.out.print(args[i]);
			} //for
		} //if -a, print every element in array

		else if (args[0].equals("-i")){
			if (args[1].equals("2"))
                                System.out.println(Integer.parseInt(args[2])+ 1);
                        else if (args[1].equals("3"))
                                System.out.println(args[3]);
                        else
                                System.out.println(Double.parseDouble(args[4]) + 1);
		} // if -i, print an  element + 1

		else if (args[0].equals("-ai")|| args[0].equals("-ia")){
			
			System.out.println((Integer.parseInt(args[1])+ 1));
			System.out.println(args[2]);
			System.out.println((Double.parseDouble(args[3])+ 1));
			
			/*for (int i = 2; i<args.length; i+=2){
                                System.out.print(args[i] + args[1] );
                        } //for*/
		}// if -ai, print every element + 1

		else if (args[0].equals("-h")){
			System.out.println("-a");
			System.out.println("\tPrints every argument");
			System.out.println("\n-i");
                        System.out.println("\tPrints chosen argument incremented by 1");
			System.out.println("\n-ia or -ia");
                        System.out.println("\tPrints every argument incremented by 1");
		} //if -h, print help

		else{
			if (args[0].equals("1"))
				System.out.println(args[1]);
			else if (args[0].equals("2"))
				System.out.println(args[2]);
			else
				System.out.println(args[3]);
		} //else, no flag, print an element
	} //main
} //class
