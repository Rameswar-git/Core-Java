package CompleteInterview;

public class SwapwithoutThiredVarible {

	public static void main(String[] args) {
        int a=5;
        int b=6;
        
        a=a+b;
        b=a-b;
        a=a-b;
        
        System.out.println("a  b  "+a+" "+b);
        
        String name1="Test1";
        String name2="Test2";
        
        name1=name1.concat(name2);
        
        name2=name1.substring(0,name1.indexOf(name2));
        
        
        name1=name1.substring(name2.length(),name1.length());
        
        
        System.out.println(" "+name2+" "+name1); 
        
         
	}

}
