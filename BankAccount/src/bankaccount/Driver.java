package bankaccount;

/**
 * Driver class for package bankaccount.
 * Assignment 2
 * Date : 2017-03-07
 * @author: Jasen Ratnam
 * @author cstuser
 */
public class Driver 
{
    /**
     * Main method to drive package.
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       //Create a customer objects for Mary.
       Customer mary = new Customer("Mary", "123456789", "mary@herhotmail.com");
       System.out.println(mary + "\n");
       
       //Create a customer objects for Mark.
       Customer mark = new Customer("Mark", "987654321", "mark@hishotmail.com");
       System.out.println(mark + "\n");
       
       //Create a savings account for Mary with initial balance of $100 and interest of 0.5%.
       //Print account.
       SavingsAccount herSavings = new SavingsAccount(mary, 100.0, 0.5);
       System.out.println("Her initial account profile:\n" + herSavings);
       System.out.println();
       
       //Create a checking account for Mark with initial balance of $150 and interest of 0.75%.
       //Print account.
       CheckingAccount hisChecking = new CheckingAccount(mark, 150, 0.75);
       System.out.println("His initial account profile:\n" + hisChecking);
       System.out.println();
       
       //Get a String with 'Mark'saved.
       //Deposit $10.00 to Mark's account
       //Print account.
       String hisName = hisChecking.getCustomer().getName();
       double depositAmt = 10.0;
       hisChecking.deposit(depositAmt);
       System.out.println("Deposited $" + depositAmt + " to " + hisName + "'s account.");
       System.out.println(hisName + "'s balance : " + hisChecking.getBalance());
       System.out.println();
       
       //Get a String with 'Mary' saved.
       //Deposit $10000.00 to Mary's account
       //Print account.
       String herName = herSavings.getCustomer().getName();
       depositAmt = 10000.0;
       herSavings.deposit(depositAmt);
       System.out.println("Depsited $" + depositAmt + " to " + herName + "'s account.");
       System.out.println(herName + "'s balance : " + herSavings.getBalance());
       System.out.println();
       
       //Transfer $90.00 from Mary's account to Mark's account.
       //Print both accounts.
       double transferamt = 90.0;
       herSavings.transferTo(transferamt, hisChecking);
       System.out.println("Transfered $" + transferamt + " from " + herName + " to " + hisName);
       System.out.println(hisName + "'s balance : " + hisChecking.getBalance());
       System.out.println(herName + "'s balance : " + herSavings.getBalance());
       System.out.println();
       
       //Withdraw $20 from Mark's account 5 seperate times.
       //Print account.
       double withdrawAmt = 20;
       hisChecking.withdraw(withdrawAmt);
       hisChecking.withdraw(withdrawAmt);
       hisChecking.withdraw(withdrawAmt);
       hisChecking.withdraw(withdrawAmt);
       hisChecking.withdraw(withdrawAmt);
       System.out.println("Withdrew 5 times $" + withdrawAmt + " from " + hisName + "'s account");
       System.out.println(hisName + "'s balance : " + hisChecking.getBalance());
       System.out.println();
       
       //Apply monthly charge fees to Mark's account.
       //Print account.
       System.out.println("About to apply monthly charge fees to " + hisName + "'s account");
       System.out.println("Number of transcations: " + hisChecking.getCount());
       hisChecking.perfomMonthEndProcessing();
       System.out.println(hisName + "'s balance : " + hisChecking.getBalance());
       System.out.println();
       
       //Apply monthly charge fees to Mark's account.
       //Print account.
       System.out.println("About to apply monthly charge fees to " + hisName + "'s account");
       System.out.println("Number of transcations: " + hisChecking.getCount());
       hisChecking.perfomMonthEndProcessing();
       System.out.println(hisName + "'s balance : " + hisChecking.getBalance());
       System.out.println();
       
       //Withdraw $20 from Mark's account.
       //Print account.
       System.out.println("About to wihdraw $" + withdrawAmt + " from " + hisName);
       hisChecking.withdraw(withdrawAmt);
       System.out.println(hisName + "'s balance : " + hisChecking.getBalance());
       System.out.println("His current account profile\n" + hisChecking);
       System.out.println();
       
       //Transfer $10.00 from Mark's account to Mary's account.
       //Print only balances of both accounts.
       transferamt = 10.0;
       System.out.println("About to transfer $" + transferamt + " from " + hisName + " to " + herName);
       herSavings.transferFrom(transferamt, hisChecking);
       System.out.println(hisName + "'s balance : " + hisChecking.getBalance());
       System.out.println(herName + "'s balance : " + herSavings.getBalance());
       System.out.println();
       
       //Transfer $1000.00 from Mary's account to Mark's account.
       //Print only balances of both accounts.
       transferamt = 1000.0;
       herSavings.transferTo(transferamt, hisChecking);
       System.out.println("Transfered $" + transferamt + " from " + herName + " to " + hisName);
       System.out.println(hisName + "'s balance : " + hisChecking.getBalance());
       System.out.println(herName + "'s balance : " + herSavings.getBalance());
       System.out.println();
       
       //Make a polymorphic call.
       //Base refernece = a subclass object.
       //Apply charges to Mary's account.
       Account herBankAccount = herSavings;
       herBankAccount.perfomMonthEndProcessing();
       System.out.println("Polymorphic month end proccesing on " + herName + "'s account");
       System.out.println(herName + "'s balance : " + herSavings.getBalance());
       System.out.println();
       
       //Make a polymorphic call.
       //Base refernece = a subclass object.
       //Apply charges to Mark's account.
       Account hisBankAccount = hisChecking;
       hisBankAccount.perfomMonthEndProcessing();
       System.out.println("Polymorphic month end proccesing on " + hisName + "'s account");
       System.out.println(hisName + "'s balance : " + hisChecking.getBalance());
       System.out.println();
       
       //Print the final two accounts.
       System.out.println("Her final acount profile\n" + herSavings);
       System.out.println();
       System.out.println("His final acount profile\n" + hisChecking);
       System.out.println();

       
       
    }
}
