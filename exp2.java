import java.util.*;
public class exp2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int choice;
            while(1>0)
            {
            System.out.println("1.Largest of three numbers\n2.Fibonacci Series\n3.Three digits and their combinations\n4.Taking month as an integer and printing months name\n5.program to find the sum of all integers greater than x less than y divisible by z.\n");    
            choice=sc.nextInt();
            switch(choice)
            {
       case 1:
       System.out.println("Enter three numbers: ");
       int a,b,c;
       a=sc.nextInt();
       b=sc.nextInt();
       c=sc.nextInt();
       if(a>b&&a>c){
        System.out.println("Largest number is "+a);
       }
       if(b>a&&b>c){
        System.out.println("Largest number is "+b);
       }
       if(c>a&&c>b){
        System.out.println("Largest number is "+c);
       }
       break;
       case 2:
       System.out.println("Enter number of terms: ");
       int n,f=0,s=1,t=0;
       n=sc.nextInt();
       System.out.println(f+" "+s+" ");
       while(n!=2){
        t=f+s;
        System.out.println(t+" ");
        f=s;
        s=t;
        n --;
       }
       break;
       case 3:
       System.out.println("Enter three numbers: ");
       int a1,a2,a3;
       a1=sc.nextInt();
       a2=sc.nextInt();
       a3=sc.nextInt();
       int[] arr={a1,a2,a3};
       for(int i=0;i<=2;i++){
        for(int j=0;j<=2;j++){
            for(int k=0;k<=2;k++){
                if(i!=j&&j!=k&&k!=i){
                    System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                }
            }
        }
       }
       break;
       case 4:
       int m;
       System.out.println("Enter which month you want: ");
       m=sc.nextInt();
       switch(m){
        case 1:
        System.out.println("Its January");
        break;
        case 2:
        System.out.println("Its February");
        break;
        case 3:
        System.out.println("Its March");
        break;
        case 4:
        System.out.println("Its April");
        break;
        case 5:
        System.out.println("Its May");
        break;
        case 6:
        System.out.println("Its June");
        break;
        case 7:
        System.out.println("Its July");
        break;
        case 8:
        System.out.println("Its August");
        break;
        case 9:
        System.out.println("Its September");
        break;
        case 10:
        System.out.println("Its October");
        break;
        case 11:
        System.out.println("Its November");
        break;
        case 12:
        System.out.println("Its month end December");
        break;
        default:
        System.exit(0); 
       }
       break;
       case 5:
       int n1,n2,n3,sum=0;
       System.out.println("Enter three numbers");
       n1=sc.nextInt();
       n2=sc.nextInt();
       n3=sc.nextInt();
       for(int i=n1;i<=n2;i++){
        if(i%n3==0){
            sum=sum+i;
        }
       }
       System.out.println("Sum="+sum);
       break;
       default:
       System.out.println("Exit");
       System.exit(0);
            }
            }
    }
}