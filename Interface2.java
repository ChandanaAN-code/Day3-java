interface Animal
{
    void sound();
}
class Dog implements Animal{
    public void sound()
    {
         System.out.println("Barking..");
    }
}
public class Interface2 {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.sound();
    }
    
}
