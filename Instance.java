class CheckInstanceOf{
}

class Instance extends CheckInstanceOf{
	public static void main(String args[]){
	
		CheckInstanceOf ci = new Instance();
		boolean result = ci instanceof Instance;
		System.out.println(result);
	
	}
}