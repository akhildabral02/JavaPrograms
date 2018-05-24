class Sample{
	static int num = 100;
	public void calc(int num){
		num = num *2;
	}
	
	public void printNum(){System.out.println(num);}
	
	public static void main(String args[]){
		Sample s = new Sample();
		s.calc(10);
		s.printNum();
		System.out.println(s.num);
	
	}
}