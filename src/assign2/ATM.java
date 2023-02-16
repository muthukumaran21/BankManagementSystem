package assign2;

import java.util.ArrayList;
import java.util.List;

public class ATM {

   private List<BankAccount> account ;
   private Encryptor passwordEncoder;

   public  ATM()
   {
       account = new ArrayList<>();
       passwordEncoder = new Encryptor();

   }

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
