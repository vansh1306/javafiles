interface B {
void division(int a, int b);


void modulus(int a, int b);
}


class bb implements B {
public void division(int a, int b) { System.out.println("division:" + a / b);
}


public void modulus(int a, int b) { System.out.println("modulus:" + a % b);
}
}
 
class b3 implements B {
public void division(int a, int b) { System.out.println("over. divi:" + ((a / b) + 1));
}


public void modulus(int a, int b) { System.out.println("over.modulus" + ((a % b) + 2));
}
}


public class exp5_4 {
public static void main(String args[]) { bb a = new bb();
a.division(4, 2);
a.modulus(6, 2); b3 b = new b3(); b.division(4, 2);
b.modulus(6, 2);


}}
