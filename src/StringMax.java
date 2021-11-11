
public class StringMax {

public static String maxOfThree(String x, String y, String z) {
		
		String max = x;
		if (y.compareTo(max) > 0)
			max = y;
		if (z.compareTo(max) > 0)
			max = z;
		return max;
		
	}
	public static void main(String[] args) {
		
		String maximum = StringMax.maxOfThree("rahul", "aniket", "amit");
		System.out.println("Maximum of three is:" +maximum);
	}
}
