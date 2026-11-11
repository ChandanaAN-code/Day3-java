 class Rbi
 {
    void loan()
    {
        System.out.println("Loan From RBi");
    }

 }
 class  Sbi extends Rbi
 {
    Sbi()
    {
        System.out.println("Loan From SBI");
    }
 }
class Hdfc extends Sbi{
    Hdfc()
    {
        System.out.println("Loan From Hdfc");
    }
}
public class Multilevel2{
    public static void main(String[] args) {
      Hdfc h=new Hdfc();
         h.loan();
    }
}

