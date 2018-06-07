class EXT{
	static class CheckInstanceOf{}

	static class Instance extends CheckInstanceOf{}
	
	public static void main(String args[]){
		CheckInstanceOf ci = new Instance();
		boolean result = ci instanceof CheckInstanceOf;
		System.out.println(result);
	
	}
	
}