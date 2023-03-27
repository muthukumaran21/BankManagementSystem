package assign2;

/*
Name :Muthukumaran Elango
course number :  COEN 275 OO Analysis, Design and Programming
assignment number : 2
date of submission : 02/16/23
 */


/**
 The BankAccount class represents a bank account with attributes of account ID, account name, balance and password.
 */
public class BankAccount {

    private String accntId;
    private String name;
    private double balance;
    private String password;


    /**
     * Constructs a new BankAccount object with given account ID, name, balance, and password.
     *
     * @param accntId the ID of the account
     * @param name the name of the account
     * @param balance the balance of the account
     * @param password the password of the account
     */
    public  BankAccount(String accntId, String name, double balance, String password)
    {
        this.accntId = accntId;
        this.name = name;
        this.balance = balance;
        this.password = password;

    }

    /**
     * Returns the account ID of the BankAccount object
     * @return the account ID of the BankAccount
     */
    public String getAccntId() {
        return accntId;
    }

    /**
     * Sets the account ID of the BankAccount object.
     * @param accntId the account ID to be set
     */
    public void setAccntId(String accntId) {
        this.accntId = accntId;
    }

    /**
     * Returns the password of the BankAccount object.
     *
     * @return the password of the BankAccount
     */
    public String getPassword() {
        return password;
    }


    /**
     * Sets the password of the BankAccount object.
     *
     * @param password the password to be set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Withdraws the given amount from the account balance if the amount is positive and less than or equal to the current balance.
     * If the amount is more than balance or less than 0 then it will return 0
     * @param amount the amount to be withdrawn from the account
     * @return the amount withdrawn if it is a valid value, otherwise zero
     */
    public double withdraw( double amount)
    {

        if(amount >0 && amount <= this.balance)
        {
            balance -= amount ;
        }
        else
        {
            System.out.println(" Amount value is either negative or greater than balance ");
            amount = 0 ;
        }

        return amount ;
    }

    /**
     * Deposits the given amount into the account if the amount is positive.
     *
     * @param amount the amount to be deposited into the account
     */
    public void deposit(double amount )
    {
        if( amount > 0)
            this.balance += amount;

    }



}
