package Sort;

public class BubbleSort {
	
	public static int[] array = {1, 3, 6, 8, 2, 5, 1, 6, 4, 11, -2};
	
	
	public static void main(String[] args) {
		Sort sorter = new Sort();
		sorter.sortArray(array);
		sorter.printArray(array);

	}

}

class Sort {
	
	public int[] sortArray(int[] arr) {
		if(arr.length > 1) {
			for (int i = 0; i < arr.length-1; i++) {
				for (int k = i+1; k < arr.length; k++) {
					if (arr[i] > arr[k]) {
						int temp = arr[i];
						arr[i] = arr[k];
						arr[k] = temp;
					}
				}
			}
		}
		return arr;
	}
	
	void printArray(int[] arr) {
		StringBuffer result = new StringBuffer();
		for (int i = 0; i < arr.length; i++) {
			result.append(arr[i] + ", "); 
		}
		System.out.println(result);
	}
	
}