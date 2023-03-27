package assign2;

/*
Name :Muthukumaran Elango
course number :  COEN 275 OO Analysis, Design and Programming
assignment number : 2
date of submission : 02/16/23
 */


/**
 * EncryptionTester class is used to tests the encryption and decryption of different strings with different offsets
 */
public class EncryptionTester {


    /**
     * The main method that runs the two test sets
     */
    public static void main(String[] args)
    {
        testSet1();
        System.out.println();
        testSet2();
    }

    /**
     * This is used to print the various values
     * @param encryptor
     */
    public static void print(Encryptor encryptor)
    {

        System.out.println("String :  abcdefghijklmnopqrstuvwxyz");
        System.out.println("Enrypted string :  "+encryptor.encrypt("abcdefghijklmnopqrstuvwxyz"));
        System.out.println("Decrypted string  : "+ encryptor.decrypt(encryptor.encrypt("abcdefghijklmnopqrstuvwxyz")));

        System.out.println("String :  muthukumaran . elango");
        System.out.println("Enrypted string :  "+encryptor.encrypt("muthukumaran . elango"));
        System.out.println("Decrypted string  : "+ encryptor.decrypt(encryptor.encrypt("muthukumaran . elango")));

        System.out.println("String :  Xray defraction");
        System.out.println("Enrypted string :  "+encryptor.encrypt("Xray defraction"));
        System.out.println("Decrypted string  : "+ encryptor.decrypt(encryptor.encrypt("Xray defraction")));

        System.out.println("String :  Zebra-tailed lizard");
        System.out.println("Enrypted string :  "+encryptor.encrypt("Zebra-tailed lizard"));
        System.out.println("Decrypted string  : "+ encryptor.decrypt(encryptor.encrypt("Zebra-tailed lizard")));

        System.out.println("String :  Walkie-talkie");
        System.out.println("Enrypted string :  "+encryptor.encrypt("Walkie-talkie"));
        System.out.println("Decrypted string  : "+ encryptor.decrypt(encryptor.encrypt("Walkie-talkie")));

        System.out.println("String :  COEN 275 OO Analysis, Design and Programming");
        System.out.println("Enrypted string :  "+encryptor.encrypt("COEN 275 OO Analysis, Design and Programming"));
        System.out.println("Decrypted string  : "+ encryptor.decrypt(encryptor.encrypt("COEN 275 OO Analysis, Design and Programming")));
        System.out.println();
    }


    /**
     * A method that tests the Encryptor class with different offsets
     */
    public static void testSet1()
    {

//        Encryptor encryptor1 = new Encryptor();
//        encryptor1.setOffset(0);
//        System.out.println("Offset : " + 0);
//        print(encryptor1);

        Encryptor encryptor2 = new Encryptor();
        encryptor2.setOffset(3);
        System.out.println("Offset : " + 3);
        print(encryptor2);

        Encryptor encryptor3 = new Encryptor();
        encryptor3.setOffset(11);
        System.out.println("Offset : " + 11);
        print(encryptor3);

        Encryptor encryptor4 = new Encryptor();
        encryptor4.setOffset(25);
        System.out.println("Offset : " + 25);
        print(encryptor4);

//        Encryptor encryptor5 = new Encryptor();
//        encryptor5.setOffset(26);
//        System.out.println("Offset : " + 26);
//        print(encryptor5);


    }

    /**
     * A method that tests the Encryptor class with a random offset between 1 and 25 (inclusive)
     */
    public static void  testSet2()
    {

        for(int i = 0 ; i < 4 ; i++)
        {
            int randomNumber = (int)(Math.random() * 25 + 1 );
            Encryptor encryptor = new Encryptor();
            encryptor.setOffset(randomNumber);
            System.out.println("Random number is " + randomNumber);
            print(encryptor);

        }

    }

}
