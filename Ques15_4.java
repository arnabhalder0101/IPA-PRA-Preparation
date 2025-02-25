import java.util.*;
class Ques15_4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int space = 0;
		int ch = 0;
		for(int i = 0; i<str.length(); i++){
			if(Character.isWhitespace(str.charAt(i))){
				space++;
			}else{
				ch++;
			}
		}
		System.out.println(space+" "+ch);
	} 
}