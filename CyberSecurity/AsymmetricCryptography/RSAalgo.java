package rsa;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Base64;

import javax.crypto.Cipher;

public class RSAalgo {

	public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
		// TODO Auto-generated method stub
	
		/*
		    KeyGenerator keygenerator = null;
			try {
				keygenerator = KeyGenerator.getInstance("RSAs");
			} catch (NoSuchAlgorithmException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			*/
			KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
			keyPairGenerator.initialize(4096);
        
		    //SecretKey secretKey = keygenerator.generateKey();
		    
		    KeyPair keyPair = keyPairGenerator.generateKeyPair(); 
		    PublicKey publicKey = keyPair.getPublic();
		    PrivateKey privateKey = keyPair.getPrivate(); 
		    
		    Cipher cipherText;
		    cipherText = Cipher.getInstance("RSA/ECB/OAEPWITHSHA-512ANDMGF1PADDING");
		    cipherText.init(Cipher.ENCRYPT_MODE, publicKey);

		   
		    byte[] text = "This is CSCI 240 Cyber Security class".getBytes();
		    System.out.println("Text--> " + new String(text));
		   
		   
		    byte[] encryptedText = cipherText.doFinal(text);
		    String outputEncryptedText = Base64.getEncoder().encodeToString(encryptedText);
		    
		    System.out.println("Encrypted Text--> " + outputEncryptedText);
		    
		    cipherText.init(Cipher.DECRYPT_MODE, privateKey);
		    byte[] decryptedText = cipherText.doFinal(encryptedText);
		    System.out.println("Decrypted Text--> " + new String(decryptedText));

	}
}
