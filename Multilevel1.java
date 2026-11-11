 class Grandparent
 {
    void name()
    {
        System.out.println("This is Parent");
    }

 }
 class Parent extends Grandparent{
    Parent()
    {
        System.out.println("This is Child1");
    }
 }
class  Child extends Parent{
    Child()
    {
        System.out.println("This is Child 2");
    }
}
public class Multilevel1 {
    public static void main(String[] args) {
        Child ch=new Child();
         ch.name();
    }
}
