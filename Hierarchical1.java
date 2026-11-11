class Parent{
    void name()
    {
        System.out.println("This is parent..");

    }
}
class Child1 extends Parent{
    Child1()
    {
        System.out.println("This is Child1..");
    }
}
class Child2 extends Parent{
    Child2()
    {
        System.out.println("This is child2..");
    }

}
public class Hierarchical1 {
    public static void main(String[] args) {
        Child1 ch1=new Child1();
        ch1.name();
        Child2 ch2=new Child2();
        ch2.name();
    }
    
}
