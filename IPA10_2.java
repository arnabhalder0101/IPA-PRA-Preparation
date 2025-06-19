import java.util.*;

class Employee {
    
    private int employeeId;
    private String name;
    private String branch;
    private double rating;
    private boolean companyTransport;
    
    public Employee(int id, String name, String branch, double rate, boolean transport){
        this.employeeId = id;
        this.name = name;
        this.branch = branch;
        this.rating = rate;
        this.companyTransport = transport;
        
    }
    public int getId(){
        return employeeId;
    }
    public String getName(){
        return name;
    }
    public String getBranch(){
        return branch;
    }
    public double getRating(){
        return rating;
    }
    public boolean getTransport(){
        return companyTransport;
    }
    
}

public class IPA10_2{
    
    public static int findCountOfEmployeeUsingCompTransport(Employee[] e, String br){
        int count = 0;
        for(int i = 0; i<e.length; i++){
            if(e[i].getTransport() && e[i].getBranch().equals(br)){
                count+=1;
            }
        }
        
        return count;
        
        
    }
    
    public static Employee findEmployeeWithSecondHighestRating(Employee[] e){
       Employee[] arr= new  Employee[0];
       
       //   // filter --
      for (int i = 0; i<e.length;i++ ) {
          if(!e[i].getTransport()){
              arr = Arrays.copyOf(arr, arr.length+1);
              arr[arr.length -1 ]= e[i];
          }
      }
       
       if(arr.length>0){
           // sort second high salary
           for(int i = 0; i<arr.length; i++){
               for(int j = i+1; j<arr.length; j++){
                   if(arr[i].getRating()< arr[j].getRating()){
                       Employee k = arr[i];
                       arr[i] = arr[j];
                       arr[j] = k;
                   }
               }
           }
           return arr[1];
       }
       else{
           return null;
       }
       // Employee max = e[0];
           
        // //   // filter --
        //   for (int i = 0; i<e.length;i++ ) {
        //       if(!e[i].getTransport() && e[i].getRating() < max.getRating()){
        //           arr = Arrays.copyOf(arr, arr.length+1);
        //           arr[arr.length -1 ]= e[i];
        //       }
        //   }
           
           
        //   if(arr.length != 0){
        //       return arr[0];
        //   }else{
        //       return null;
        //   }
       
    }
    
    public static void main(String args[]){
        Employee[] emp = new Employee[4];
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i<emp.length; i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            double d = sc.nextDouble(); sc.nextLine();
            boolean e = sc.nextBoolean(); sc.nextLine();
            
            emp[i] = new Employee(a,b,c,d,e);
        }
        String branch  = sc.nextLine();
        
        int count = IPA10_2.findCountOfEmployeeUsingCompTransport(emp, branch);
        Employee res2 = IPA10_2.findEmployeeWithSecondHighestRating(emp);
        
        if(count!=0){
            System.out.println(count);
        }else{
            System.out.println("No such Employees");
        }
        
        if(res2!= null){
            System.out.println(res2.getId()+"\n"+res2.getName());    
            
        }else{
            System.out.println("All Employees using company transport");
        }
    }
    
    
}




















