package listjavasecurityproviders;

import javax.crypto.*;
import javax.swing.*;

public class AESExampleEncryption
{

    public static void main(String[] args) throws Exception
    {
        String input = JOptionPane.showInputDialog("Enter a string to encrypt:");
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        //
        keyGenerator.init(128);
        SecretKey key = keyGenerator.generateKey();
        System.out.println("Done generating the key");

        // Attempt to encrypt some text
        // name of algorithm/feedback/padding --ttkoch 4/15/2013
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, key);

        byte[] plainText = input.getBytes("UTF-8");
        // Print out the bytes of the plainText
        System.out.println("\nPlaintext: ");
        for (int i = 0; i < plainText.length; i++)
        {
            System.out.print(plainText[i] + " ");
        }

        //Perform the actual encryption
        byte[] cipherText = cipher.doFinal(plainText);

        // Print out the bytes of the plainText
        System.out.println("\nCiphertext: ");
        for (int i = 0; i < cipherText.length; i++)
        {
            System.out.print(cipherText[i] + " ");
        }
        System.out.println("\nOK");

        //Reinitilialize the cipher to decrypt mode
        cipher.init(Cipher.DECRYPT_MODE, key);

        //Perform the decryption
        byte[] decryptedText = cipher.doFinal(cipherText);
        // Print out the decrypted text
        System.out.println("\nDecrypted text: ");
        for (int i = 0; i < decryptedText.length; i++)
        {
            System.out.print(decryptedText[i] + " ");
        }
        System.out.println("\nOK");

        System.out.println("Decrypted string is :");
        System.out.println(new String(decryptedText, "UTF-8"));
    }
}