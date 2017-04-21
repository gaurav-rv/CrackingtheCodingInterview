import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class googletest {
	
	public static void main(String args[]){
		int n1 = 500, n2=1234, n3 =9854, big =0;
		String n = Integer.toString(n3);
		for (int i=0; i<n.length()-1;i++){
			String one = Character.toString(n.charAt(i));
			String two = Character.toString(n.charAt(i+1));
			float first = Float.parseFloat(one);
			float second = Float.parseFloat(two);
			float result = (first + second)/2;
			int r = Math.round(result);
			String k = Integer.toString(r);
			String finish = n.substring(0,i)+k+n.substring(i+2,n.length());
			int answer = Integer.parseInt(finish);
			if(big<answer) big = answer;
		}
		System.out.println(big);
	}
}