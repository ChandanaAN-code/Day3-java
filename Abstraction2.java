abstract class Bank
{
    abstract  void money();
    void balance()
    {

        System.out.println("Balance is :20000");
    }
}
class Sbi extends Bank{
    void money()
    {
        System.out.println("Money deposited 10000");
    }
}
public class Abstraction2 {
    public static void main(String[] args) {
        Sbi s=new Sbi();
        s.money();
        s.balance();
    }
    
}
