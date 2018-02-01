import java.util.*;
public class NameGenerator{
	
	public static void main(String[] args)
	{
		
		nameGeneration();
		
		
	}
	
	
	public static void nameGeneration()
	{
		System.out.print("Enter your first name: ");
		Scanner input = new Scanner(System.in);
		String fName =  input.nextLine();
		System.out.print("Thank you, now enter your last name: ");
		Scanner input2 = new Scanner(System.in);
		String lName =  input.nextLine();
		System.out.print("Thank you, now enter your mother's maiden name: ");
		Scanner input3 = new Scanner(System.in);
		String maidenName =  input.nextLine();
		System.out.print("Thank you, now enter your birth city: ");
		Scanner input4 = new Scanner(System.in);
		String cityName =  input.nextLine();
		System.out.println("Your generated name is: " + lName.substring(0, 3) + fName.substring(0, 2) + " " + maidenName.substring(0, 2) + cityName.substring(0, 3));
		
		
		
		
	}
	
	
	
	
}