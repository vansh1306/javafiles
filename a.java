import java.util.*;
// class shape
// {
//     void draw()
//     {
//         System.out.println("Its default");
//     }
// }
// class square extends shape{
//     @Override
//     void draw()
//     {
//         super.draw();
//         System.out.println("Its a B");
//     }
// }
// class circle extends shape{
//     @Override
//     void draw()
//     {
//         System.out.println("Its a circle");
//     }
// }
// class a{
//     public static void main(String[] args) {
//       shape obj=new shape();
//       obj.draw();  
//     }
// }
// interface client
// {
//     void input();
//     void output();
// }
// class a implements client{
//     String name; int salary;
//     public void input()
//     {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter your name: ");
//         name=sc.nextLine();
//         System.out.println("Enter you salary");
//         salary=sc.nextInt();
//     }
//     public void output()
//     {
//         System.out.println(name+" "+salary);
//     }
//     public static void main(String[] args) {
//         client obj=new a();
//         a.input();
//         a.output();
//      }
   
// }

class baingan extends Exception
{
    baingan()
    {
        System.out.println("Aayein");
    }
}
class a
{
    public static void main(String[] args)
{
    try{
        age(20);
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
}
    public static void age(int age) throws baingan
    {
        if (age<18)
        {
            throw new baingan();
        }
        else{
            System.out.println("Rushil is racist");
        }
    }
}