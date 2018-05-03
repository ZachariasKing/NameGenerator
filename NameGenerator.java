import java.util.*;

/**
 * NameGenerator is a class that implements a name generator system. It is the top level class
 * in this project so far.
 *
 * This class makes use of the Scanner utility to generate a character name and displays this
 * to the terminal window to communicate with the user.
 *
 * @author     Zacharias King
 * @version    0.1 (01.02.2018)
 */
public class NameGenerator{

	public static void main(String[] args)
	{
		nameGeneration();
	}


	/**
	* This method reads various inputs using the Java utility 'Scanner' and uses these to generate a new name
	* out of substrings of these inputs.
	*/
	public static void nameGeneration()
	{
		System.out.print("Enter your first name: ");
		Scanner input = new Scanner(System.in);
		String fName =  input.nextLine();
		System.out.print("Thank you, now enter your last name: ");
		String lName =  input.nextLine();
		System.out.print("Thank you, now enter your mother's maiden name: ");
		String maidenName =  input.nextLine();
		System.out.print("Thank you, now enter your birth city: ");
		String cityName = input.nextLine();
		System.out.println("Your generated name is: " + lName.substring(0, 3).toLowerCase() + fName.substring(0, 2).toLowerCase() + " " + maidenName.substring(0, 2).toLowerCase() + cityName.substring(0, 3).toLowerCase());




	}




}
