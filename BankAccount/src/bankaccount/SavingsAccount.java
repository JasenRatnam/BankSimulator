package bankaccount;

/**
 * Apply polymorphism in program design.
 * Reuse code, creating new classes from existing ones.
 * Make a bank account with a savings and checking account.
 * And a stand alone customer class.
 * SavingsAccount is a concrete class.
 * SavingsAccount provides all of the functionality of an Account.
 * Assignment 2
 * Date : 2017-02-27
 * @author: Jasen Ratnam
 */
public class SavingsAccount extends Account 
{

    /**
     * Field to store annual interest rate.
     */
    private double interest;

    /**
     * Field to store minimum balance value.
     */
    private double minimumBalance;
    
    /**
     * Calls super's constructor to create an account and initializes interest to 'air' and minimumBalance to 'bal'.
     * @param customer information about customer.
     * @param bal balance of account.
     * @param air annual interest rate.
     */
    public SavingsAccount(Customer customer, double bal, double air)
    {
        super(customer,bal);
        this.interest = air;
        minimumBalance = bal;
    }
    
    @Override
    public boolean deposit(double amount)
    {
//        boolean result = super.deposit(amount);
//        if(result)
//            return true;
//        else
//            return false;
        
       
//        if(super.deposit(amount))
//            return true;
//        else
//            return false;
        
        return super.deposit(amount);
    }
    
    
    @Override
    public boolean withdraw(double amount)
    {
//        super.withdraw(amount);
//        if(true)
//        {
//            minimumBalance = super.getBalance();
//            return true;
//        }
//        else
//            return false;
        
        
        if(super.withdraw(amount))
        {
            minimumBalance = super.getBalance();
            return true;
        }
        else
            return false;
    }
    
    /**
     * Get annual interest rate.
     * @return annual interest rate.
     */
    public double getInterest()
    {
        return interest;
    }
    
    /**
     * Get the minimum balance.
     * @return the minimum balance.
     */
    public double getMinBalance()
    {
        return minimumBalance;
    }
    
    /**
     * Set annual interest rate to 'air'.
     * @param air
     */
    public void setInterest(double air)
    {
        interest = air;
    }
    
    /**
     * Set the minimum balance to 'bal'.
     * @param bal
     */
    public void setMinBalance(double bal)
    {
        minimumBalance = bal;
    }
    
   
    @Override
    public void perfomMonthEndProcessing()
    {
        double totalInterestForMonth = (((interest/100)/12) * minimumBalance);
        minimumBalance += totalInterestForMonth;
        super.setBalance(minimumBalance);
    }
    
    @Override
    public String toString()
    {
        String display = super.toString() + 
                         "Account type: Savings \n" +
                         "Annual interset rate: " + interest + "%\n" +
                         "Minimum balance: " + minimumBalance + "\n";            
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
