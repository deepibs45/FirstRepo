
import java.util.Scanner;

public class Addition
{
    public static void main(String args[])
    {
        int a,b,c,sum;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        a=sc.nextInt();
        System.out.println("enter second number");
        b=sc.nextInt();
        System.out.println("enter third number");
        c=sc.nextInt();
        sum=sum(a,b,c);
        System.out.println("the sum of three numbers is"+sum);
    }

    private static int sum(int a, int b, int c)
    {
        int sum=a+b+c;
        return sum;
    }
}
