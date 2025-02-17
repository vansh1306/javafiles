import java.util.ArrayList;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<>(5);
//        arr.add(1);
//        arr.add(1);
//        arr.add(1);
//        arr.add(1);
//        arr.add(1);
//        arr.add(1);
//        arr.add(1);
//        arr.add(1);
//        arr.add(1);
//        System.out.println(arr);
        for(int i=0;i<n;i++)
        {
            arr.add(sc.nextInt());
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr.get(i)+"\t");
        }
    }
}
