package Java8Test.Test;

//Java program to demonstrate working of Comparator 
//interface 
import java.util.*; 
import java.lang.*; 
import java.io.*; 

//A class to represent a student. 
class Students { 
	//A class to represent a student. 
	class Student { 
		int rollno; 
		String name, address; 
	
		// Constructor 
		public Student(int rollno, String name, 
					String address) 
		{ 
			this.rollno = rollno; 
			this.name = name; 
			this.address = address; 
		} 
	
		// Used to print student details in main() 
		public String toString() 
		{ 
			return this.rollno + " "
				+ this.name + " "
				+ this.address; 
		} 
	}

	int rollno; 
	String name, address; 

	// Constructor 
	public Students(int rollno, String name, 
				String address) 
	{ 
		this.rollno = rollno; 
		this.name = name; 
		this.address = address; 
	} 

	// Used to print student details in main() 
	public String toString() 
	{ 
		return this.rollno + " "
			+ this.name + " "
			+ this.address; 
	} 
} 

class Sortbyroll implements Comparator<Students> { 

	// Used for sorting in ascending order of 
	// roll number 
	public int compare(Students a, Students b) 
	{ 
		return a.rollno - b.rollno; 
	} 
} 

//Driver class 
class SingleFieldSortObject { 
	public static void main(String[] args) 
	{ 
		Students[] arr = { new Students(111, "bbbb", "london"), 
						new Students(131, "aaaa", "nyc"), 
						new Students(121, "cccc", "jaipur") }; 

		System.out.println("Unsorted"); 
		for (int i = 0; i < arr.length; i++) 
			System.out.println(arr[i]); 

		Arrays.sort(arr, new Sortbyroll()); 

		System.out.println("\nSorted by rollno"); 
		for (int i = 0; i < arr.length; i++) 
			System.out.println(arr[i]); 
	} 
} 
