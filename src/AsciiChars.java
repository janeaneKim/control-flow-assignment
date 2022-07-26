import java.util.Scanner;

public class AsciiChars {

	  public static void printNumbers()
	  {
		  for (int i = 48; i<=57; ++i) {
			  char charVal = (char)i;
			  System.out.println(charVal + "'s ASCII value is " + i + ".");
		  }
		  
	  }
	  public static void printLowerCase()
	  {
	    // TODO: print valid lowercase alphabetic input
		  for (int i = 97; i<=122; ++i) {
			  char charVal = (char)i;
			  System.out.println(charVal + "'s ASCII value is " + i + ".");
		  }
	  }
	
	  public static void printUpperCase()
	  {
	    // TODO: print valid uppercase alphabetic input
		  for (int i = 65; i<=90; ++i) {
			  char charVal = (char)i;
			  System.out.println(charVal + "'s ASCII value is " + i + ".");
		  }
	  }
	  
	  public static void main(String [] args) {
		  AsciiChars.printNumbers();
		  AsciiChars.printUpperCase();
		  AsciiChars.printLowerCase();
		  
	  }
}
	

