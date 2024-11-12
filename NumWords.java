// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    int n =Integer.parseInt(args[0]) ;
		int hundreds;
		int tens;
		int ones;
		hundreds=(n-(n%100))/100;
		n=n-(hundreds*100);
		tens= (n-(n%10))/10;
		ones=n%10;
		System.out.println(hundreds+" hundreds "+ tens+ " tens "+ ones+ " ones");
	}
}
