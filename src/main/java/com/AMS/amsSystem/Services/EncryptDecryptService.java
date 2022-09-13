package com.AMS.amsSystem.Services;

import java.lang.Thread.State;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Base64;
import java.util.Map;

import javax.crypto.Cipher;

import org.apache.commons.collections4.map.HashedMap;
import org.hibernate.mapping.PrimaryKey;
import org.springframework.stereotype.Service;

@Service
public class EncryptDecryptService {
	
	public static Map<String, Object>  map =new HashedMap();
	
	public void createKeys() {
	    try {
	      KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
	      keyPairGenerator.initialize(4096);
	      KeyPair keyPair = keyPairGenerator.generateKeyPair();
	      PublicKey publicKey = keyPair.getPublic();
	      PrivateKey privateKey = keyPair.getPrivate();
	      map.put("publicKey", publicKey);
	      map.put("privateKey", privateKey);

	    } catch (Exception e) {
	      e.printStackTrace();
	    }
	  }
	
	public String encryptMessage(String plainText) {
		
		try {
			Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWITHSHA-512ANDMGF1PADDING");
			PublicKey publicKey =(PublicKey) map.get("publicKey");
			cipher.init(Cipher.ENCRYPT_MODE, publicKey);
			byte[] encrypt = cipher.doFinal(plainText.getBytes());
			return new String(Base64.getEncoder().encodeToString(encrypt));
		}
		catch (Exception e) {
			
		}
		return "";
		
	}
	
	 public String decryptMessage(String encryptedMessgae) {

		    try {
		      Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWITHSHA-512ANDMGF1PADDING");
		      PrivateKey privateKey = (PrivateKey) map.get("privateKey");
		      cipher.init(Cipher.DECRYPT_MODE, privateKey);
		      byte[] decrypt = cipher.doFinal(Base64.getDecoder().decode(encryptedMessgae));
		      return new String(decrypt);
		    } catch (Exception e) {
		      e.printStackTrace();
		    }
		    return "";
		  }
	
	
	
}
