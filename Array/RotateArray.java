import java.util.*;
import java.lang.*;
import java.io.*;

class RotateArray {
	public static void main (String[] args) {
	     Scanner s=new Scanner(System.in);
		 int t=s.nextInt();
		 StringBuilder res=new StringBuilder();
		 
		 for(int i=0;i<t;i++)
		 {
		     int n=s.nextInt();
		     int d=s.nextInt();
		     int r[]=new int[n];
		     int m[]=new int[n];
		     for(int j=0;j<n;j++)
		     {
		         r[j]=s.nextInt();
		         if(j>=d)
		         m[j-d]=r[j];
		         else{
		             m[n-d+j]=r[j];
		         }
		     }
		      for(int j=0;j<n;j++)
		      {
		          res.append(m[j]+" ");
		      }
		         res.append('\n');
		 }
		   System.out.println(res);
		   }
		   
		
	
} 