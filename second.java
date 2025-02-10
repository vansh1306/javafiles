import java.util.*;
class second
{
void add(int x, int y)
{
System.out.println(x+y);
}
void mul(int x, int y)
{
System.out.println(x*y);
}
void div(int x, int y)
{
System.out.println(x/y);
}
void sub(int x, int y)
{
System.out.println(x-y);
}
void mod(int x, int y)
{
System.out.println(x%y);
}
public static void main(String[] args)
{
Scanner ab=new Scanner(System.in);
second obj=new second();
int a=ab.nextInt();
int b=ab.nextInt();
obj.add(a,b);
obj.mul(a,b);
obj.div(a,b);
obj.sub(a,b);
obj.mod(a,b);

}}