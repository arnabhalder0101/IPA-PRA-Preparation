import java.util.*;

class Course {
    
    int cid;
    String cname;
    String cadmin;
    int quiz;
    int handson;
    
    public Course(int id, String name, String admin, int q, int h){
        cid = id;
        this.cname = name;
        this.cadmin = admin;
        this.quiz = q;
        this.handson = h;
        
    }
    public int getId(){
        return cid;
    }
    public String getName(){
        return cname;
    }
    public String getAdmin(){
        return cadmin;
    }
    public int getQuiz(){
        return quiz;
    }
    public int getHandson(){
        return handson;
    }
    
}

public class IPA1{
    
    public static int findAvgOfQuizByAdmin(Course[] c, String admin){
        int sum = 0;
        int count = 0;
        for(int i = 0; i<c.length; i++){
            if(c[i].getAdmin().equalsIgnoreCase(admin)){
                count+=1;
                sum+= c[i].getQuiz();
                
            }
        }
        if(count!=0) return sum/count;
        else return 0;
        
    }
    
    public static Course[] sortCourseByHandsOn(Course[] c, int h){
        Course[] arr = new Course[0];
        for(int i = 0; i<c.length; i++){
            if(c[i].getHandson() < h){
                arr = Arrays.copyOf(arr, arr.length+1);
                arr[arr.length - 1] = c[i];
                
            }
        }
        
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i].getHandson() > arr[j].getHandson()){
                    Course k  = arr[i];
                    arr[i] = arr[j];
                    arr[j] = k;
                }
            }
        }
        
     
        if (arr.length != 0) return arr;
        else return null;
    }
    
    public static void main(String args[]){
        Course[] course = new Course[4];
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i<course.length; i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt(); sc.nextLine();
            int e = sc.nextInt(); sc.nextLine();
            
            course[i] = new Course(a,b,c,d,e);
        }
        String admin  = sc.nextLine();
        int handson = sc.nextInt(); sc.nextLine();
        
        int avg = IPA1.findAvgOfQuizByAdmin(course, admin);
        Course[] res2 = IPA1.sortCourseByHandsOn(course, handson);
        
        if(avg!=0){
            System.out.println(avg);
        }else{
            System.out.println("No Course found");
        }
        
        if(res2!= null){
            for(int i = 0; i<res2.length; i++){
                System.out.println(res2[i].getName());    
            }
            
        }else{
            System.out.println("No Course found with mentioned attribute");
        }
    }
    
    
}




















