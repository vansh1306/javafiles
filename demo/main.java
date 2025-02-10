//its the main containing java file
package pack2;
import pack1.*;
import pack1.subpack.*;
public class main
{
	public static void main(String ar[])
	{
	//creating objects
	add a=new add();
	mul m=new mul();
	sub s=new sub();
	System.out.println("Sum= "+a.addit());
	System.out.println("Multiply= "+m.multi());
	System.out.println("Subtract= "+s.subt());
	
	}
}
