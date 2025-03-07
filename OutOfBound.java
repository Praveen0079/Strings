class OutOfBound{
	// Method to generate OutOfBound exception
    public static void generateException(String text) {
        
		char a = text.charAt(text.length()); // This will index OutOfBound exception
        System.out.println(a); 
    }
	
	static void handleException(String text){
		try{
			generateException(text);
		}
		catch(Exception e){ // this will catch the exception
			System.out.println("Caught expection : " + e.getMessage());
		}
	}
	public static void main(String[] args){
		String text = "BridgeLabz";
		//generateException(text); // unComment method to generate exception
		handleException(text);
	}
}
