import java.util.*;
public class matrix {

	public void rev(int[][] arr,int n,int m)
	{
		for(int i=n-1;i>=0;i--)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		matrix test=new matrix();
		
		int [][] arr={ { 1, 2, 3, 4, 5, 6 }, 
                       { 7, 8, 9, 10, 11, 12 }, 
                      { 13, 14, 15, 16, 17, 18 } }; 
       test.rev(arr,3,6);
	}

}
