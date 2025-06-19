import java.util.*;


class Movie{
	private int movieId;
	private String director;
	private int rating;
	private int budget;
	public Movie(int id, String director, int rate, int bud ) {
		this.movieId = id;
		this.rating = rate;
		this.budget = bud;
		this.director = director;
	}

	public int getMovieId() {
		return movieId;
	}
	public String getDirector() {
		return director;
	}
	public int getRating() {
		return rating;
	}
	public int getBudget() {
		return budget;
	}
}


public class Solution_june5{
    
    public static int findAvgBudgetByDirector(Movie[] arr, String director){
        int sum = 0;
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i].getDirector().equalsIgnoreCase(director)){
                sum += arr[i].getBudget();
                count+=1;
            }
        }
        if(count != 0)
        return sum/count;
        else return 0;
        
    }
    
    public static Movie getMovieByRatingBudget(int rating, int budget, Movie[] arr){
        
        for(int i = 0; i<arr.length; i++){
            if(arr[i].getRating() == rating && arr[i].getBudget() == budget){
                if(arr[i].getBudget()%arr[i].getRating() == 0){
                    return arr[i];
                }
                
            }
        }
        return null;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Movie[] movie = new Movie[4];
        
        for(int i = 0; i< 4; i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt(); sc.nextLine();
            int d = sc.nextInt(); sc.nextLine();
            
            movie[i] = new Movie(a,b,c,d);
        }
        String director = sc.nextLine();
        int rating = sc.nextInt(); sc.nextLine();
        int budget = sc.nextInt(); sc.nextLine();
        
        int res1 = Solution_june5.findAvgBudgetByDirector(movie, director);
        Movie res2 = Solution_june5.getMovieByRatingBudget(rating, budget, movie);
        
        if(res1>0){
            System.out.println(res1);
        }else{
            System.out.println("Sorry - The given director has not yet directed any movie");
        }
        
        if(res2!= null){
            System.out.println(res2.getMovieId());
        }else{
            System.out.println("Sorry - No movie is available with the specified rating and budget requirement");
        }
        
    }
}


/*
=======================
Create a class Movie with the below attributes:
movieId - int
director - String
rating - int 
budget - int

 

Write getters, setters and parameterized constructor in the above mentioned attribute sequence as required.

 

Create class Solution with the main method. 

Implement two static methods - findAvgBudgetByDirector and getMovieByRatingBudget in Solution class.

 

findAvgBudgetByDirector method:
This method will take two input parameters - array of Movie objects and string parameter director. 
The method will return the average of the budget attribute from Movie objects directed by the director passed as parameter. 
If no movie with the given director is present in the array of movie objects, then the method should return 0. 

 

getMovieByRatingBudget method:
This method will take two int parameters rating and budget, along with the array of movie objects.
The method will return the movie object, if the input parameters rating and budget, matches with the rating and budget attribute of the movie object respectively.

Also check if rating is a factor of budget (eg: 3 is a factor of 12 because 3 divides 12 without leaving a remainder).
If any of the conditions are not met, then the method should return null.

 

Note : No two movie object would have the same value for rating and budget attributes.
          All the searches should be case insensitive.
          The budget mentioned are in crores and in INR.
       

These above mentioned static methods should be called from the main method. 

For findAvgBudgetByDirector method - The main method should print the average budget as it is if the returned value is greater than 0, or it
should print "Sorry - The given director has not yet directed any movie".

 

For getMovieByRatingBudget method - The main method should print the movieId of the returned movie object. If the returned value is null
then it should print "Sorry - No movie is available with the specified rating and budget requirement".

 

Before calling these static methods in main, use Scanner object to read the values of four
Movie objects referring attributes in the above mentioned attribute sequence. 
Next, read the value for director, rating and budget.


Consider below sample input and output:


Input:


1101
ratham
4
100
1201
shankar
5
500
1301
shankar
3
50
1401
ratham
5
300
ratham
5
300

​

Output:


200
1401

​


*/