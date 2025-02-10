import java.util.*;
class exp
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.println("Enter a number");
        a=sc.nextInt();
        int b=0;
        for(int i=1;i<=a;i++)
        {
            b=b+i;
        }
        System.out.println(b);
}
}