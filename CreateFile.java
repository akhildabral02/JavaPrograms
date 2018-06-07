///////File Creation in java //////////

import java.io.*;
class CreateFile{
	
	
	public static void main(String args[]) throws IOException{
		String str = "Hey There"+
						"This is just a Plain Text";
		FileWriter fr = new FileWriter("text");
		
		//now read characters from string and write it to File
		for(int i=0;i<str.length();i++)
			fr.write(str.charAt(i));		
		fr.close();
	}
}