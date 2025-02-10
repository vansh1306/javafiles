interface A{ void meth1(); void meth2();
}


public class exp5_2 implements A {
 
public void meth1(){ System.out.println("I am method 1");
}
public void meth2(){ System.out.println("I am method 2");
}


public static void main(String args[]){ exp5_2 a= new exp5_2(); a.meth1();
a.meth2();
}
}
