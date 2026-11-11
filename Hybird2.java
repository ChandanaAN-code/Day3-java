class Rbi{
    void loan()
    {
    System.out.println("Loan from Rbi");
    }
}
class Sbi extends Rbi{
    Sbi()
    {
        System.out.println("Loan from SBi");

    }
}
class Hdfc extends Sbi{
    Hdfc()
    {
        System.out.println("Loan From Hdfc");
    }
}
class User extends Sbi{
    User()
    {
        System.out.println("Laon for User");
    }

}
public class Hybird2 {
    public static void main(String[] args) {
        Hdfc h=new Hdfc();
        h.loan();
        User u=new  User();
        u.loan();
    }
    
}

