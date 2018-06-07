/* I am Trying to create a program which 
	will extract all the email ids in a simple Text File*/
import java.io.*;
import java.util.*;

class GetEmail{
	public static void main(String[] args)throws Exception {
			Scanner inp = new Scanner(System.in);
			File file = new File("Reverse.txt");
			BufferedReader br = new BufferedReader(new FileReader(file));
			String words;
			while((words = br.readLine()) != null){
				String word_array[] = words.split(" ");
				for(int i=0;i<word_array.length;i++){
					if(word_array[i].contains("@"))
						System.out.println(word_array[i]);
				}
			}
		}	
}