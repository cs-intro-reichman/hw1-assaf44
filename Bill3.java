// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		//step 1: recieving the names.
	    String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];
		// step 2: recieving total sum.
		int total = Integer.parseInt(args[3]);
		// step 3: dividing total sum by 3.
		double share = Math.ceil(total / 3.0);
		// step 4: printing output of the names by wanted order + each ones sum + manners as wanted.
		System.out.println("dear " + name3 + ", " + name2 + " and " + name1 + " your share is " + share);
		}
}
