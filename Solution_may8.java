import java.util.*;

class Player {
	private int playerId;
	private String skill;
	private String level;
	private int points;

	public Player(int pid, String skill, String lvl, int points) {
		this.playerId = pid;
		this.skill = skill;
		this.level = lvl;
		this.points = points;
	}

	public int getPlayerId() {
		return playerId;

	}
	public String getSkill() {
		return skill;

	}
	public String getLevel() {
		return level;

	}
	public int getPoints() {
		return points;

	}

}

public class Solution_may8 {
	public static int findPointsForGivenSkill(Player[] arr, String skill) {
		int count = 0;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i].getSkill().equals(skill)) {
				count+=arr[i].getPoints();
			}
		}
		return count;

	}
	public static Player getPlayerBasedOnLevel(String level, String skill, Player[] arr) {
		Player[] newArr = new Player[0];
		for(int i =0; i<arr.length; i++) {
			if(arr[i].getLevel().equals(level) && arr[i].getSkill().equals(skill)
			        && arr[i].getPoints() >= 20) {
				return arr[i];

			}

		}
	    return null;
	}



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Player[] player = new Player[4];

		for(int i = 0; i< player.length; i++) {
			int a = sc.nextInt();
			sc.nextLine();
			String b = sc.nextLine();
			String c = sc.nextLine();
			int d = sc.nextInt(); sc.nextLine();
			
            player[i] = new Player(a,b,c,d);
		}
		String skill = sc.nextLine();
		String level = sc.nextLine();
		
		int res1 = Solution_may8.findPointsForGivenSkill(player, skill);
		Player res2 = Solution_may8.getPlayerBasedOnLevel(level, skill, player);
		
		if(res1> 0){
		    System.out.println(res1);
		}else{
		    System.out.println("This given skill is not available");
		}
		
		if(res2 != null ){
		    System.out.println(res2.getPlayerId());
		}else{
		    System.out.println("No player is available with specified level, skill and eligibility points"); 
		}

	}
}


/*

Create a class Player with below attributes:
playerId - int
skill - String
level - String 
points - int

 

Write getters, setters and parameterized constructor in the above mentioned attribute sequence as required. 

 

Create class Solution with the main method. 

Implement two static methods - findPointsForGivenSkill and getPlayerBasedOnLevel in Solution class.

 

findPointsForGivenSkill method:
This method will take two input parameters - array of Player objects and string parameter skill. 
The method will return the sum of the points attribute from player objects for the skill passed as parameter. 
If no player with the given skill is present in the array of player objects, then the method should return 0. 

 

getPlayerBasedOnLevel method:
This method will take two String parameters level and skill, along with the array of Player objects.
The method will return the player object, if the input String parameters matches with the level and skill attribute of the player object and its point attribute is greater than or equal to 20. If any of the conditions are not met, then the method should return null.

 

Note : No two player object would have the same value for skill and level attribute.
       All player object would have the points greater than 0.
       All the searches should be case insensitive.


These above mentioned static methods should be called from the main method. 

For findPointsForGivenSkill method - The main method should print the points as it is if the returned price is greater than 0, or it
should print "The given Skill is not available".

For getPlayerBasedOnLevel method - The main method should print the playerId of the returned player object. If the returned value is null
then it should print "No player is available with specified level, skill and eligibility points".

 

Before calling these static methods in main, use Scanner object to read the values of four Player objects referring attributes in the above mentioned attribute sequence. 
Next, read the value for skill and level.
Please consider the skill value read above as skill parameter for both the static methods.


Consider below sample input and output:
Input:

101
cricket
Basic
20
102
cricket
Intermediate
25
111
football
Intermediate
50
113
baseball
Advanced
100
cricket
Intermediate

 

Output:
45
102

*/