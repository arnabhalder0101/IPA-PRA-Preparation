import java.util.*;

public class  Ques15_6{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
String str = sc.nextLine();
int count = 0;
for(int i = 0 ; i<str.length(); i++){
	if(str.charAt(i) == ' '){
		count+=1;
	}
}
if(count>=3){
System.out.println(count);
}else{
System.out.println("NA");
}

}
}