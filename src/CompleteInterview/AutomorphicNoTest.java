
package CompleteInterview;

import java.util.Scanner;

/**
 * @author Rameswar Prasad Das
 *
 */
public class AutomorphicNoTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
        System.out.println("Enter The No To Check for Automorphic");
        int no=scanner.nextInt();
        int square=no*no;
        String squ=Integer.toString(square);
        String givenno=Integer.toString(no);
        if (squ.endsWith(givenno)) {
			System.out.println(no+" is an Automorphic no");
		}else{
			System.out.println(no+" is not an Automorphic no");
		}
        scanner.close();
	}

}
