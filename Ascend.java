// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend  {
	public static void main(String[] args){
		// step 1: setting lim according to a given number.
		int lim = Integer.parseInt(args[0]);
		// step 2: generating 3 random numbers in the field between 0 and lim.
		int a = (int) (Math.random() * lim);
		int b = (int) (Math.random() * lim);
		int c = (int) (Math.random() * lim);
		// step 3: organizing the numbers according to their value.
		int min = Math.min(Math.min(a, b), c);
		int max = Math.max(Math.max(a, b), c);
		int mid = (a + b + c) - min - max;
		// printing the results of step 2.
		System.out.println(a + " " + b + " "  + c);
		// printing the results of step 3.
		System.out.println(min + " " + mid + " " + max);
	}
}