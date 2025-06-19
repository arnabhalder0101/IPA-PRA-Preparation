import java.util.*;

class Player {

	private int playerId;
	private String skill;
	private String level;
	private int points;


	public Player(int id, String skill, String level, int points) {
		this.playerId = id;
		this.skill = skill;
		this.level = level;
		this.points = points;

	}
	public int getId() {
		return playerId;
	}
	public String getSkill() {
		return skill;
	}
	public String getLevel() {
		return level;
	}
	public double getPoints() {
		return points;
	}

}

public class IPA11 {

	public static int findPointsForGivenSkill(Player[] p, String skill) {
		int sum = 0;
		for(int i = 0; i<p.length; i++) {
			if(p[i].getSkill().equalsIgnoreCase(skill)) {
				sum+=p[i].getPoints();
			}
		}

		return sum;
	}

	public static Player getPlayerBasedOnLevel(String level, String skill, Player[] arr) {
		for(int i = 0; i<arr.length; i++) {
			if(arr[i].getSkill().equalsIgnoreCase(skill) &&
			        arr[i].getLevel().equalsIgnoreCase(level)) {
				if(arr[i].getPoints()>= 20)   {
					return arr[i];
				}
			}
		}
		return null;
	}

	public static void main(String args[]) {
		Player[] p = new Player[4];
		Scanner sc = new Scanner(System.in);

		for(int i = 0; i<p.length; i++) {
			int a = sc.nextInt();
			sc.nextLine();
			String b = sc.nextLine();
			String c = sc.nextLine();
			int d = sc.nextInt();
			sc.nextLine();

			p[i] = new Player(a,b,c,d);
		}
		String skill  = sc.nextLine();
		String level  = sc.nextLine();

		int count = IPA11.findPointsForGivenSkill(p, skill);
		Player res2 = IPA11.getPlayerBasedOnLevel(level, skill, p);

		if(count>0) {
			System.out.println(count);
		} else {
			System.out.println("The Given skill is not available");
		}

		if(res2!= null) {
			System.out.println(res2.getId());

		} else {
			System.out.println("No player is available with specified level, skill and eligibility points");
		}
	}


}




















