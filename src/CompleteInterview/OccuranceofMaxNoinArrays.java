package CompleteInterview;

import java.util.Arrays;
import java.util.stream.IntStream;

public class OccuranceofMaxNoinArrays {

	public static void main(String[] args) {
         int[] ins= {3,5,2,5,5,5,0,5,9,5};
         
         int max=Arrays.stream(ins).max().getAsInt();

         
          int[] maxns= IntStream.range(0, ins.length)
        		   .filter(x -> ins[x] == max).toArray();
          
           
           System.out.println(" Max No is "+max+" and it occured in indexs "+Arrays.toString(maxns)+" length is "+maxns.length);
           
	}

}
