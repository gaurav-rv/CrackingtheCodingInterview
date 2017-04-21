
public class Longest_array_sequence {

	
	public Longest_array_sequence(){
		int[] array = new int[]{1,1,0,1,1,1,1,1,0,0,0,0,0,0,0};
		System.out.println("Contents of the array");
		int maxlen = 0;
		int index = 0;
		int finalize = 0;
		int findex = 0;
		
		for( int i = 0; i < array.length; i++ ){
				System.out.print(array[i]);
		}
		
		for( int i = 0; i < array.length-1; i++ ){
			if(array[i] == array[i+1]){
				maxlen++;
				index = i- maxlen + 1;
			}
			else maxlen = 0; 
			if( maxlen > finalize ){
				finalize = maxlen;
				findex = index; 
			}
		}
		System.out.println("\n  findex"+findex+"finalize"+finalize);
		for(int i = 0; i <= finalize; i++){
			System.out.print(array[findex+i]);
		}
	}
}
