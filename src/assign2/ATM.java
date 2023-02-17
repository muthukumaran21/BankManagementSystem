package assign2;

import java.util.ArrayList;
import java.util.List;


/**
 * This class represents an ATM which can perform operations like adding bank accounts,withdrawing money and checking account information.
 * It contains a list of BankAccount objects and an Encryptor object to encrypt/decrypt the password for each account.
 */
public class ATM {

   private List<BankAccount> account ;
   private Encryptor passwordEncoder;

    /**
     * Constructor that initializes the account list and password encoder.
     */
   public  ATM()
   {
       account = new ArrayList<>();
       passwordEncoder = new Encryptor();

   }

    /**
     * Adds a new BankAccount to the account list if the account id is unique.
     *
     * @param acctId The account id to be added
     * @param name The name of the account holder
     * @param balance The initial balance of the account
     * @param password The password for the account
     */
   public void addAccount(String acctId, String name,double balance, String password)
   {
      String encryptedPassword =  passwordEncoder.encrypt(password);
       BankAccount bankaccount = new BankAccount(acctId,name,balance,encryptedPassword);

       if(account.size() == 0)
       {
           account.add(bankaccount);
           System.out.println ( "Account added with account id " + acctId);
       }

       else
       {
           if(!checkAccount(bankaccount.getAccntId()))
           {
               account.add(bankaccount);
               System.out.println ( "Account added with account id " + acctId);

           }
           else
               System.out.println("AccountId " + acctId + "already exist");

       }


   }
    /**
     * Withdraws money from the account with the given account id if the password matches.
     *
     * @param acctId The account id of the account from which money is to be withdrawn
     * @param password The password for the account
     * @param amount The amount of money to be withdrawn
     * @return The amount of money withdrawn from the account
     */
   public double getMoney(String acctId, String password, double amount)
   {
       if(checkAccount(acctId))
       {
           BankAccount currBankAccount = getAccount(acctId);
           String decryptedPassword = passwordEncoder.decrypt(currBankAccount.getPassword()) ;
           double moneyWithdrawn = 0;
           if(decryptedPassword.equalsIgnoreCase(password))
           {
               moneyWithdrawn = currBankAccount.withdraw(amount);
               System.out.println("Amount of " + moneyWithdrawn +  " withdrawn from account : " + acctId);
               return moneyWithdrawn;
           }
           else
           {
               System.out.println("Password didnt match for account  " + acctId);
           }


       }
       else
       {
           System.out.println("Account id doesn't match " + acctId);
       }

        return 0;

   }

    /**
     * Checks if the given account id exists in the account list.
     *
     * @param acctId The account id to be checked
     * @return true if the account id exists in the account list, false otherwise
     */
   public boolean checkAccount(String acctId)
   {

       for(int i = 0 ; i < account.size(); i++)
       {
           if( account.get(i).getAccntId().equals(acctId) )
           {
               return true;
           }


       }
       return false;
   }

    /**
     * Gets the BankAccount object with the given account id.
     *
     * @param acctId The account id of the BankAccount object to be returned
     * @return The BankAccount object with the given account id
     */
    public BankAccount getAccount(String acctId)
    {

        int i  ;
        for( i = 0 ; i < account.size(); i++)
        {
            if( account.get(i).getAccntId().equals(acctId)  )
                break;

        }
        return account.get(i);

    }

    /**
    * Gets the BankAccount object with the given account id.
    * Used to get the ATM method
    */

    public static void main( String[] args)
    {
        ATM atm = new ATM();

        atm.addAccount("A123","M.Jones",2000.00,"fall-quarter");
        atm.addAccount("B654","B.Smith",100.00,"renaissance");
        atm.getMoney("A123","fall-quarter",1000.00);
        atm.getMoney("B654","essence",100.00);
        atm.getMoney("B654","renaissance",50.00);
        atm.getMoney("B654","renaissance",50.00);
        atm.getMoney("B654","renaissance",50.00);
        atm.addAccount("A123","M.Jones",1000.00,"fall-quarter");

    }

}
