
public class Reverse_letter_string_no_space {
	
	public Reverse_letter_string_no_space(String test){
	//String test = new String("Hello there hope u are well");	
	char[] hello = test.toCharArray();
	int end =0;
	String reverse = " ";
	String output = " ";
		for( int i =0; i < test.length(); i++){
			if(test.charAt(i) !=' '){
				reverse = reverse+test.charAt(i);
			}
			if(test.charAt(i) == ' ' && reverse != "" || i == test.length()-1){
				System.out.println(" Reverse: "+reverse);
				output = output+ " "+Reverse(reverse);
				reverse = "";
			}
		}
		System.out.println(" Final Output :" + output );
	}

	private static String Reverse(String reverse) {
		String retun = "";
		for(int i = reverse.length()-1; i >= 0; i--){
			retun = retun + reverse.charAt(i); 
		}
		System.out.println(retun);
		return retun;
	}
}
