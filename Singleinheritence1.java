class Rbi
{
    void loan()
    {
          System.out.println("Reserve Bank of India..");
    }
}
class Sbi extends Rbi
{
    Sbi()
    {
        System.out.println("State Bank of India...");
    }
}
public class Singleinheritence1 {
    public static void main(String[] args) {
        Sbi s=new Sbi();
        s.loan();
    }
    
}
