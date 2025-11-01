// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	// step 1: recieving the number.
	int fullNumber = Integer.parseInt(args[0]);
	// step 2: finding how many hundreds are in args[0] from step 1.
	int hundreds = (fullNumber / 100) % 10;
	// step 3: finding how many tens are in args[0] from step 1.
	int tens = (fullNumber / 10) % 10;
	// step 4: finding how many ones are in args[0] from step 1.
	int units = fullNumber % 10;
	// step 5: printing steps 2 - 4 + manners as wanted.
	System.out.println(hundreds + " hundreds, " + tens + " tens, and " + units + " ones");
	}
}