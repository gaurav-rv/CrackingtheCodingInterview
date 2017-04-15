import java.util.ArrayList;

public class String_replace_trim {
	
	
	public static void trim_replace( String input){
		String trimmed = input.trim();
		//System.out.println(trimmed);
		
		for( int i = 0; i < input.length();i++){
			if( trimmed.charAt(i)== ' '){
				trimmed = trimmed.substring(0,i) + "%20" + trimmed.substring(i+1,trimmed.length());
			}
		}
		System.out.println(trimmed);
	}
	
	private static void Expansion(String input) {
		// TODO Auto-generated method stub
		String Result ="";
		for(int i =0; i < input.length();i+=2){
			String letter = input.charAt(i)+"";
			String index = input.charAt(i+1)+"";
			int it = Integer.parseInt(index);
			for(int j = 0; j < it; j++){
				Result = Result + letter;
			}
		}
		System.out.println(Result);
	}
	private static void Compression(String input) {
		// TODO Auto-generated method stub
		String Result = "";
		int count = 1;
		char toadd = input.charAt(0);
		for(int i = 0; i < input.length()-1;i++){
			
			if( input.charAt(i) == input.charAt(i+1) ){
				count ++;
			}
			else{
				Result = Result + toadd + String.valueOf(count);
				count = 1;
				toadd = input.charAt(i+1);
			}
			
		}
		Result = Result + toadd + String.valueOf(count);
		System.out.println(Result);		
	}
	
	public static void Matrix_rotate(int [][] table, int n){
		int[][] result = new int[n][n];
		int k = n;
		for( int i = 0; i < n; i++){
			k--;
			for( int j = 0; j < n; j++){
				result[j][k ] = table[i][j];
			}
		}
		
		for(int i =0; i < n; i++){
			for(int j =0; j < n; j++){
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String args[]){
		/*
		 * Write a method to replace all spaces in a string with'%20'. You may assume that
		the string has sufficient space at the end of the string to hold the additional
		characters, and that you are given the "true" length of the string. (Note: if implementing
		in Java, please use a character array so that you can perform this operation
		in place.)

		EXAMPLE
		Input:  "Mr John Smith    "
		Output: "Mr%20Dohn%20Smith"
		 */
		System.out.println(" Write a method to replace all spaces in a string with'%20'. \n "
				+ "You may assume that the string has sufficient space at the end of the string to hold the additional \n "
				+ "characters, and that you are given the true length of the string. \n"
				+ " (Note: if implementing in Java, please use a character array so that you can perform this operation \n"
				+ "in place.) \n"
				+ "EXAMPLE \n"
				+ "Input:  Mr John Smith    \n" 
				+ "Output: Mr%20Dohn%20Smith \n");
		
		String input = "Mr John Smith    ";
		trim_replace(input);
		
		System.out.println("-------------------");
		// ----------------------------------------------------------------		
		/*
		 * Implement a method to perform basic string compression using the counts
		   of repeated characters. For example, the string aabcccccaaa would become
		   a2blc5a3. If the "compressed" string would not become smaller than the original
		   string, your method should return the original string.
		 * */
		System.out.println("Implement a method to perform basic string compression using the counts \n"
				+ "of repeated characters. For example, the string aabcccccaaa would become \n"
				+ "a2blc5a3. If the compressed string would not become smaller than the original \n"
						+ "string, your method should return the original string. \n");
		input = "a2b1c5a3";
		System.out.println("Expansion is ");
		Expansion(input);
		System.out.println("------------");
		
		System.out.println("Compression is ");
		input = "aabcccccaaa";
		Compression(input);
		System.out.println("------------");
		
		/*
		 * Given an image represented by an NxN matrix, where each pixel in the image is
			4 bytes, write a method to rotate the image by 90 degrees. Can you do this in
			place?
		 */
		
		System.out.println("Given an image represented by an NxN matrix, where each pixel in the image is \n"
				+ "4 bytes, write a method to rotate the image by 90 degrees. Can you do this in \n"
				+ "place?");
	
		int[][] table1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int[][] table2 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
		System.out.println("Work on 3 x 3");
		Matrix_rotate(table1,3);
		
		System.out.println("Work on 4 x 4");
		
		Matrix_rotate(table2,4);
		System.out.println();
		
		/*1.7 Write an algorithm such that if an element in an MxN matrix is 0, its entire row
		and column are set to 0.*/

		System.out.println(" \n 1.7 Write an algorithm such that if an element in an MxN matrix is 0,"
				+ " its entire row and column are set to 0. \n");
		int[][] table3 = {{1, 2, 3}, {4, 5, 6}, {0, 8, 9}};
		int[][] table4 = {{1, 2, 3, 0}, {5, 6, 7, 8}, {0, 10, 11, 12}, {13, 14, 15, 0}};
		
		System.out.println("Matrix 3 x 3");
		PrintMatrix(table3,3,3);
		System.out.println("Matrix 4 x 4");
		PrintMatrix(table4,4,4);
		ZeroitUp(table3,3,3);
		ZeroitUp(table4,4,4);
		System.out.println("After Rotate 3 ");
		PrintMatrix(table3,3,3);
		System.out.println("After Rotate 4 ");
		PrintMatrix(table4,4,4);
		System.out.println("----------------------------------");
		
		/*1.8 Assume you have a method isSubstring which checks if one word is a
		substring of another. Given two strings, si and s2, write code to check if s2 is
		a rotation of si using only one call to isSubstring (e.g.,"waterbottle"is a rotation
		of "erbottlewat").*/
		
		System.out.println("1.8 Assume you have a method isSubstring which checks if one word is a \n"
				+ "substring of another. Given two strings, si and s2, write code to check if s2 is \n"
				+ "a rotation of si using only one call to isSubstring (e.g.,waterbottleis a rotation \n "
				+ "of erbottlewat).");
		String s1 = "waterbottle";
		String s2 = "erbottlewat";
		String s3 = "water";
		
		System.out.println(TestIfrotate(s1,s2));
		System.out.println(TestIfrotate(s2,s1));
		System.out.println(TestIfrotate(s1,s3));
		System.out.println(TestIfrotate(s3,s1));
	}

	private static boolean TestIfrotate(String s1, String s2) {
		if(s1.length()!=s2.length()) return false;
		
		s2 = s2 +s2;
		if(s2.contains(s1)) return true;	
		else return false;
			
	}

	public static void ZeroitUp(int[][] table, int x, int y) {
		ArrayList row = new ArrayList(); 
		ArrayList col = new ArrayList();
		
		for(int i =0; i < x; i++){
			for( int j = 0; j < y; j++){
				if(table[i][j] == 0){
					col.add(i);
					row.add(j);
				}
			}
		}
		for(int i = 0; i < row.size(); i++){
			int inter = (int) row.get(i);
			for(int j = 0; j < y; j++ ){
				table[j][inter] = 0;
			}
		}
		for(int i = 0; i < col.size(); i++){
			int cool = (int) col.get(i);
			for(int j = 0; j < x; j++ ){
				table[cool][j] = 0;
			}
		}
		
	}

	private static void PrintMatrix(int[][] table, int x, int y) {
		// TODO Auto-generated method stub
		for(int i = 0; i < x; i++){
			for(int j = 0; j < y; j++){
				System.out.print(table[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println();
	}


	
	
}


