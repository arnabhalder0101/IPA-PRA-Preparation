import java.util.*;
class Ques15_5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String temp = "";

		// System.out.println(Character.valueOf('a').isLowerCase('A'));  // possible!

		for(int i = 0; i<a.length(); i++){
			if(Character.isWhitespace(a.charAt(i))){
				if(!Character.isDigit(a.charAt(i-1))){
					temp+=a.charAt(i-1);
				}
			}
		}
		if(!Character.isDigit(a.charAt(a.length()-1))){
			temp+=a.charAt(a.length()-1);
		}
		System.out.println(temp);
	}
	
}