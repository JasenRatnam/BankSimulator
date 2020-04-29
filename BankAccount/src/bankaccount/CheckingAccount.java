package bankaccount;

/**
 *  Apply polymorphism in program design.
 * Reuse code, creating new classes from existing ones.
 * Make a bank account with a savings and checking account.
 * And a stand alone customer class.
 * CheckingAccount is a concrete class.
 * CheckingAccount provides all of the functionality of an Account.
 * CheckingAccount charges a fee for each transaction.
 * Assignment 2
 * Date : 2017-02-27
 * @author: Jasen Ratnam
 */
public class CheckingAccount extends Account
{

    /**
     * Field to store number of deposits + withdrawals.
     */
    private int transactionCount;

    /**
     * Field to store fee charge per transaction.
     */
    private double transactionfees;
    
    /**
     * Calls super's constructor to create an account and set transactionCount to Zero, and transactionfees to fee.
     * @param cust information about customer.
     * @param bal balance of account.
     * @param fee transactionfees of the account.
     */
    public CheckingAccount( Customer cust, double bal, double fee)
    {
       super(cust,bal);
       this.transactionfees = fee;
       transactionCount = 0;
    }
    
    @Override
    public boolean deposit(double amount)
    {
        //if(super.deposit(amount) == true)
        if(super.deposit(amount))
        {
            transactionCount += 1;
            return true;
        }
        else
            return false;
    }
    
    @Override
    public boolean withdraw(double amount)
    {
        //if(super.withdraw(amount) == true)
        if(super.withdraw(amount))
        {
            transactionCount += 1;
            return true;
        }
        else
            return false;
    }
    
    /**
     * Get the transaction count.
     * @return transaction count.
     */
    public int getCount()
    {
        return transactionCount;
    }
    
    /**
     * Get the transaction fee.
     * @return the transaction fee.
     */
    public double getFee()
    {
        return transactionfees;
    }
    
    /**
     * Set the transaction count to 'count'.
     * @param count amount to be set as the transaction count.
     */
    public void setCount(int count)
    {
        transactionCount = count;
    }
    
    /**
     * Set the transaction fee to 'fee'.
     * @param fee to be set as the transaction fee.
     */
    public void setFee(double fee)
    {
        transactionfees = fee;
    }
    
    @Override
    public void perfomMonthEndProcessing()
    {
        super.setBalance(super.getBalance() - (transactionfees * transactionCount));
        transactionCount = 0;
    }
    
    @Override
    public String toString()
    {
        String display = super.toString() +
                         "Account type: Checking \n" +
                         "Transaction count: " + transactionCount + "\n" +
                         "Transaction fee:   " + transactionfees + "\n";            
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
