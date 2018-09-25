import java.util.*;
import java.io.*;

class Find{
	public static void main(String[] args) throws IOException {
		
		Scanner inp = new Scanner(new File("C://Users/adabral//Desktop//CopiedOne.txt"));
		String str;
		while(inp.hasNext()){
			str = inp.next();
			if(str.equals("and"))
				System.out.println(str);
		}
		inp.close();


	}
}
