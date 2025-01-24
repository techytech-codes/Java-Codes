import java.util.Scanner;

public class CompareTwoDecimal {

	public static void main(String[] args) {
		char ch;
		Scanner input = new Scanner(System.in);
		char re;

		System.out.println("Enter any caracter : ");
	    ch = input.next().charAt(0);
	    
	    if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
	    	System.out.println(ch + " is a Alphabet.");
	    }
	    else if ((ch >='0') &&(ch <='9')) {
	    	System.out.println(ch + " is a Digit.");
	    	
	    }
	    else {
	    	System.out.println(ch + " is a special Character.");
	    }
		System.out.println("do u want to repeat? if yes pls press y or n");
		re= input.next().charAt(0);
		if (re == 'n') re=0;
		else re =1;
		
	while(re == 1);
	System.out.println("ends");
  }
}
