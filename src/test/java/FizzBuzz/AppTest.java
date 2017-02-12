package FizzBuzz;
import org.testng.annotations.*;
import static org.testng.Assert.*;

import org.testng.Converter;

public class AppTest {
	
    @Test public void checkFizzBuzz() {
        FizzBuzz classUnderTest = new FizzBuzz();
        String[] arr = classUnderTest.fizzBuzz(5, 7);
        assertEquals(arr[4],"Fizz", "Fizz is displayed instead of value / 5");
        assertEquals(arr[6],"Buzz", "Fizz is displayed instead of value / 7");
        assertEquals(arr[34],"Fizz Buzz", "Fizz is displayed instead of value / 7 and 5");
        assertEquals(arr[5],"6", "Neither Fizz nor Buzz");
        }
    
    @Test public void printFizzBuzzarr() {
        FizzBuzz classUnderTest = new FizzBuzz();
        assertEquals(classUnderTest.printFizzBuzz(new String [] {"This"," is ", "test"}), "This is test",
        		"Array converting to string");        
        }    
}
