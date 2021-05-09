package CompleteInterview.Algorithams;
//Test
public class BinarySearch {

	// For Binary Search the elements of the array need to be sorted
	
	//test

	public static void main(String[] args) {
		int[] elements = { 1, 2, 3, 5 };

		int first = 0, last = elements.length - 1;
		
		int search=3;

		int middle = (first + last) / 2;

		while (first <= last) {
			if(search < elements[middle]) {
				last=middle-1;
			}else if(search == elements[middle]) {
				System.out.println(" The element is found in the index "+middle);
				break;
			}else {
				first=middle+1;
				middle = (first + last) / 2;
			}

		}
		
		  if ( first > last )
		      System.out.println(search + " isn't present in the list.\n");
		

	}

}
