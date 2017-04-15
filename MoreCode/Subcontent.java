import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Subcontent {

	public Subcontent(){
		//Input();
	}

	@SuppressWarnings("unchecked")
	public void Input() {
		int[] a = new int[]{6,7,1,3,2,4,5,2,3,1,2,5};
		int[] key = new int[]{2,5,1};
		Set k = new HashSet<Integer>();
		for(int i = 0 ; i < key.length;i++){
			k.add(key[i]);
		}
		Set copy = new HashSet<>();
		copy.addAll(k);
		int start = 0;
		int end = 0;
		int count = 0;
		int maxlen = 0;
		int reals = 0;
		
		for(int i = 0 ; i < a.length;i++){
			if(k.contains (a[i]) && copy.contains (a[i]) ){
				copy.remove(a[i]);
				end = i;
				count ++;
		//		System.out.println(end);
				
			}
			if(count > 0){
				start ++;
				//System.out.println("works?" + start );
			}
			
			if(copy.isEmpty()) {

				if(count > maxlen){
					maxlen = count;
					reals = end - start;
			//		System.out.println(" start : " +reals );
				}
				count = 0;
				copy.addAll(k);
				//System.out.println(k.size());
			}	
		}
		int N = 5;
		for(int i = 0; i < N; i++){
			for (int j = 0; j < N ; j++){
				if(j+1 < N - i) System.out.print(" ");
				else System.out.print(i+1);
			}
			System.out.println();		}
		
	}
}
