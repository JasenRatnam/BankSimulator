package bankaccount;

/**
 * Apply polymorphism in program design.
 * Reuse code, creating new classes from existing ones.
 * Make a bank account with a savings and checking account.
 * And a stand alone customer class.
 * Account is an abstract class.
 * Account knows about Customer class.
 * Account always stores a reference to a Customer instance.
 * Assignment 2
 * Date : 2017-02-27
 * @author: Jasen Ratnam
 */
abstract public class Account 
{
    /**
     * Instance field that stores the account number.
     */
    private int accountNumber;

    /**
     * Instance field that stores the balance of the account.
     */
    private double balance;

    /**
     * Instance field that stores the customers information.
     */
    private Customer customer;

    /**
     * Class field that stores the next unique 4-digit account number, starting at 1001.
     */
    private static int nextAccountNumber = 1001;
    
    /**
     * Constructor that initializes customer to become a reference to a clone copy of cust.
     * Use method setBalance() to initialize balance to bal.
     * Set account number to the next unused integer.
     * @param cust Reference to the customers information.
     * @param bal  The given balance of the account.
     */
    public Account(Customer cust,double bal)
    {
        setBalance(bal);
        accountNumber = nextAccountNumber;
        nextAccountNumber ++;
        customer = new Customer(cust);
    }
    
    /**
     * Get the account number.
     * @return the account number of the account.
     */
    public int getAccountNumber()
    {
        return accountNumber;
    }
    
    /**
     * Get the balance.
     * @return the balance of the account.
     */
    public double getBalance()
    {
        return balance;
    }
    
    /**
     * Get information of the customer.
     * @return the customer's information.
     */
    public Customer getCustomer()
    {
        return customer;
    }
    
    /**
     * Set the balance of the account to bal.
     * @param bal value wanted to be the new balance.
     */
    public void setBalance(double bal)
    {
        if (bal < 0 )
        {
            System.out.println("Entered balance number is invalid. Balance cannot be a negative value.");
        }
        else
        {
            balance = bal;
        }
    }
    
    /**
     * Set the customer to cust.
     * @param cust
     */
    public void setCustomer(Customer cust)
     {
         this.customer = cust;
     }
     
    /**
     * Deposit amount in this bank account.
     * If amount is negative, return a error message and false.
     * Else add amount to balance of this account and return true.
     * @param amount to be added in account.
     * @return true if successful or false if not.
     */
    public boolean deposit(double amount)
     {
         if( amount < 0)
         {
            System.out.println("Entered amount is invalid. deposit value cannot be a negative value.");
            return false;
         }
         else
         {
             balance += amount;
             return true;
         }
     }
     
    /**
     * Withdraws amount from this account.
     * If amount is negative or bigger than the balance, return a error message and false.
     * Else deduct amount from this accounts balance and return true.
     * @param amount to be deducted.
     * @return true if successful or false if not.
     */
    public boolean withdraw(double amount)
     {
         if (amount > balance || amount < 0)
         {
            System.out.println("Entered amount is invalid. Amount cannot be a negative value or be lower than the balance.");
            return false;
         }
         
         else
         {
             balance -= amount;
             return true;
         }
     }
     
    /**
     * Transfer amount from this account to other account.
     * Do withdraw method with amount.
     * if returns true, do deposit method to other account, and return true.
     * else return false.
     * @param amount to be transfered.
     * @param other account to receive money.
     * @return true if successful or false if not.
     */
    public boolean transferTo( double amount, Account other)
     {
         if (this.withdraw(amount) == true)
         {
            other.deposit(amount);
            return true;
         }

         else
         {
            return false;
         }
     }
     
    /**
     * Transfer amount from other account to this account.
     * Do withdraw method with amount from other account.
     * if returns true, do deposit method to this account, and return true.
     * else return false.
     * @param amount to be transfered.
     * @param other account to give money.
     * @return true if successful or false if not.
     */
    public boolean transferFrom( double amount, Account other)
     {
         if ( other.withdraw(amount) == true)
         {
             this.deposit(amount);
             return true;
         }

         else
         {
            return false;
         }
     }
     
    /**
     * Abstract method.
     * Definition deferred to concrete subclasses.
     * Used for polymorphic calls.
     */
    abstract public void perfomMonthEndProcessing();
    
    @Override
    public String toString()
    {
        String display =   customer +
                         "Account number: " + accountNumber + "\n" +
                         "Balance       : " + balance + "\n" ;
        return display;
    }

    /**
     * Main method for testing purposes.
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        System.out.println("test: doing noting");
    }
    
}
