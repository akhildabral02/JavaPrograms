import java.util.*;

class Cls{
	public static Scanner inp = new Scanner(System.in);
	
		String name;
		int no;
		
		public Cls(){
			this.name = "None";
			this.no = 0;
		}
		
		void get(){
			System.out.println("Enter the name of student:");
			name = inp.next();
			System.out.println("Enter the number of student:");
			no = inp.nextInt();
		}
		
		void show(){
			System.out.println("The name of student:"+this.name);
			System.out.println("the no of student is :"+this.no);
		}
		
		
	public static void main(String args[]){
	
	Cls s = new Cls();
	s.show();
	s.get();
	s.show();}
	
		


}