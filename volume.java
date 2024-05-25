import java.util.*;
public class volume
{
    public double volumer (double r)
    {
        double volume=(4.0/3.0)* Math.PI* Math.pow(r,3);
        return volume;
    }
    public double volumer(double h,double r)
    {
        double volume=Math.PI* Math.pow(r,2) * h;
        return volume;
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in) ;
        System.out.println("enter the radius of sphere in double ");
        int temp=sc.nextInt();
        volume calculator=new volume();
        double sphereRadius = temp;
        double sphereVolume = calculator.volumer(sphereRadius);
        System.out.println("Volume of sphere with radius " + sphereRadius + " = " + sphereVolume);
    
        // Calculate and print cuboid volume
        Scanner r=new Scanner(System.in);
        System.out.println("enter the height in double");
        int j=r.nextInt();
        System.out.println("enter the radius in double");
        int k=r.nextInt();
        double cuboidHeight = j;
        double cuboidRadius = k;
        double cuboidVolume = calculator.volumer(cuboidHeight, cuboidRadius);
        System.out.println("Volume of cuboid with height " + cuboidHeight + " and radius " + cuboidRadius + " = " + cuboidVolume);
        sc.close();
        r.close();
    }
    }
