package assign2;

/*
Name :Muthukumaran Elango
course number :  COEN 275 OO Analysis, Design and Programming
assignment number : 2
date of submission : 02/16/23
 */


/**
 The Encryptor class provides implementation for the Encryptable interface.
 It allows the user to encrypt and decrypt plain text using a Caesar cipher with a specified offset value.
 */
public class Encryptor implements  Encryptable{

    private int offset;

    /**
     * The default constructor initializes the offset instance variable to 1.
     */
   public  Encryptor()
    {
        this.offset = 1;
    }

    /**
     * The setOffset method sets the shift value for the encryption and decryption process.
     * @param shift - an integer value representing the shift value to be set.
     * @throws IllegalArgumentException if the shift value is not between 1 and 25 (inclusive).
     */
  public  void setOffset (int shift)
  {
      if ( shift >0 && shift < 26)
         this.offset = shift;
      else
          throw new IllegalArgumentException("Wrong offset value: " + shift);

  }


    /**
     * The encrypt method encrypts the input text string using a Caesar cipher with the current offset.
     * @param text - a String object representing the text to be encrypted.
     * @return a String object representing the encrypted text.
     */
    @Override
    public String encrypt(String text) {

        text = text.toUpperCase();
       StringBuilder encryptedString = new StringBuilder("");

       for(int i = 0 ; i < text.length(); i++)
       {
           if(Character.isAlphabetic(text.charAt(i)))
           {
               char temp =  (char)(((text.charAt(i) - 'A' + offset ) % 26) + 'A');
               encryptedString.append(  temp);
           }
           else
           {
               encryptedString.append(text.charAt(i));
           }


       }


        return encryptedString.toString();
    }

    /**
     * The decrypt method decrypts the input text string using a Caesar cipher with the current offset.
     * @param text - a String object representing the text to be decrypted.
     * @return a String object representing the decrypted text.
     */
    @Override
    public String decrypt(String text) {

        text = text.toUpperCase();

        StringBuilder decryptedString = new StringBuilder("");


        for(int i = 0 ; i < text.length(); i++)
        {
            if(Character.isAlphabetic(text.charAt(i)))
            {
                char temp = (char) (((text.charAt(i) - 'A' + (26 - offset)) % 26) + 'A');
                decryptedString.append(temp);
            }
            else
            {
                decryptedString.append(text.charAt(i));

            }
        }


        return decryptedString.toString();
    }
}
