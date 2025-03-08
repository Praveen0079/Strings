import java.util.Scanner;

class palindromeCheck{
	//Method to check if Palindrome
	static boolean ifPalindrome(String text){
		boolean result = true;
		int length = text.length();
		for(int i =0 ;i<text.length();i++){
			length--;
			if(text.charAt(i) != text.charAt(length)){ 
				result = false;
			}
		}
		return result;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String text = sc.nextLine(); //naman
		if(ifPalindrome(text)){
			System.out.print(text+" is Palindrome"); //naman is Palindrome
		}else System.out.print(text+" is not Palindrome");
	}
	
	/* naman
	   naman is Palindrome
	*/
}