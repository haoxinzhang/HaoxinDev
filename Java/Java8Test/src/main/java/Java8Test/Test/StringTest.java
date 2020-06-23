package Java8Test.Test;

import java.io.Console;
import java.io.PrintWriter;

public class StringTest {

	public static void main(String[] args) {
		String input = "Geeks For Geeks";
		char[] temparray = input.toCharArray();
		int left, right = 0;
		right = temparray.length - 1;

		for (char c : temparray)
			System.out.print(c);
		System.out.println();

		for (left = 0; left < right; left++, right--) {
			// Swap values of left and right
			char temp = temparray[left];
			temparray[left] = temparray[right];
			temparray[right] = temp;
		}

		for (char c : temparray)
			System.out.print(c);
		System.out.println();
		System.out.println("left=" + left);
		System.out.println("left++=" + left++);

//		Console cnsl = System.console();
//
//		if (cnsl == null) {
//			System.out.println("No console available");
//			return;
//		}
//
//		// Create PrintWriter
//		PrintWriter pw = cnsl.writer();
//
//		System.out.println("PrintWriter is created and returned");

	}

}
