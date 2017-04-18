
public class Anagrams {

	public Anagrams(String string) {
		
		System.out.println(string);
		String ok = "";
		String try1 = "steer";
		String try2 = "t";
		System.out.println(Compare(try1,try2));
		for(int i = 0 ; i < string.length(); i++ ){
			if(string.charAt(i) == ','){

			}
		}
	}

	private boolean Compare(String try1, String try2) {
		if(try1.length() != try2.length()) return false;
		int count = 0;
		int j = 0;
		String temp = try2;
		for(int i = 0 ; i < try1.length(); i++){
			while(temp != ""){
				
				if(j == temp.length()  ){
					System.out.println("Not matching");
					return false;
				}
				
				if(temp.charAt(j) == try1.charAt(i) ){
					temp = temp.substring(0, j) + temp.substring( j+1 );
					System.out.println(temp);
					j = 0;
					break;
				}
				
				else j++;
			}
		}
		return true;
		
	}

	
	
}
/*while(j != temp.length()){

if(count == try2.length() ) {
	System.out.println("Doesnt match");
	return false;	
	}

if (try2.charAt(count) == try1.charAt(i)){
	j++;
	System.out.println(count);
	 if (j == try2.length()-1) temp = temp.substring(0, count); 
	 else temp = temp.substring(0, count) + temp.substring(count+1);
		
	 System.out.println("Temp : " +temp);
	 count = 0 ;
}

count ++;
}*/