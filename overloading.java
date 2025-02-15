import java.util.Arrays;
import java.util.Scanner;
// public class overloading
// {
//     public static void main(String[] args) 
//     {
//         greet();
//         greet(1);
//         greet(1,2);
//     }
//    static void greet()
//     {
//         System.out.println("Hello");
//     }
//    static void greet(int a)
//     {
//         System.out.println("Hello user");
//     }
//    static void greet(int a,int b)
//     {
//         System.out.println("Hello User Welcome Back!!");
//     }
// }

public class overloading {
    public static void main(String[] args) {
        sum();
        sum(1, 5, 6, 87, 9, 4);
        sum("Hello", "Everyone");
    }

    static void sum() {
        System.out.println(5 + 6);
    }

    static void sum(int... a) {
        System.out.println(Arrays.toString(a));
    }

    static void sum(String... a) {
        System.out.println(Arrays.toString(a));
    }
}