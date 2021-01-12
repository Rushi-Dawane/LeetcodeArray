class medianRowWiseSoerted {
    int median(int matrix[][], int r, int c) {
       int[] arr=new int[r*c];
       int k=0;
       for(int i=0;i<r;i++)
       {
           for(int j=0;j<c;j++)
           {
               arr[k++]=matrix[i][j];
           }
       }
       Arrays.sort(arr);
       return arr[arr.length/2];
    }
    public static void main(String[] args) {
    	medianRowWiseSoerted test=new medianRowWiseSoerted();
		Scanner sc=new Scanner (System.in);
		int [][] arr={ { 1, 2, 3, 4, 5, 6 }, 
                       { 7, 8, 9, 10, 11, 12 }, 
                      { 13, 14, 15, 16, 17, 18 } }; 
		test.median(arr,3,6);
	}
}