package assign2;

public class EncryptionTester {



    public static void main(String args[])
    {
        testSet1();
    }

    public static void print(Encryptor encryptor)
    {

        System.out.println("String :  abcdefghijklmnopqrstuvwxyz");
        System.out.println(" Enrypted string :  "+encryptor.encrypt("abcdefghijklmnopqrstuvwxyz"));
        System.out.println(" decrypted string  : "+ encryptor.decrypt(encryptor.encrypt("abcdefghijklmnopqrstuvwxyz")));

        System.out.println("String :  muthukumaran . elango");
        System.out.println(" Enrypted string :  "+encryptor.encrypt("muthukumaran . elango"));
        System.out.println(" decrypted string  : "+ encryptor.decrypt(encryptor.encrypt("muthukumaran . elango")));

        System.out.println("String :  Xray defraction");
        System.out.println(" Enrypted string :  "+encryptor.encrypt("Xray defraction"));
        System.out.println(" decrypted string  : "+ encryptor.decrypt(encryptor.encrypt("Xray defraction")));

        System.out.println("String :  Zebra-tailed lizard");
        System.out.println(" Enrypted string :  "+encryptor.encrypt("Zebra-tailed lizard"));
        System.out.println(" decrypted string  : "+ encryptor.decrypt(encryptor.encrypt("Zebra-tailed lizard")));

        System.out.println("String :  Walkie-talkie");
        System.out.println(" Enrypted string :  "+encryptor.encrypt("Walkie-talkie"));
        System.out.println(" decrypted string  : "+ encryptor.decrypt(encryptor.encrypt("Walkie-talkie")));

        System.out.println("String :  COEN 275 OO Analysis, Design and Programming");
        System.out.println(" Enrypted string :  "+encryptor.encrypt("COEN 275 OO Analysis, Design and Programming"));
        System.out.println(" decrypted string  : "+ encryptor.decrypt(encryptor.encrypt("COEN 275 OO Analysis, Design and Programming")));
    }

    public static void testSet1()
    {

        Encryptor encryptor1 = new Encryptor();
        encryptor1.setOffset(3);
        print(encryptor1);


    }

}
