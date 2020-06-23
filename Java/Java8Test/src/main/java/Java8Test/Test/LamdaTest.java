package Java8Test.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LamdaTest {

	   public static void main(String args[]) {
	      LamdaTest tester = new LamdaTest();
			
	      //with type declaration
	      MathOperation addition = (int a, int b) -> a + b;
			
	      //with out type declaration
	      MathOperation subtraction = (a, b) -> a - b;
			
	      //with return statement along with curly braces
	      MathOperation multiplication = (int a, int b) -> { return a * b; };
			
	      //without return statement and without curly braces
	      MathOperation division = (int a, int b) -> a / b;
			
	      System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
	      System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
	      System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
	      System.out.println("10 / 5 = " + tester.operate(10, 5, division));
			
	      //without parenthesis
	      GreetingService greetService1 = message ->
	      System.out.println("Hello " + message);
			
	      //with parenthesis
	      GreetingService greetService2 = (message) ->
	      System.out.println("Hello " + message);
			
	      greetService1.sayMessage("Mahesh");
	      greetService2.sayMessage("Suresh");
	      
	      
	      //List<String> myNames = new ArrayList();
	      
	      List<String> myNames = Arrays.asList( "Haoxin", "Dongbin", "Helen");
	      
			
//	      myNames.add("Mahesh");
//	      myNames.add("Suresh");
//	      myNames.add("Ramesh");
//	      myNames.add("Naresh");
//	      myNames.add("Kalpesh");
			
	      myNames.forEach(System.out::println);
	      
	      
	      int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7,8} };
	      for (int i = 0; i < myNumbers.length; ++i) {
	    	  System.out.println("myNumbers.length=" + myNumbers.length);
	         for(int j = 0; j < myNumbers[i].length; ++j) {
	        	 System.out.println("myNumbers.length 2=" + myNumbers[i].length);
	            System.out.println(myNumbers[i][j]);
	         }
	         System.out.println("-----------------------");
	      }

	      System.out.println( myNumbers[1][3]);
	      
	   }
		
	   interface MathOperation {
	      int operation(int a, int b);
	   }
		
	   interface GreetingService {
	      void sayMessage(String message);
	   }
		
	   private int operate(int a, int b, MathOperation mathOperation) {
	      return mathOperation.operation(a, b);
	   }
	}