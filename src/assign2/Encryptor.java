package assign2;

public class Encryptor implements  Encryptable{

    private int offset;

   public void Encryptor()
    {
        this.offset = 1;
    }

  public  void setOffset (int shift)
  {
      if ( shift >0 && shift < 26)
         this.offset = shift;
      else
          throw new IllegalArgumentException("Wrong offset value: " + shift);

  }


    @Override
    public String encrypt(String text) {

        text = text.toUpperCase();
       StringBuilder encryptedString = new StringBuilder("");

       for(int i = 0 ; i < text.length(); i++)
       {
           char temp =  (char)(((text.charAt(i) - 'A' + offset ) % 26) + 'A');
           encryptedString.append(  temp);
       }


        return encryptedString.toString();
    }

    @Override
    public String decrypt(String text) {

        text = text.toUpperCase();

        StringBuilder decryptedString = new StringBuilder("");


        for(int i = 0 ; i < text.length(); i++)
        {
            char temp =  (char)(((text.charAt(i) - 'A' + (26 - offset) ) % 26) + 'A');
            decryptedString.append(  temp);
        }


        return decryptedString.toString();
    }
}
