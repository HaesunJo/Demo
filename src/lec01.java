
import java.util.Scanner;

public class lec01 {
	public static void main(String[] args) {
		
		String name;
		int age;
		
		//System.out.println("Hello World! May 12, 2020 " + myAge);
		Scanner inputDevice = new Scanner(System.in);
		System.out.print("Please enter your name : ");
		name = inputDevice.nextLine();
		
		System.out.print("Please enter your age :");
		age = inputDevice.nextInt();
		
		System.out.println("\nYour name is " + name + " and you are " + age + " years old.");
				
		
	}
}
