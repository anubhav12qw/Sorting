import java.util.Scanner;


public class NewSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, c, d, swap;
	    Scanner in = new Scanner(System.in);
	 
	    System.out.println("Input number of integers to sort");
	    n = in.nextInt();
	 
	    int array[] = new int[n];
	 
	    System.out.println("Enter " + n + " integers");
	 
	    for (c = 0; c < n; c++) 
	      array[c] = in.nextInt();
	    
	    for(int i=0;i<n;i++){
	    	for(int j=0;j<n;j++){
	    		if(array[i]<array[j]){
	    			int temp=array[i];
	    			array[i]=array[j];
	    			array[j]=temp;
	    		}
	    	}
	    }
	    System.out.println("Sorted list of numbers");
		 
	    for (c = 0; c < n; c++) 
	    	System.out.println(array[c]);
	}

}
