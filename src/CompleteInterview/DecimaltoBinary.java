package CompleteInterview;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class DecimaltoBinary {

	public static void main(String[] args) {
         int no=124;
       List<Integer> nos=new ArrayList<>();
         while(no>0) {
        	 nos.add(no%2);
        	 no=no/2;
         }
         System.out.print(" Using own calculations ");
         IntStream.range(0, nos.size()).map(p -> (nos.size()-1) - p).forEachOrdered(x -> System.out.print(nos.get(x)));
         System.out.println("\n Unsing Integer Class "+Integer.toBinaryString(124));
	}

}
