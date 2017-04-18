//  Given two strings, write a method to decide if one is a permutation of the other

public class array1_2 {

	public static void main(String args[]){
		String s1= "Mr John Smith       ";
		String s2= "cbabadcbbabbcbabaabccbababc";
		Compare(s1);
	}

	private static void Compare(String k) {
		// TODO Auto-generated method stub
		k=k.trim();
		for(int i =0; i <k.length()-1;i++){
			if(k.charAt(i)==' '){
				k=k.substring(0, i)+"%20"+k.substring(i+1, k.length());
			}
		}
		System.out.println(k);
	}
}
