package CompleteInterview.GeeksforGeeks.String;

public class AdjecentCharacterRemove {

	public static void main(String[] args) {
		String string = "geeksforgeek";
    
		StringBuffer sb=new StringBuffer(string);
		
		
		int ln=sb.length();
		

		int n=ln-1;
			while(true && n>0) {
				
			
				boolean make=false;
				while(true && n > 0) {
					if((string.charAt(n) == string.charAt(n-1)) && (sb.charAt(n) == sb.charAt(n-1))) {
						make=true;
						n--;
					}else {
						break;
					}
					
				}
				
				if(make) {
					sb=new StringBuffer(sb.replace(n, ln, ""));
					ln=sb.length();	
					n=ln-1;
				}else {
					n--;
					ln--;
				}
				
			}		
		
		System.out.println(sb.toString());


	}

}
