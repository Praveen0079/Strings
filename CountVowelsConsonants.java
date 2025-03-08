import java.util.Scanner;

public class CountVowelsConsonants{
	
	static void Count(String text){
		text = text.toLowerCase();  // converting string to lowercase
		int vowels = 0;
		int consonants = 0;
		for(int i =0;i<text.length();i++){
			char ch = text.charAt(i);
			if(ch >= 'a' && ch <= 'z'){ //checking if aphlabet or not
				if(ch== 'a' || ch== 'e' || ch== 'i' || ch== 'o' || ch== 'u'){ // checking if vowels
					vowels++;
				} else consonants++;
			}
		}
		System.out.println("The number of vowels = "+vowels);
		System.out.println("The number of consonants = "+consonants);
		
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String text = sc.next();
		Count(text);
	}
	
}