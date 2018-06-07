import java.util.*;

class Upper{

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter the string in Lower Case");
		String lower = inp.nextLine();
		System.out.println("The String after conversion to Upper Case Characters is "+lower.toUpperCase());	
	}
}