import java.util.*;
class Ques15_2{


public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int countLower = 0;
	int countSpace = 0;
	int countUpper = 0;

	String a = sc.nextLine();
	for(int i = 0; i < a.length(); i++){
		if (Character.isLowerCase(a.charAt(i))){
			countLower++;
		}
		if(Character.isUpperCase(a.charAt(i))){
			countUpper++;
		}
		if(Character.isWhitespace(a.charAt(i))){
			countSpace++;
		}
	}
	System.out.println("Lower case: "+countLower);
	System.out.println("Upper case: "+countUpper);
	System.out.println("Spaces: "+countSpace);
}
}