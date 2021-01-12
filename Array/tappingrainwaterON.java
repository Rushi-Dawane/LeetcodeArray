import java.util.*;
import java.lang.*;
import java.io.*;

class tappingrainwaterON{
	
	public static void main (String[] args) {
		BufferedReader s=new BufferedReader(new InputStreamReader(System.in));
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		while(t-->0)
		{
			
			int n=sc.nextInt();
			int[] arr=new int[n];
			
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
				
			}
			tappingrainwater test=new tappingrainwater();
			System.out.println(test.tap(arr,n));
		}
	}
	 public static int maxWater(int arr[], int n)
	    {
	        int size = n - 1;
	        int prev = arr[0];
	        int prev_index = 0;
	        int water = 0;
	 
	        
	        int temp = 0;
	        for (int i = 1; i <= size; i++) {
	 
	            
	            if (arr[i] >= prev) {
	                prev = arr[i];
	                prev_index = i;
	 
	                temp = 0;
	            }
	            else {
	 
	               
	                water += prev - arr[i];
	 
	                temp += prev - arr[i];
	            }
	        }
	 
	        // If the last wall was larger than or equal
	        // to the previous wall then prev_index would
	        // be equal to size of the array (last element)
	        // If we didn't find a wall greater than or equal
	        // to the previous wall from the left then
	        // prev_index must be less than the index
	        // of the last element
	        if (prev_index < size) {
	 
	            // Temp would've stored the water collected
	            // from previous largest wall till the end
	            // of array if no larger wall was found then
	            // it has excess water and remove that
	            // from 'water' var
	            water -= temp;
	 
	            // We start from the end of the array, so previous
	            // should be assigned to the last element
	            prev = arr[size];
	 
	            // Loop from the end of array up to the 'previous index'
	            // which would contain the "largest wall from the left"
	            for (int i = size; i >= prev_index; i--) {
	 
	                // Right end wall will be definitely smaller
	                // than the 'previous index' wall
	                if (arr[i] >= prev) {
	                    prev = arr[i];
	                }
	                else {
	                    water += prev - arr[i];
	                }
	            }
	        }
	 
	        // Return the maximum water
	        return water;
	    }
			
		}
   
