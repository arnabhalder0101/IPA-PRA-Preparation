import java.util.*;

public class TravelAgency{
	int regNo;
	String agencyName;
	String packageType;
	int price;
	boolean flightFacility;
	TravelAgency(int regNo,String agencyName,String packageType,	int price,boolean flightFacility){
		this.regNo = regNo;
		this.agencyName = agencyName;
		this.packageType = packageType;
		this.price = price;
		this.flightFacility = flightFacility;
	}
	public int getregNo(){
		return this.regNo;
	}
	public String getagencyName(){
		return this.agencyName;
	}
	public String getpackageType(){
		return this.packageType;
	}
	public int getPrice(){
		return this.price;
	}
	public boolean getflightFacility(){
		return this.flightFacility;
	}
}

class Solution{
	public static int findAgencyWithHighestpackagePrice(TravelAgency[] arr){
		int max = arr[0].getPrice();

		for(int i =0; i<arr.length; i++){
			if(arr[i].getPrice() > max){
				max = arr[i].getPrice();
			}
		}
		return max;
	}
	
	public static TravelAgency agencyDetailsForGivenldAndType(TravelAgency[] arr, int regNo, String type){
		
		for(int i =0; i<arr.length; i++){
			if(arr[i].getregNo() == regNo && arr[i].getpackageType().equals(type) && arr[i].getflightFacility()){
				return arr[i];
			}
		}
		return null;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		TravelAgency[] agencies = new TravelAgency[4];
		for(int i = 0; i<agencies.length; i++){
			int a = sc.nextInt(); sc.nextLine();
			String b = sc.nextLine();
			String c = sc.nextLine();
			int d = sc.nextInt(); sc.nextLine();
			boolean e = sc.nextBoolean();

			agencies[i] = new TravelAgency(a,b, c, d, e);
		}
		int f = sc.nextInt(); sc.nextLine();
		String g = sc.nextLine();
		
		int res = Solution.findAgencyWithHighestpackagePrice(agencies);
		System.out.println("Price: "+res);
		
		TravelAgency res2 = Solution.agencyDetailsForGivenldAndType(agencies, f, g);
		if(res2!= null){
			System.out.println(res2.getagencyName()+":"+ res2.getPrice());
		}
		else{
			System.out.println("No Match Found!");	
		}
		
	}
}