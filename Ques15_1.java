import java.util.*;
public class Ques15_1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		char b = sc.next().charAt(0);
		for(int i = 0; i<a.length(); i++){
			if(a.charAt(i) == b){
				System.out.println(i);
				break;	
			}
				
		}
		
	}
}