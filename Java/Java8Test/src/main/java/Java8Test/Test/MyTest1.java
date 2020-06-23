package Java8Test.Test;

import java.util.*;

public class MyTest1 {
	
	public int solution( int A[]) {
		int result = 0;
		
		List<Integer> list = new ArrayList<Integer>();
		int firstNumber = 0;
		int secondNumber = 0;
		
		for( int i=0; i<A.length; i++ ) {
			if( list.size() == 0) {
				list.add(A[i]);
				firstNumber = A[i];
			}
			else if( list.size() == 1) {
				list.add(A[i]);
				secondNumber = A[i];
			}
			else if( list.size() >= 2 && (A[i] == firstNumber || A[i] == secondNumber) )
			{
				list.add(A[i]);
			}
			else {
				
			}
					
		}
		
		return list.size();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyTest1 myTest = new MyTest1();
		
		//int A[] = {4,2,2,4, 2 };
		// int A[] = {1, 2, 3, 2 };
		// int A[] = {0, 5, 4, 4, 5,1,2};
		int A[] = {4,4};
		
		int result = myTest.solution(A);
		System.out.println( result);
		

	}

}
