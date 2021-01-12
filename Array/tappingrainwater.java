import java.util.*;
import java.lang.*;
import java.io.*;

class tappingrainwater {
	public static void main(String[] args) throws IOException
	{
	BufferedReader s=new BufferedReader(new InputStreamReader(System.in));
	Scanner sc=new Scanner(System.in);
	//int t=Integer.parseInt(s.readLine().trim());
	int t=sc.nextInt();
	while(t-->0)
	{
		//int n=Integer.parseInt(s.readLine().trim());
		int n=sc.nextInt();
		int[] arr=new int[n];
		//String in_put[]=s.readLine().trim().split(" ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			//Integer.parseInt(in_put[i]);
		}
		tappingrainwater test=new tappingrainwater();
		System.out.println(test.tap(arr,n));
	}
	}
	public int tap(int[] arr,int n)
	{
		int sum=0;
		for(int i=1;i<n;i++)
		{
			int left=arr[i];
			for(int j=0;j<i;j++)
			{
				left=Math.max(left, arr[j]);
			}
			int rigth=arr[i];
			for(int j=i;j<n;j++)
			{
				rigth=Math.max(rigth, arr[j]);
			}
			sum+=Math.min(left, rigth)-arr[i];
		}
		return sum;
	}
	
}