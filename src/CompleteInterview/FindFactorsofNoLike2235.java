package CompleteInterview;

public class FindFactorsofNoLike2235 {

	public static void main(String[] args) {
          int givenno=120;
          int index=2;
          while(givenno>1) {
        	  if(givenno % index == 0) {
        		  System.out.print(index+" ");
        		  givenno= givenno/index;
        	  }else {
        		  index++;
        	  }
          }
	}

}
