import java.util.*;

class Document {
int id ;
String title;
String folderName;
int pages;

public Document(int id, String t, String name, int pages){
this.id = id;
this.title = t;
this.folderName = name;
this.pages = pages;
}
public int getId(){
return id;
}

public String getTitle(){
return title;
}

public String getName(){
return folderName;
}

public int getPages(){
return pages;
}

}

class IPA30{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
Document[] doc = new Document[4];
for(int i = 0; i<4; i++){
int a = sc.nextInt(); sc.nextLine();
String b = sc.nextLine();
String c = sc.nextLine();
int d = sc.nextInt(); sc.nextLine();

doc[i] = new Document(a,b,c,d);
}
Document[] res = IPA30.docsWithOddPages(doc);
if(res!=null){
for(Document d: res){
	System.out.println(d.getId()+" "+d.getTitle()+" "+ d.getName()+" " +     d.getPages());
}
}else{
System.out.println("No Document found with odd number of pages.");
}


}

public static Document[] docsWithOddPages(Document[] d){
Document[] arr = new Document[0];

for(Document doc: d){
	if(doc.getPages()%2!=0){
		arr = Arrays.copyOf(arr, arr.length+1);
		arr[arr.length-1] = doc;
	}

}
if(arr.length>0){return arr;}
else{return null;}

}




}