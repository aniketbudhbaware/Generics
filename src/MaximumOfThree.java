
public class MaximumOfThree<T extends Comparable<T>> {
	T[] array;

	public MaximumOfThree(T[] array) {
		this.array = array;
	}
	public T testMaximum() {
		return MaximumOfThree.testMaximum(array);
	}
	
	public static <T extends Comparable<T>> T testMaximum(T[] array) {
		for (int i=0; i<4; i++) {
			for(int j=i; j<4; j++) {
				if(array[i].compareTo(array[j]) < 0) {
					T a = array[i];
					array[i] = array[j];
					array[j] = a;
				}
			}
		}
		System.out.println("Maximum is :"+ array[0]);
		return array[0];
	}
	public static void main(String[] args) {
		Integer[] arrInt = {10,56,6,74};
		Float[] arrFloat = {1.2f,346.6f,74.2f,21.3f};
		String[] arrString = {"Apple","Grapes","Peach","Mango"};
		new MaximumOfThree<Integer>(arrInt).testMaximum();
		new MaximumOfThree<Float>(arrFloat).testMaximum();
		new MaximumOfThree<String>(arrString).testMaximum();
	}
}
