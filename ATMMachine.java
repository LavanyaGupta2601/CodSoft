import java.util.Scanner;

public class ATMMachine{
   private UserBankAccount account;
   private Scanner sc;


   public ATMMachine(UserBankAccount account){
       this.account=account;
       this.sc=new Scanner(System.in);
   }
    
   public void Continue(){
    while(true){
        Menu();
        int choice=sc.nextInt();
        ManageChoice(choice);
    }
   }

   public void Menu(){
    System.out.println("----WELCOME TO THE ATM MACHINE---");
    System.out.println("------------ATM MENU------------");
    System.out.println("1. Withdraw");
    System.out.println("2. Deposit");
    System.out.println("3. Check Balance");
    System.out.println("4. Exit");
    System.out.print("Choose an option(1-4): ");
   }


   private void ManageChoice(int choice) {
    switch (choice) {
        case 1:
            Withdraw();
            break;
        case 2:
            Deposit();
            break;
        case 3:
            CheckBalance();
            break;
        case 4:
            System.out.println("Thank you for choosing ATM!!");
            System.out.println(".....Exiting the system");
            System.exit(0);
            break;
        default:
            System.out.println("This is not a valid option");
            System.out.println("Please try again and enter a valid option..");
    }
}

    private void Withdraw(){
        System.out.println("Enter amount you want to Withdraw:");
        double amount=sc.nextDouble();
        account.withdraw(amount);
    }

    private void Deposit(){
        System.out.println("Enter amount you want to deposit:");
        double amount=sc.nextDouble();
        account.deposit(amount);
    }

    
    private void CheckBalance(){
        System.out.println("Current balance: " + account.getBalance());
    }

    
   public static void main(String[] args) {
       UserBankAccount account = new UserBankAccount(1000.0); 
       ATMMachine atm = new ATMMachine(account);
       atm.Continue();
   }

    
}
