import java.sql.SQLOutput;
import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
//        int n=sc.nextInt();
//        int[] arr=new int[n];
//        for(int i=0;i<n;i++)
//        {
//            arr[i]=sc.nextInt();
//        }
//        for(int e: arr)
//        {
//            System.out.println(e);
//        }
        int[][]arr= new int[2][];
        arr[0][0]=5;
        arr[0][1]=7;
        arr[0][2]=3;
        arr[1][0]=8;
        arr[1][1]=1;
        arr[1][2]=6;
        System.out.println(arr[0][2]);
    }
}
