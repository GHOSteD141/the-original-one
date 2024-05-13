import java.util.*;
public class matrixmultiplication
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a[][] =new int[3][3];
        int b[][] =new int[3][3];
        int c[][] =new int[3][3];
        System.out.println("provide value for matrix a ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                a[i][j]=sc.nextInt();
            }
                }
                System.out.println("enter val for matrix b");
                for(int i=0;i<3;i++)
                {
                     for(int j=0;j<3;j++)
            {
                b[i][j]=sc.nextInt();
            }
                }
                System.out.println("the product is :");
                 for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {

                c[i][j]=a[i][j]*b[i][j];
                System.out.println(c[i][j]);
                }
    }
    sc.close();
}

}
