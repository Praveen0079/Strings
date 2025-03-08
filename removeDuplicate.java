import java.util.Scanner;
class removeDuplicate{
	
	static void removeDuplicates(String temp){
		String text = temp;
		for(int i = 0;i<text.length();i++){
			for(int j = i;j<text.length()-1;j++){
				if(text.charAt(i)==text.charAt(j+1)){
					text = text.replaceAll(String.valueOf(text.charAt(i)),"");
					break;
				}
			}		
		}
		System.out.print(text);
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		String text = sc.next(); //bridgelabz
		removeDuplicates(text);  //ridgelaz
	}
}