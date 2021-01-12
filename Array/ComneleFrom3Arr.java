
class Solution
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        ArrayList<Integer> list=new ArrayList<>();
         ArrayList<Integer> list1=new ArrayList<>();
       
        int i=0,j=0,k=0;
        while(i<n1 && j<n2 && k<n3)
        {
            if(A[i]==B[j] && B[j]==C[k])
            {
                if(!list.contains(A[i]))
                list.add(A[i]);
                i++; j++; k++;
            }
            else if(A[i]<B[j])
            {
                i++;
            }
            else if(B[j]<C[k])
            {
                j++;
            }
            else
            {
                k++;
            }
        }
       
        return list;
        
    }
}