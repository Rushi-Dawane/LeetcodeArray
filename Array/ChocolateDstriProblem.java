
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public int helper(int[] arr,int x)
    {
        Arrays.sort(arr);
       int result1=Integer.MAX_VALUE;
       if(x==arr.length)
       {
           return arr[x-1]-arr[0];
       }
        for(int i=0;i+x-1<arr.length;i++)
        {
           if(arr[i+x-1]-arr[i]<result1)
           result1=arr[i+x-1]-arr[i];
         
        }
        return result1;
    }
	public static void main (String[] args) {
		//code
		GFG test=new GFG();
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
		    int x=sc.nextInt();
		    int result=test.helper(arr,x);
		    System.out.println(result);
		}
	}
}