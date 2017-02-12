package FizzBuzz;

public class FizzBuzz {
  
	public String[] fizzBuzz(int f, int b) {
    	String []arr = new String[50];
    	for (int a = 0; a < arr.length; a++) {
    		if (((a+1)%f==0)&&((a+1)%b==0))
    			arr[a] = "Fizz Buzz";
    		else if ((a+1)%f==0)
    			arr[a] = "Fizz";
    		else if ((a+1)%b==0) 
    			arr[a] = "Buzz";
    		else arr[a] = String.valueOf(a + 1);
    	}
    	return arr;
    }
	
    public String printFizzBuzz(String arr[]){
    	String str="";
    	for (int i=0; i<arr.length;i++)
    		str+=arr[i].toString()+ ", ";
    	return str;
    }

    
    public static void main(String[] args) {
        FizzBuzz fizz=new FizzBuzz();
        System.out.println(fizz.printFizzBuzz(fizz.fizzBuzz(3,5)));
    }
}
