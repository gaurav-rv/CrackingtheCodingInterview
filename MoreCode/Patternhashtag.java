import java.util.HashSet;
import java.util.Set;

public class Patternhashtag {
	
	public Patternhashtag(int N){
		
		//print(N);
	}

	public void print(int N) {
		// TODO Auto-generated method stub
		//System.out.print("2");
		Set<Character> Lol = new HashSet<Character>();
		
		for( int i = 0 ; i < N ; i++){
			for(int j = 0 ; j < N; j++){
				if( j+1 >= N-i ) System.out.print("#");
				else System.out.print(" ");
			}
			System.out.println();
		}
	}
}
