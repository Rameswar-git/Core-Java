package ThisTest;

public class This_Test {
    String name;
    int value;
	
    public This_Test(){
    	
    }
    
    public This_Test(String tst,int value) {
    	this.name=tst;
    	this.value=value;
	}
    
    
    public This_Test method(){
    	return this;
    }
    
    
}
