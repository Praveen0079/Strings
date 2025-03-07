import java.util.Scanner;

public class CompareTwoStrings2{

	// making string into char array
	static char[] charArray(String text){
		char[] charArray = new char[text.length()];
		for(int i=0;i<text.length();i++){
			charArray[i]=text.charAt(i);
		}
		return charArray;
	}
	// comparing CharArray with String
	static boolean compareMethods(char[] s1 , String s2){
		if(s1.length != s2.length()){
			return false;
		}
		boolean result = true;
		for(int i=0;i<s1.length;i++){
			if(s1[i]!=s2.charAt(i)){
				result = false;
			}
		}
		return result;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String text = sc.next();
		//calling custom method
		char[] custumCharArray = charArray(text);
		
		//calling comparing function
		boolean result = compareMethods(custumCharArray,text);

		System.out.println(text);
		if(result){
			System.out.println("Comparsion is sucessful");
		}
	}
}