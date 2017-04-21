/*
 * Compound String
 * Gaurav Venkatesh
 * 
 * Objective: Accept all the words and see which word is a composition of the other.
 * Approach: Use a HashSet to make a sort of dictionary of all the words.
 * Iterate through each word and check it with the rest of the words.
 * 
 * Why HashSet?
 * 	- Efficiency in word retrieval
 * 	- Does not add duplicates.
 * 
 * Optimize: Probably check the size of the strings being compared, i.e smaller word length cannot be expressed with bigger words
 * Start time: ~ 12:06 pm 
 * End time:
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class CompoundString {

	public static void main(String[] args){
		Set<String> Input = new HashSet<String>();
		//ArrayList<String> Compound = new ArrayList<String>();// will contain all the words which are a compound.
		Input.add("man");
		Input.add("woman");
		Input.add("manhandle");
		Input.add("handle");
		Input.add("race");
		Input.add("drag");
		Input.add("car");
		Input.add("racecar");
		Input.add("computer");
		Input.add("bag");
		Input.add("dragon");
		Input.add("manbag");
		for (String s: Input){
			//System.out.println(s);
			CheckComp(s,Input);
		}
	}

	private static void CheckComp(String s, Set<String> dict) {	 
		for(int i=0; i<s.length() ;i++ ){
			if( dict.contains(s.substring(0,i)) && dict.contains(s.substring(i, s.length())) ){
				System.out.println(s);
			}
		}
	}

}
