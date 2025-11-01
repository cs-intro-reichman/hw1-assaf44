// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args) {
      // step 1: recieving given amount of money.
      double currentvalue = Double.parseDouble (args[0]);
      // step 2: recieving growth rate as a number.
      double rate = Double.parseDouble (args[1]);
      // step 3: converting args[1] from step 3 to percentages.
      double result = rate / 100.0;
      // step 4: recieving number of years.
      int n = Integer.parseInt (args[2]);
      // step 5: calculating the sum according to the given formula.
      double futureValue = currentvalue * Math.pow(1 + result, n);
      // step 6: printing step 5 + manners as wanted.
      System.out.println("After " + n + " years, " + (int)currentvalue + "$ saved at " + (int)rate + "% will yield " + (int)futureValue);
   }
}