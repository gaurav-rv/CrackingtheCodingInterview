import java.util.Arrays;

public class Array_delete_subarray {

	int[] input = new int[100];
	int arr1[] = new int []{2,6};
	int arr2[] = new int []{3,5};
	int arr3[] = new int []{7,21};
	int arr4[] = new int []{20,21};
	
	public Array_delete_subarray(String string){
		//int arra[] = new int[arr1.length+arr2.length+arr3.length+arr4.length];
		//System.out.println(arra.length);
		string = string.replaceAll("\\(", "");
		string = string.replaceAll("\\)", "");
		string = string.replaceAll("\\[", "");
		string = string.replaceAll("\\]", "");
		System.out.println(string);
		int[] array_n = new int[13];
		String ok = "";
		int j = 0;
		for(int i = 0 ; i < string.length(); i++){
			if(string.charAt(i) == ',' || i == string.length()-1 ) 
				{
					if(i == string.length()) ok = ok+string.charAt(i)+string.charAt(i+1);
					array_n[j] = Integer.parseInt(ok);
					j++;
					//System.out.print(Integer.parseInt(ok));
					ok = "";
				}
			
			else ok = ok+string.charAt(i);
				
		}
		int count = 0;
		for(int i = array_n.length; i> 0 ; i-- ){
			if(array_n[i-1] == 0){
				count ++;
			}
		}
		//System.out.print(count);
		array_n = Arrays.copyOf(array_n, array_n.length - count);
		
		for(int i = 0; i< array_n.length ; i++ ){
				System.out.print(array_n[i]+ " ");
				
		}
		
		
	}
}
