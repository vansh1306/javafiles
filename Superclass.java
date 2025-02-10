class Superclass {     private int privateMember = 10;     public int getPrivateMember() {         return privateMember; 
} 
public void showPrivateMember() { 
    System.out.println("BaseClass: Private Member = " + privateMember); 
} 
} 
class DerivedClass extends Superclass {     public void accessPrivateMemberIndirectly() {         int indirectAccess = getPrivateMember(); 
    System.out.println("DerivedClass: Indirectly Accessed Private Member = " + indirectAccess); 
} 
} 
class Main {     public static void main(String[] args) { 
    DerivedClass derivedObj = new DerivedClass(); 
    // Direct access to privateMember from the derived class will result in a compilation error. 
    // int directAccess = derivedObj.privateMember; // This line will cause an error 
    derivedObj.showPrivateMember(); // Using a public method in the base class to access the private member 
    derivedObj.accessPrivateMemberIndirectly(); // Accessing the private member indirectly 
} 
} 
