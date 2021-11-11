
public class FloatMax {

public static Float maxOfThree(Float x, Float y, Float z) {
		
		Float max = x;
		if (y.compareTo(max) > 0)
			max = y;
		if (z.compareTo(max) > 0)
			max = z;
		return max;
		
	}
	public static void main(String[] args) {
		
		Float maximum = FloatMax.maxOfThree(10.12f, 20.2f, 30.4f);
		System.out.println("Maximum of three is:" +maximum);
	}
}
