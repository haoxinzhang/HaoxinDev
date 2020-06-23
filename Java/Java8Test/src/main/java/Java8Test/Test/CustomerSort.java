package Java8Test.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

class Customer implements Comparable<Customer> {
	
	
	private Integer id;
	
	Customer( Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", getId()=" + getId() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	public int compareTo( Customer e) {
		return id.compareTo( e.getId());
	}
	
}

class Student extends Customer {
	
	private String type;
	private String major;
	
	Student(Integer id, String type, String major) {
		super(id);
		this.type = type;
		this.major = major;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return "Student [type=" + type + ", major=" + major + ", id=" + getId() + "]";
	}
	
	
}

public class CustomerSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> eList = new ArrayList<Student>();
				
		Random random = new Random();
		for( int i=0; i<10; i++ ) {
			int iNum = random.nextInt(10);
			System.out.println( iNum);
		}
		
		for( int i=0; i<10; i++ ) {
						
			int iNum = random.nextInt(100);
			Student e = new Student(iNum, "engineer", "Civic");
			eList.add(e);
		}
		
		System.out.println( eList.toString());
		
		Collections.sort(eList);
		
		eList.stream().forEach( System.out::println);
		
		Collections.sort(eList, Collections.reverseOrder());
		
		System.out.println( "***********************");
		
		eList.stream().forEach( System.out::println);
		
		Random rand = new Random(); 
		  
        // Generate random integers in range 0 to 999 
        int rand_int1 = rand.nextInt(1000); 
        int rand_int2 = rand.nextInt(1000); 
  
        // Print random integers 
        System.out.println("Random Integers: "+rand_int1); 
        System.out.println("Random Integers: "+rand_int2); 
  
        // Generate Random doubles 
        double rand_dub1 = rand.nextDouble(); 
        double rand_dub2 = rand.nextDouble(); 
  
        // Print random doubles 
        System.out.println("Random Doubles: "+rand_dub1); 
        System.out.println("Random Doubles: "+rand_dub2); 
        
        
        

	}

}
