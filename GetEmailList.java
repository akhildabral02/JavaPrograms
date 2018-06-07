/* I am Trying to create a program which 
	will extract all the email ids in a simple Text File and add them into a Array List of emails */

import java.io.*;
import java.util.*;


class GetEmail{
	public static void main(String[] args)throws Exception {
			ArrayList <String> email_list = new ArrayList<String>();
			File file = new File("Reverse.txt");
			BufferedReader br = new BufferedReader(new FileReader(file));
			String words;
			while((words = br.readLine()) != null){
				String word_array[] = words.split(" ");
				for(int i=0;i<word_array.length;i++){
					if(word_array[i].contains("@"))
						email_list.add(word_array[i]);
				}
			}

			System.out.println("Email Ids present in the Text files are "+email_list);
		}	
}