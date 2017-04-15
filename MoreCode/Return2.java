
public class Return2 {

	public Return2(){
		
	}
	public void lol(){
		int M = 21; 
		numberof2(M);
	}
	private void numberof2(int num) {
		int count  = 0;
		for (int i = 0 ; i <= num ; i++){
			if(rem(i) == true ){
				count ++;
			}
		}
		System.out.println(count);
		
	}
	private boolean rem(int num) {
		int remi = 0;
		int quot = 0;
		while(num != 0){
			 remi = num %10;
			 quot = num /10; 
			 if(remi == 2 || quot == 2){
				 return true;
			 }
			 num = num/10;
		}
		return false;
	}
	
	public void maxofgiven(){
		int[] a = new int[]{54,546,548,60};
		int maxlen = 0;
		int finalize = 0;
		String[] b = new String[a.length];
		for(int i = 0; i < a.length; i++){
			b[i]=String.valueOf(a[i]);
			maxlen = b[i].length();
			if(maxlen > finalize){
				finalize = maxlen;
			}
		}
		System.out.println("Maxlen : " + finalize  );
		
		int[] c = new int[a.length];
		for(int i = 0; i < c.length; i++){
			promdigit(a);
		}
	}
	private void promdigit(int[] a) {
		// TODO Auto-generated method stub
		
	}
	
	public void Testfunc(){
		double j = 2413.315;
		int x = (int ) j;
		System.out.println(x);
		byte b = (byte) x;
		System.out.println(b);
		char ch = (char) b;
		System.out.println();
		System.out.print("Value is "+(int) ch);
				
		
	}
	
}
