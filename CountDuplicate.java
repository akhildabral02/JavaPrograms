// Here I am going to count duplicate words

import java.util.*;
import java.lang.*; 
import java.io.*;

class CountDuplicate{
	public static void main(String[] args) throws Exception {
		
		Map<String, Integer> occurrences = new HashMap<String, Integer>();
		FileReader fr = new FileReader("Reverse.txt");
		BufferedReader br = new BufferedReader(fr);
		String line;
		try{

			while((line = br.readLine()) != null){
			StringTokenizer st = new StringTokenizer(line, " ");
				while(st.hasMoreTokens()){
					String temp = st.nextToken().toLowerCase();
					if(occurrences.containsKey(temp)){
					occurrences.put(temp,occurrences.get(temp)+1);
					}else
						occurrences.put(temp,1);
					}
			}	
		} catch(FileNotFoundException e){
			e.printStackTrace();
		} finally{
			try{ if(br!= null) br.close();} catch (Exception ex){}
		}

		
		System.out.println("The Occurent are"+occurrences);
	}
}
