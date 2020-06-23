package Java8Test.Test;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class ConvertArray2Set {
	// Generic function to convert array to set 
    public static <T> Set<T> convertArrayToSet(T array[]) 
    { 
        // create a set from the Array 
        return Arrays 
            .stream(array) 
            .collect(Collectors.toSet()); 
    } 
  
    public static void main(String args[]) 
    { 
        // Create an Array 
        String array[] = { "Geeks", "forGeeks",  "Geeks",
                                    "A computer Portal" }; 
  
        // Print the Array 
        System.out.println("Array: " + Arrays.toString(array)); 
  
        // convert the Array to Set 
        Set<String> 
            set = convertArrayToSet(array); 
  
        // Print the Set 
        System.out.println("Set: " + set); 
    } 

}
