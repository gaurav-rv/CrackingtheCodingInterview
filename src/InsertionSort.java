
public class InsertionSort {

	public static void main (String a[]){
		int[] arr1 = {6,5,7,3,1,2};
		InsertionSort(arr1);
	}
	
	private static void InsertionSort(int[] arr1) {
		
		int temp;
			for(int i =1; i< arr1.length; i++){
				for (int j=i; j>0; j--){
					if (arr1[j] < arr1[j-1]){
						temp = arr1[j];
						arr1[j]= arr1[j-1];
						arr1[j-1] = temp;
					}
				}
				Print_Arr(arr1);
				System.out.println();
			}
		
	}

	private static void Print_Arr(int[] arr1) {
		for (int i=0; i<arr1.length; i++ ){
			System.out.print(arr1[i]);
			System.out.print(",");
			
		}
	}
}
