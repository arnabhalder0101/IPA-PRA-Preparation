import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Xplore_1 {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt(); sc.nextLine();
        double bal = sc.nextDouble(); sc.nextLine();
        double rate = sc.nextDouble(); sc.nextLine();
        
        int noOfYears = sc.nextInt();
        
        Account ac = new Account(id, bal, rate);
        
        double interest = calculateInterest(ac, noOfYears);
        
        System.out.printf("%.2f", interest);
    }
    
    public static double calculateInterest(Account a, int noOfYears)
    {
        double finalRate = noOfYears * a.getRate()/100;
        double interest = a.getBalance() * finalRate * noOfYears;
        return interest;
        
    }
}

class Account
{
    int id;
    double balance;
    double ir;
    public Account(int id, double balance, double ir){
        this.id = id;
        this.balance = balance;
        this.ir = ir;
        
    }
    public int getId(){
        return id;
        
    }
    public double getBalance(){
        return this.balance;
        
    }
    public double getRate(){
        return ir;
        
    }
}