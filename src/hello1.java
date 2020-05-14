import java.util.Scanner;


public class hello1 {
	public static void main(String[] args) {
		
		//final int NUMBER_OF_QUARTZ = 4;
		//int quart =18;
		
		//Scanner inputDevice = new Scanner(System.in);
		//System.out.println("Enter number of quarter >>");
		//quart = input.nextInt();
		
		//int gallons = 
		
		/*
		int a = 10;
		int b = 20;
		
		if (a < b) {
			System.out.println(a + " is smaller than " + b);
		}
		else {
			System.out.println(b + " is grater than " + a);
		}
		*/
		int num1 = 10, num2 = 20, num3 =8;
		if(num1 >= num2 && num3 <= num1)
			System.out.println(num1 + " is the largest number");
		else if(num2 >= num1 && num1 >= num3)
			System.out.println(num2 + " is the largest number");
		else
			System.out.println(num3 + " is the largest number");

	}
}
