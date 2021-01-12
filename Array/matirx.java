import java.util.*;
public class matirx {
	public void operation(int[][] arr,int m,int n)
	{
		int k=0,l=0;
		while(k<m && l<n)
		{
				for(int i=l;i<n;i++)
				{
					
					System.out.print(arr[k][i]+" ");
				}
				k++;
				for(int j=k;j<m-1;j++)
				{
					System.out.print(arr[j][n-1]+" ");
				}
				
				for(int i=n-1;i>=l;i--)
				{
					System.out.print(arr[m-1][i]+" ");
				}
				
				for(int j=m-1;j>0;j--)
				{
					System.out.print(arr[j][l]+" ");
				}
				l++;
				n--;m--;
		}
	}

	public static void main(String[] args) {
		matirx test=new matirx();
		Scanner sc=new Scanner (System.in);
		int [][] arr={ { 1, 2, 3, 4, 5, 6 }, 
                       { 7, 8, 9, 10, 11, 12 }, 
                      { 13, 14, 15, 16, 17, 18 } }; 
		test.operation(arr,3,6);
	}

}
