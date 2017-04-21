package CoreJavaTraining;

public class FindMaxValueInArray {

    private String name = "";


    public FindMaxValueInArray(String name){
        this.name = name;
    }

	public static void findMaxInt(int[] arr) {
		try{
			if(arr.length < 1) {
				return;
			}

			int result = arr[0];
			if (arr.length == 1) {
				result = arr[0];
			}
			for(int i = 1; i < arr.length; i++) {
				if (arr[i] > result) {
					result = arr[i];
				}
			}
			System.out.println(result);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
	
	
	public static void main(String[] args) {
		
		int[] array1 = {1,1,2,6,24,120,720,5040};
		int[] array2 = {-2,3,8,111};
		int[] array3 = {'f','a'};
		
		FindMaxValueInArray fmv = new FindMaxValueInArray("I am Array");
		
		FindMaxValueInArray.findMaxInt(array1);
		fmv.findMaxInt(array2);
		fmv.findMaxInt(array3);

		System.out.println(fmv.name);
		
	}

}
