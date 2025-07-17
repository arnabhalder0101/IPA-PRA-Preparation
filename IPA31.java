import java.util.*;


class Music {
private int playlistNo;
private String type;
private int count;
private double duration;

public Music (int n, String t, int count , double dur){
this.playlistNo = n;
this.type = t;
this.count = count ;
this.duration = dur;
}

public int getNo(){ return playlistNo; }
public String getType(){ return type; }
public int getCount(){ return count; }
public double getDuration(){ return duration; }

}

public class IPA31{

// 1st method
public static int findAvgOfCount(Music[] m, 	int v){
int sum = 0;
int c = 0;
for(Music music : m){
if(music.getCount()>v){
sum+=music.getCount();
c+=1;

}

}

if(c>0)
return sum/c;
else 
return 0;
}

// 2nd method
public static Music[] sortTypeByDuration(Music[] m, int v){
Music[] arr = new Music[0];
for(Music music : m){
if(music.getDuration()>v){
	arr = Arrays.copyOf(arr, arr.length+1);
	arr[arr.length-1] = music;
}
}

if(arr.length==1){
return arr;
}else if(arr.length>1){
// sort
for(int i = 0; i<arr.length-1; i++){
for(int j = 0; j<arr.length; j++){
if(arr[i].getDuration()>arr[j].getDuration()){
	// swap

	Music mu = arr[i];
	arr[i] = arr[j];
	arr[j] = mu;
}

}
}
return arr;

}else{
return null;
}


} // end 2nd



public static void main(String[] args){
Scanner sc = new  Scanner(System.in);
Music[] m = new Music[4];

for(int i = 0; i<4; i++){

int a = sc.nextInt(); sc.nextLine();
String b = sc.nextLine();
int c = sc.nextInt(); sc.nextLine();
double d = sc.nextDouble(); sc.nextLine();
m[i] = new Music(a,b,c,d);
}
int x = sc.nextInt(); sc.nextLine();
int y = sc.nextInt(); sc.nextLine();
int res1 = IPA31.findAvgOfCount(m, x);
Music[] res2 = IPA31.sortTypeByDuration(m, y);

if(res1>0){
System.out.println(res1);
}else{
System.out.println("No playlist found");
}

if(res2!=null){
for(Music music: res2){
System.out.println(music.getType());
}
}
else{
System.out.println("No playlist found with mentioned attribute");
}
}

}
