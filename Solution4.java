import java.util.*;

class Inventory{
String inventoryId;
int maximumQuantity;
int currentQuantity;
int threshold;

Inventory(String id,int mq,int cq, int th){
this.inventoryId = id;
this.maximumQuantity = mq;
this.currentQuantity = cq;
this.threshold = th;
}

public String getId(){
return this.inventoryId;
}
public int getMaxQuan(){
return this.maximumQuantity;
}
public int getCurrQuan(){
return this.currentQuantity;
}
public int getThreshold(){
return this.threshold;
}

}

public class Solution4 {

public static void main(String[] args){
Scanner sc = new Scanner(System.in);
Inventory[] inv = new Inventory[4];
for(int i = 0; i<inv.length; i++){
	String a = sc.nextLine();
	int b = sc.nextInt(); sc.nextLine();
	int c = sc.nextInt(); sc.nextLine();
	int d = sc.nextInt(); sc.nextLine();
	inv[i] = new Inventory(a, b, c, d);
}
int limit = sc.nextInt(); sc.nextLine();
Inventory[] res = replenish(inv, limit);
for(int i = 0; i<res.length; i++){
	if(res[i].threshold>75){
		System.out.println(res[i].getId()+" Critical Filling");
	}else if(res[i].threshold>=50 &&  res[i].threshold<=75){
		System.out.println(res[i].getId()+" Moderate Filling");
	}else{
		System.out.println(res[i].getId()+" Non-Critical Filling");
	}
}
}


public static Inventory[] replenish(Inventory[] arr, int limit){
	Inventory[] arr2 = new Inventory[0];
	for(int i = 0; i<arr.length; i++){
		if(arr[i].threshold <= limit){
			arr2 = Arrays.copyOf(arr2, arr2.length+1); // manuipulating object length
			arr2[arr2.length-1] = arr[i];
		}
	}
	return arr2;
}

}



/*

Question:
=====================
Create class Inventory with below attributes:

inventoryId - String
maximumQuantity - int
currentQuantity - int
threshold - int

Create class Solution and implement static method "Replenish" in the Solution class.
This method will take array of Inventory objects and a limit int as parameters.
And will return another array of Inventory objects where the limit int is greater than or equal to the original array of 
Inventory object's threshold attribute.

Write necessary getters and setters.

Before calling "Replenish" method in the main method, read values for four Inventory objects referring the attributes in above 
sequence along with a int limit.Then call the "Replenish" method and write logic in main method to print inventoryId and "Critical Filling",
if the threshold attribute is greater than 75. Else if the threshold attribute is between 50 and 75 then print 
"Moderate Filling". Else print "Non-Critical Filling".

Input
---------------------------
1
100
50
50
2
200
60
40
3
150
35
45
4
80
45
40
45

Output
----------------------------
2 Non-Critical Filling
3 Non-Critical Filling
4 Non-Critical Filling

*/