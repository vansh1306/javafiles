import java.util.Scanner;
public class calc {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a=s.nextInt();
        System.out.println("Enter the value of b: ");
        int b=s.nextInt();
        System.out.println("Now enter the operation you want: ");
        char choice=s.next().charAt(0);
        if(choice=='+')
        System.out.println(a+b);
        else if(choice=='-')
        System.out.println(a-b);
        else if(choice=='*')
        System.out.println(a*b);
        else if(choice=='/')
        System.out.println(a/b);
        else
        System.out.println("Please enter any valid operations like + - * /");

    }
}
