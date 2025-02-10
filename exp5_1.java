interface test {
    public void square();
    }
    
    
    class arithmetic implements test { public void square()
    {
    System.out.println("method inside arithmetic class that implements method of interface");
    }
    }
    
    
    public class exp5_1{
    public static void main(String [] args){ test a=new arithmetic();
    a.square();
    }}