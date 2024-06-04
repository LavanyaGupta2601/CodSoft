public class UserBankAccount {
    private double balance;

    public UserBankAccount(double InitialBalance){
        this.balance= InitialBalance;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Successfully Deposited:"+ amount);
        }
        else{
            System.out.println("The amount should be more than zero.");
        }
    }

    public void withdraw(double amount){
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew: " + amount);
        }
        else if (amount > balance) {
            System.out.println("Your account does not contain enough amount to withdraw");
        } 
        else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
}
