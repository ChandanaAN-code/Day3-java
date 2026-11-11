class Rbi{
    void loan()
    {
        System.out.println("Loan From RBI");
    }
}
class Sbi extends Rbi
{
    Sbi()
    {
        System.out.println("Loan From SBI");
    }
}
class Hdfc extends Rbi
{  Hdfc()
    {
       System.out.println("Loan From HDFC");
    }
}
public class Hierarchical2 {
    public static void main(String[] args) {
        Sbi s=new Sbi();
        s.loan();
        Hdfc h=new Hdfc();
        h.loan();
    }
    
}
