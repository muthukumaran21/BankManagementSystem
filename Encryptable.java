package assign2;

/*
Name :Muthukumaran Elango
course number :  COEN 275 OO Analysis, Design and Programming
assignment number : 2
date of submission : 02/16/23
 */

/**
 Any class implementing this interface must provide an implementation for both the encrypt and decrypt methods.
 */
public interface Encryptable {

    /**
     Encrypts the given text using an encryption algorithm and returns the encrypted string.
     This method needs to be implemented.
     @param text the text to be encrypted
     @return the encrypted string
     */
     String encrypt(String text);

    /**

     Decrypts the given encrypted text and returns the original string.
     This method needs to be implemented.
     @param text the encrypted text to be decrypted
     @return the original string
     */
    String decrypt( String text );
}
