
import java.util.*;

class Employee {
	private int empId;
	private     String empName;
	private   int age;
	private   char gender;
	private   double sal;

	public Employee(int id, String name, int age, char gender, double sal) {
		this.empId = id;
		this.empName = name;
		this.age = age;
		this.gender = gender;
		this.sal = sal;

	}
	
	public int getId(){
	    return this.empId;
	}
	public String getName(){
	    return this.empName;
	}
	public int getAge(){
	    return this.age;
	}
	public char getGender(){
	    return this.gender;
	}
	public double getSalary(){
	    return this.sal;
	}
}

class Solution_2nd_lowest_sal{
    public static Employee[] getEmployeeWithSecondLowestSalary(Employee[] emp){
        Employee[] e = new Employee[0];
        Employee[] newEmp = new Employee[0];
        
        if(emp.length>1){
            for(int i = 0; i<emp.length; i++){
                for(int j =i+1; j <emp.length; j++){
                    if(emp[i].getSalary() > emp[j].getSalary()){
                        Employee x = emp[i];
                        emp[i] = emp[j];
                        emp[j] = x;
                    }
                }
            }
            double min = emp[0].getSalary();
            for(int i = 0; i<emp.length; i++){
                if(emp[i].getSalary() > min){
                    e  = Arrays.copyOf(e, e.length+1);
                    e[e.length-1] = emp[i];
                }
            }
            double secMin = e[0].getSalary();
            for(int i = 0; i<e.length; i++){
                if(e[i].getSalary() == secMin){
                    newEmp = Arrays.copyOf(newEmp, newEmp.length+1);
                    newEmp[newEmp.length-1] = e[i];
                }
            }
            return newEmp;
            
            
        }else{
            return null;
        }
    }
    
    public static int countEmployeesBasedOnAge(Employee[] e, int age){
        int c = 0;
        for(int i = 0; i<e.length; i++){
            if(e[i].getAge() == age){
                c+=1;
            }
        }
        return c;
        
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        Employee[] arr = new Employee[n];
        
        for(int i = 0; i<n;i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt(); sc.nextLine();
            char d = sc.next().charAt(0); sc.nextLine();
            double e = sc.nextDouble(); sc.nextLine();
            arr[i] = new Employee(a,b,c,d,e);
        }
        
        int age = sc.nextInt(); sc.nextLine();
        
        Employee[] res1 = Solution_2nd_lowest_sal.getEmployeeWithSecondLowestSalary(arr);
        int res2 = Solution_2nd_lowest_sal.countEmployeesBasedOnAge(arr, age);
        
        if(res1!=null){
            for(int i = 0; i<res1.length; i++){
                System.out.println(res1[i].getId()+"#"+res1[i].getName());
            }
        }else{
            System.out.println("Null");
        }
        
        if(res2>0){
            System.out.println(res2);
        }else{
            System.out.println("No employee found for the given age");
        }
    }
}



/*
==============
Create a class Employee with below attributes:

employeeId - int
employeeName - String
age - int
gender - char
salary - double

where employeeId is the unique identifier of the employee, employeeName is the name of the employee, age is the age of 
the employee, gender is the gender of the employee and salary is the salary of the employee.

The above attributes should be private, write getters, setters and parameterized constructor as required.

Create class Solution with main method.
Implement two static methods - getEmployeeWithSecondLowestSalary and countEmployeesBasedOnAge in Solution class.

getEmployeeWithSecondLowestSalary method:
This method will take an array of Employee objects as a parameter.
The method will return the Employee object with the second lowest salary in the array of Employee objects.
If there are less than two employees in the array, then the method should return null.

countEmployeesBasedOnAge method:
This method will take two input parameters - array of Employee objects and an integer parameter (for age).
The method will return the count of employees from the array of Employee objects whose age matches with the input 
parameter.
If no employee with the given age is present in the array of Employee objects, then the method should return 0.

Note :

Two employee objects can have the same salary.
All the searches should be case insensitive.

The above mentioned static methods should be called from the main method.

For getEmployeeWithSecondLowestSalary method - The main method should print the employeeId followed by # and employeeName
from the returned Employee object, if the returned value is not null.

If the returned value is null then it should print "Null".

For countEmployeesBasedOnAge method - The main method should print the count of employees as it is, if the returned value
is greater than 0, otherwise it should print "No employee found for the given age".

Before calling these static methods in main, use Scanner to read the number of objects and objects to read the values of 
Employee objects referring attributes in the above mentioned attribute sequence.

Consider below sample input and output:

Input:
-------------
4
101
John
30
M
10000.00
102
Samantha
25
F
15000.00
103
Alex
28
M
12000.00
104
Lisa
30
F
12000.00
30

Output:
----------------
103#Alex
104#Lisa
2

*/









