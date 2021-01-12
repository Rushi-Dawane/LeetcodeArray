/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		System.out.println("GfG!");
		ArrayList<Integer> list=new ArrayList<>();
		ArrayList<Integer> alist=new ArrayList<>();
		
		int[][] arr={{1,2,3,},{4,2,6},{7,2,9}};
		for(int i=0;i<arr[0].length;i++)
		{
		    list.add(arr[0][i]);
		}
		
		for(int i=1;i<3;i++)
		{
		    for(int j=0;j<3;j++)
		    {
		        if(list.contains(arr[i][j]))
		        {
		            if(!alist.contains(arr[i][j]))
		            {
		            alist.add(arr[i][j]);
		            }
		        }
		    }
		}
		System.out.print(alist);
	}
}