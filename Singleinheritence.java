class Parent
{
    void name()
    {
        System.out.println("This is Parent..");
    }
}
class Child extends Parent
{
    Child()
    {
        System.out.println("This is child..");
    }
}
public class Singleinheritence {
    public static void main(String[] args) {
        Child ch=new Child();
        ch.name();
    }
    
}
