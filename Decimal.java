import java.util.*;
class Decimal{
	public static void main(String args[]){
		Scanner inp = new Scanner(System.in);
		int num = inp.nextInt();
		StringBuilder str = new StringBuilder("");
		while(num >1){
			int remainder = num %2;
			str = str + remainder;
			num = num /2;

		}
		str = str.reverse();
		System.out.println("The Binary Conversion of the decimal number is "+str);


	}



}