/*Implement a method to perform basic string compression using the counts of repeated characters
 * aabcccccaaa = a2b1c5a3
 */
public class StringCompression {
	public static void main(String[] args){
		String test= "aabcccccaaa";
		StringComp(test);
	}

	private static void StringComp(String test) {
		// TODO Auto-generated method stub
		char k;
		char l;
		int first = 0, count =1;
		String res ="";
		l = test.charAt(0);
		for( int i =1; i<test.length(); i++ ){
			k = test.charAt(i);
			if(k == l){
				count++;
				l = test.charAt(i);
			}
			else{
				res = res+l+Integer.toString(count);
				l = test.charAt(i);
				//System.out.println(l);
				count =1;
			}
		}
		res = res+l+Integer.toString(count);
		System.out.println(res);
	}
}
