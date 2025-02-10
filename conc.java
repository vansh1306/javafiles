import java.util.*;
class conc
{
public static void main(String[] args)
{
int i;
String a="";
Scanner ab=new Scanner(System.in);
for(i=0;i<5;i++)
{
String adress=ab.next();
a=a+adress;
}
System.out.println("String is"+a);
}
}