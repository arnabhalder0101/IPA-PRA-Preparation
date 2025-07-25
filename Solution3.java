import java.util.*;

class Instituition{
int institutionId;
String institutionName; 
int noOfStudentsPlaced;
int noOfStudentsCleared;
String location;
String grade;

Instituition(int id,
String name,
int NSP,
int NSC,
String loc
){
	this.institutionId = id;
	this.institutionName = name; 
	this.noOfStudentsPlaced = NSP;
	this.noOfStudentsCleared = NSC;
	this.location = loc;

}


}

public class Solution3 {

public static int FindNumClearancedByLoc(Instituition[] arr, String loc){
int count = 0;
	for(int i = 0; i<arr.length; i++){

	if(arr[i].location.equals(loc)){
		count += arr[i].noOfStudentsCleared;
	}
	}
return count;
}

public static Instituition UpdateInstitutionGrade(String intName, Instituition[] arr){

for(int i = 0; i<arr.length; i++){
	if(arr[i].institutionName.equals(intName)){
		int nsp = arr[i].noOfStudentsPlaced;
		int nsc = arr[i].noOfStudentsCleared;
		int rate = (nsp*100)/nsc;
		String grade = "";
		if(rate>=80){grade = "A";}
		else{grade = "B";}
		arr[i].grade = grade;
		return arr[i];
	}
}
return null;
}

public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	Instituition[] inst = new Instituition[4];
	for(int i = 0; i<inst.length; i++){
		int a = sc.nextInt();sc.nextLine();
		String b = sc.nextLine();
		int c = sc.nextInt();sc.nextLine();
		int d = sc.nextInt();sc.nextLine();
		String e = sc.nextLine();
		inst[i] = new Instituition(a,b,c,d,e);
	}
	String loc= sc.nextLine();
	String instName = sc.nextLine();
	int res1 = FindNumClearancedByLoc(inst, loc);
	Instituition res2 = UpdateInstitutionGrade(instName, inst);
	if(res1 >0)	{
	System.out.println(res1);}
	else{
	System.out.println("There are no cleared students in this particular location");}
	if(res2!=null){
	System.out.println(res2.institutionName+"::"+res2.grade);}
	else{
	System.out.println("No Institute is available with the specified name");}
}

}

/*

Question:
==========================
Create a class Institution with below attributes:

institutionId - int
institutionName - String
noOfStudentsPlaced - int
noOfStudentsCleared- int
location - String
grade - String

Write getters, setters for the above attributes.
Create constructor which takes parameter in the above sequence except grade.

Create class Solution with main method.
Implement two static methods - FindNumClearancedByLoc and UpdateInstitutionGrade in Solution class.

FindNumClearancedByLoc method:
----------------------------------------------
This method will take two input parameters - array of Institution objects and string parameter location.
The method will return the sum of the noOfStudentsCleared attribute from institution objects for the location passed as 
parameter. If no institution with the given location is present in the array of institution objects, then the method 
should return 0.

UpdateInstitutionGrade method:
-----------------------------------------------
This method will take a String parameter institutionName, along with the array of Institution objects.
The method will return the institution object, if the input String parameter matches with the institutionName attribute of the 
institution object. Before returning the object, the grade should be arrived based on the rating calculation mentioned below. 
This grade value should be assigned to the object.If any of the above conditions are not met, then the method should return 
null.

The grade attribute should be calculated as follows:

Rating=(noOfStudentsPlaced * 100)/noOfStudentsCleared
If the rating greater than equal to 80 , then grade should be 'A'.
Else, then grade should be 'B'

*Note:*
--------------------------------------------
No institution object would have the same value for institutionName attribute.
All institution object would have the noOfStudentsPlaced value lesser than noOfStudentsCleared value.
All the searches should be case insensitive.

The above mentioned static methods should be called from the main method.

For FindNumClearancedByLoc method - The main method should print the noOfClearance as it is, if the returned value is 
greater than 0, or it should print "There are no cleared students in this particular location".

For UpdateInstitutionGrade method - The main method should print the institutionName and grade of the returned Institution 
object. The instituationName and grade should be concatinated with :: while printing. eg:- TCS::A, where TCS is the 
institution name and A is the grade.
If the returned value is nullthen it should print "No Institute is available with the specified name".

Before calling these static methods in main, use Scanner object to read the values of four Phone objects referring attributes 
in the above mentioned attribute sequence (except grade attribute). Next, read the value for location and institutionName.

Input
-------------------------------------------
111
Amrita
5000
10000
Chennai
222
Karunya
16000
20000
Coimbatore
333
AppleTech
10000
12000
Chennai
444
Aruna
6000
10000
Vellore
Chennai
Karunya

Output
----------------------------------------
22000
Karunya::A

*/