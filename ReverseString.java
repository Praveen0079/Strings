import java.util.Scanner;

public class ReverseString{
	
	static String reverse(String text){
		String reversed = ""; //Empty String
		for(int i = text.length()-1;i>=0;i--){
			reversed += text.charAt(i); // string concatenation
		}
		return reversed;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String text = sc.nextLine();
		
		System.out.print(reverse(text));
	}
}
