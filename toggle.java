/* This Program simple Toggle all the Upper Case characters to Lower and Lower
				Case characters to Lower */

import java.util.*;
import static java.lang.Character.*;

class Toggle{

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Enetre the sTring in Upper and Lower case both to toggle");
		String user = inp.nextLine();
		String toggle = "";
		for(int i=0;i<user.length();i++){
			
			char ch = user.charAt(i);
			if(Character.isUpperCase(ch))
				toggle += Character.toLowerCase(ch);
			else
				toggle += Character.toUpperCase(ch);
		}
		
		System.out.println("The String after toggle is:"+toggle);
	}
}