class BankAccount {
    private int accountNumber;
    private String accountHoldername;
    private double balance;

    public void set_accountNumber(int accountNumber) {
        this.accountNumber = accountNumber;

    }

    public void set_accountHoldername(String accountHoldername) {
        this.accountHoldername = accountHoldername;

    }

    public void set_balance(double balance) {
        if (balance < 0) {
            System.out.println("Invalid Amount So Balance Not Changed");
            System.out.println();
        } else
            this.balance = balance;

    }

    public int get_accountNumber() {
        return accountNumber;

    }

    public String get_accountHoldername() {
        return accountHoldername;

    }

    public double get_balance() {
        return balance;

    }

}

public class Encapsulation {
    public static void main(String args[]) {
        BankAccount ac0 = new BankAccount();
        BankAccount ac1 = new BankAccount();
        BankAccount ac2 = new BankAccount();
        BankAccount ac3 = new BankAccount();

        // ac0.balance=609; It is private field,so direct access not possible

        ac1.set_accountHoldername("Leon");
        ac1.set_accountNumber(12408767);
        ac1.set_balance(500.00);

        ac2.set_accountHoldername("Prottoy");
        ac2.set_accountNumber(92408767);
        ac2.set_balance(-300.00);

        ac3.set_accountHoldername("Akash");
        ac3.set_accountNumber(53408767);
        ac3.set_balance(800.00);

        System.out.println("Name :" + ac1.get_accountHoldername() + "  Account_Number: " + ac1.get_accountNumber()
                + "  Balance :" + ac1.get_balance());
        System.out.println("Name :" + ac2.get_accountHoldername() + "  Account_Number: " + ac2.get_accountNumber()
                + "  Balance :" + ac2.get_balance());
        System.out.println("Name :" + ac3.get_accountHoldername() + "  Account_Number: " + ac3.get_accountNumber()
                + "  Balance :" + ac3.get_balance());

    }
}
