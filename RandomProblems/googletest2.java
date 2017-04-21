import java.util.Arrays;

public class googletest2 {

	public static void main(String args[]){
		String test1 = "abcde";
		String test2 = "abbcdde";
		String test3 = "bacb";
		//isUnique1(test1);
		//isUnique1(test2);
		//isUnique1(test3);
		isUnique2(test1);
		isUnique2(test2);
		isUnique2(test3);
	}

	private static void isUnique2(String k) {
		//String[] st = k.split("");
		boolean[] ar = new boolean[128];
		for(int i=0; i<k.length();i++ ){
			int val = k.charAt(i);
			if(ar[val]){
				System.out.println("Not true");
				return;
			}
			ar[val]= true;
		}
		System.out.println("True");
	}

	private static void isUnique1(String k) {
		String[] ar = k.split("");
		System.out.println(k);
		
		for(String s: ar){
			System.out.println(s);
		}
		
		for(int i =0; i <=ar.length;i++){
			for(int j = i+1; j<ar.length; j++){
				if(ar[i] == ar[j]){
					System.out.println("False"+ar[i]+"  " + ar[j]);
					return;
				}
			}
		}
		System.out.println("True");
	}
}
