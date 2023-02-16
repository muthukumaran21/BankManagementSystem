package assign2;

public class BankAccount {



    private String accntId;
    private String name;
    private double balance;



    private String password;

    public  BankAccount(String accntId, String name, double balance, String password)
    {
        this.accntId = accntId;
        this.name = name;
        this.balance = balance;
        this.password = password;

    }

    public String getAccntId() {
        return accntId;
    }

    public void setAccntId(String accntId) {
        this.accntId = accntId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

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
    public void deposit(double amount )
    {
        if( amount > 0)
            this.balance += amount;

    }



}
