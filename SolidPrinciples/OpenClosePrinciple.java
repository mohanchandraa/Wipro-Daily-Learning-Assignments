interface Bank{
    void bankType();
}
class Sbi implements Bank{
    public void bankType() {
        System.out.println("Sbi is implmented");
    }
}
class Bob implements Bank{
    public void bankType() {
        System.out.println("Baroda is implemented");
    }
}
class BankProcess{
    void bankProcess(Bank bank){
        bank.bankType();
    }
}
public class OpenClosePrinciple {
    public static void main(String[] args) {
        BankProcess bp = new BankProcess();
        bp.bankProcess(new Bob());
        bp.bankProcess(new Sbi());
    }
}
