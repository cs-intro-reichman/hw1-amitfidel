// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		System.out.println("pls enter a number");
	    int lim = Integer.parseInt(args[0]);
		int num1;
		int num2;
		int num3;
		num1=((int)(Math.random()*lim))+1;
		num2=((int)(Math.random()*lim))+1;
		num3=((int)(Math.random()*lim))+1;
		System.out.println(num1+ ", "+ num2 +", " +num3);
		if (Math.min(num2, num3)>num1) 
		{
			System.out.println(num1);
			System.out.println(Math.min(num2, num3));
			System.out.println(Math.max(num2, num3));
		}
		System.out.println(Math.min(num2, num3));
		System.out.println(Math.min(num1,Math.max(num2, num3)));
		System.out.println(Math.max(num1,Math.max(num2, num3)));

	}
}
