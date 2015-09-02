package Arrays;

public class FindMaxValueInArray {
	
	static int[] array = {1, 333, 5352, -223, 0, 4};
	static int[] arrayEmpty = {};
	
	public static void main(String[] args) {
		System.out.println(findMax(array));
		System.out.println(findMax(arrayEmpty));
	}
	
	public static String findMax(int[] arr) {
		if(arr.length > 0) {
			int maxValue = arr[0];
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] > maxValue) {
					maxValue = arr[i];
				}
			}
			return Integer.toString(maxValue);
		}
		return "Array is empty";
	}
}


