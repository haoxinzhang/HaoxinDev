package Java8Test.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionSort {
	
	public static void main( String args[]) {
		
		List<String> myList = Arrays.asList( "Haoxin", "Dongbin", "Helen");
		Collections.sort(myList);
		
		System.out.println( myList.toString());	
		Collections.sort(myList, Collections.reverseOrder());
		System.out.println( myList.toString());
		
	}

}
