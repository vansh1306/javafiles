import java.util.Collection.*;
import java.util.*;
public class es
{
    public static void main(String[] args) 
    {
        System.out.println("Its a simple calc");
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of a: ");
        a=sc.nextInt();
        System.out.println("Enter value of b: ");
        b=sc.nextInt();
        char c;
        System.out.print("Now choose the operation you want to perform: ");
        c=sc.next().trim().charAt(0);
        switch(c)
        {
            case '+':
            System.out.println(a+b);
            break;
            case '-':
            System.out.println(a-b);
            break;
            case '*':
            System.out.println(a*b);
            break;
            case '/':
            System.out.println(a/b);
            break;
            default:
            System.out.println("Invalid operator");
        }


    }
}