interface Rbi
{
    void amount();
}
class SBI implements Rbi
{
    public void amount()
    {
        System.out.println("Amount is Nill");

    }
}
public class Interface1 {
    public static void main(String[] args) {
        SBI s=new SBI();
        s.amount();
    }
    
}
