import java.util.*;
public class show {

 
    public static void main(String[]args)
    {
        int [][] a=new int[3][3];
        int [][] b=new int[3][3];
        int [][] c=new int[3][3];
        Scanner r =new Scanner(System.in);
        System.out.println("enter the value for first matrix");
        for( int i=0;i<3;i++)
        {
            for( int j=0;j<3;j++)
            {
                a[i][j]= r.nextInt();
            }
        }
        System.out.println("enter the value for second matrix ");
        for( int i=0;i<3;i++)
        {
            for( int j=0;j<3;j++)
            {
             
               b[i][j]=r.nextInt();

            }
        }
        System.out.println("the elements in matrix a are :");
        for( int i=0;i<3;i++)
        {
            for( int j=0;j<3;j++)
            {
                System.out.println(a[i][j]+" ");
            }
        }
         System.out.println("the elements in matrix b are :");
        for( int i=0;i<3;i++)
        {
            for( int j=0;j<3;j++)
            {
                System.out.println(b[i][j]+" ");
            }
        }
        for( int i=0;i<3;i++)
        {
            for( int j=0;j<3;j++)
            {
                if(a[i][j]==b[i][j])
                {
                    System.out.println("the matrix is equal");
                    break;
                }
                else
                {
                System.out.println("the matrix is not equal");
                break;
                }

            }
        }

    }
    
}
