package bankaccount;

/**
 * Apply polymorphism in program design.
 * Reuse code, creating new classes from existing ones.
 * Make a bank account with a savings and checking account.
 * And a stand alone customer class.
 * Customer plays the role of "owner".
 * Customer has no idea that it is associated with the Account.
 * Customer is a concrete class.
 * Assignment 2
 * Date : 2017-02-27
 * @author: Jasen Ratnam
 */
public class Customer 
{

    /**
     * Field to store name.
     */
    private String name;

    /**
     * Field to store phone number.
     */
    private String phone;

    /**
     * Field to store email address.
     */
    private String email;
    
    /**
     * Normal constructor using variable name, email and phone.
     * @param name of the customer.
     * @param phone of the customer.
     * @param email of the customer.
     */
    public Customer(String name, String phone, String email)
    {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    /**
     * Copy constructor.
     * Creates a copy of a customer.
     * @param anotherCustomer
     */
        public Customer(Customer anotherCustomer)
    {
        this(anotherCustomer.name, anotherCustomer.phone, anotherCustomer.email);
    }
    
    /**
     * Get the name of the Customer.
     * @return name.
     */
    public String getName()
    {
        return this.name;
    }
    
    /**
     * Get the phone number of the Customer.
     * @return phone number.
     */
    public String getPhone()
    {
        return this.phone;
    }
    
    /**
     * Get the email address of the Customer.
     * @return email address.
     */
    public String getEmail()
    {
        return this.email;
    }
    
    /**
     * Set the name of the customer to 'name'.
     * @param name to be given to customer.
     */
    public void setName(String name)
    {
        this.name = name;
    }
    
    /**
     * Set the phone number of the customer to 'phone'.
     * @param phone number of the customer.
     */
    public void setPhone(String phone)
    {
        this.phone = phone;
    }
    
    /**
     * Set the email address of the customer to 'email'.
     * @param email of he customer.
     */
    public void setEmail(String email)
    {
        this.email = email;
    }
     
    /**
     * Compare this and another customer objects.
     * @param owner other customer.
     * @return true if objects are equals, false if not.
     */
    public boolean equal(Customer owner)
    {
        return (this.name.equals(owner.name) && this.phone.equals(owner.phone) && this.email.equals(owner.email));
//        if(this.name.equals(owner.name) && this.phone.equals(owner.phone) && this.email.equals(owner.email))
//        {
//            return true;
//        }
//        else
//            return false;
    }
    
    @Override
    public String toString()
    {
        String display = "Name:  " + name + "\n" +
                         "Phone: " + phone + "\n" +
                         "Email: " + email + "\n";
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
