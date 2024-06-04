import java.util.*;
public class evensumoddproduct
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n =sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the no in the array");
        for(int i=0;i<n;i++)
        {
        arr[i]=sc.nextInt();
        }
            int even=0;
            int odd=1;
            for(int j=0;j<n;j++)
            {
                if(j%2==0)
                {
                    even=even+j;

                }
                else
                {
                    odd =odd*j;
                }
            }
            System.out.println("the val of even sum is "+even);
            System.out.println("the val of odd product is "+odd);
            sc.close();
    }
}