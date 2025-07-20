package JavaPracticeQuestions;

public class BankAccount {
    public static void main(String[] args) {
        BankAccountt b1=new BankAccountt(123344,"sakhi",0);
        b1.deposit(5000);
        b1.withdraw(15000);
        b1.displayBalance();
    }
}
class BankAccountt{
    long accountNumber;
    String holderName;
    double balance;

    public BankAccountt(long accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }
    void deposit(double amount){
        balance+=amount;
    }
    void withdraw(double amount){
        if(amount<balance){
            balance-=amount;
        }
        else {
            System.out.println("Insuffient balance\n");
        }
    }
    void displayBalance(){
        System.out.println("Account holder Name: "+holderName+" "+"Remaining balance " +balance);

    }
}