abstract class Animal
{
    abstract void sound();
    abstract void behaviour();
    void color()
    {
        System.out.println("White");
    }
}
class Dog extends Animal
{
    Dog()
    {
        System.out.println("Dog...");
    }
    void sound()
    {
        System.out.println("Braking...");
    }
    void behaviour()
    {
        System.out.println("Friendly...");
    }
    void color()
    {
        System.out.println("Black");
        super.color();
    }
}
public class Abstraction3 {

    public static void main(String [] args)
    {
        Dog d=new Dog();
        d.sound();
        d.behaviour();
        d.color();
    }
    
}
