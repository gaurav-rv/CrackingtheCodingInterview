
public class BubbleSort {
	public static void main (String a[]){
		int[] arr1 = {6,5,7,3,1,2};
		BubbleSort(arr1);
	}
	
	private static void BubbleSort(int[] arr1) {
		// TODO Auto-generated method stub
		int temp;
		int j = arr1.length;
		for(int i =0; i< j;i++){
			for(int k = 1; k < (j-i);k++) 
			if (arr1[k] < arr1[k-1]){
				temp= arr1[k];
				arr1[k]= arr1[k-1];
				arr1[k-1]=temp;
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
