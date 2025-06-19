import java.util.*;

class Medicine {
	String medicineName;
	String batch;
	String disease;
	int price;

	public Medicine(String name, String batch, String disease, int price) {
		this.medicineName = name;
		this.batch = batch;
		this.disease = disease;
		this.price = price;
	}
	public String getName() {
		return medicineName;
	}
	public String getBatch() {
		return batch;
	}
	public String getDisease() {
		return disease;
	}
	public int getPrice() {
		return price;
	}

}

public class IPA12 {
	public static int[] getPriceByDisease(Medicine[] m, String disease) {
		int[] arr = new int[0];
		for(int i=0; i<m.length; i++) {
			if(m[i].getDisease().equalsIgnoreCase(disease)) {
			    arr = Arrays.copyOf(arr, arr.length+1);
				arr[arr.length-1] = m[i].getPrice();
			}
		}
		Arrays.sort(arr);
		return arr;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Medicine[] m = new Medicine[4];
		for(int i = 0; i<4; i++) {
			String a = sc.nextLine();
			String b = sc.nextLine();
			String c = sc.nextLine();
			int d = sc.nextInt();
			sc.nextLine();
			m[i] = new Medicine(a,b,c,d);
		}
		String dd = sc.nextLine();

		int[] res = IPA12.getPriceByDisease(m, dd);
		for(int i = 0; i<res.length; i++) {
			System.out.println(res[i]);
		}
	}
}









