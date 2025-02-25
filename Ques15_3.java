import java.util.*;
class Ques15_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inp = sc.nextLine();
		String temp = "";
		for(int i = 0; i<inp.length(); i++) {
            if(temp.indexOf(Character.toLowerCase(inp.charAt(i))) == -1){
                temp = temp+Character.toLowerCase(inp.charAt(i));
            }
	}
		System.out.println(temp);
	}
}