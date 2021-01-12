import java.util.*;
import java.lang.*;
import java.io.*;

class subArray {
	
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
		public int tap(int[] arr,int n)
		{
			int sum=0;
			int[] left=new int[n];
			left[0]=arr[0];
			for(int i=1;i<n;i++)
			{
				left[i]=Math.max(left[i-1],arr[i]);
			}
			int[] rigth=new int[n];
			rigth[n-1]=arr[n-1];
			for(int i=n-2;i>=0;i--)
			{
				left[i]=Math.max(left[i-1],arr[i]);
			}
			for(int i=0;i<n;i++)
			{
				sum+=Math.min(left[i], rigth[i])-arr[i];
			}
			return sum;
		}
			
		}
   
