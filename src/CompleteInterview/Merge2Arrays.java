package CompleteInterview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Merge2Arrays {

	public static void main(String[] args) {
           int[] ins= {1,2,3};
           int[] ins2= {4,5,6};
           
          
          List<Integer> inshd=Arrays.stream(ins).boxed().collect(Collectors.toList());

          inshd.addAll(Arrays.stream(ins2).boxed().collect(Collectors.toList()));
          
          System.out.println(inshd);
	}

}
