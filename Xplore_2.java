import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Xplore_2 {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        
        String[] num = inp.split(" ");
        
        int[] intNum = new int[num.length];
        
        for(int i = 0; i<num.length; i++){
            intNum[i] = Integer.parseInt(num[i]);
            
        }
        
        Point one = new Point(intNum[0], intNum[1]);
        Point second = new Point(intNum[2], intNum[3]);
        
        double dis = findDistance(one, second);
        System.out.printf( "%.3f", dis);
    }
    
    public static double findDistance(Point p1, Point p2)
    {
        double cal = Math.sqrt(Math.pow((p2.x-p1.x), 2) + Math.pow((p2.y-p1.y), 2));
        return cal;
    }
}

class Point
{
    int x;
    int y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    
}