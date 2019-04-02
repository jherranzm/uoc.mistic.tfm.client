package edu.uoc.mistic.tfm.afirma.test.client;

import javax.crypto.Cipher;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.spongycastle.util.encoders.Base64;

public class SimmetricDecryptor  extends SimmetricCommon{
	
	public static Logger logger = LogManager.getFormatterLogger("SimmetricDecryptor");

	public static void main(String[] args) {
		
		String toDecrypt = "Whatever!";
		
		RandomStringGenerator rsg = new RandomStringGenerator();
		SimmetricDecryptor dec = new SimmetricDecryptor();
		
		String iv = rsg.getRandomString(16);
		String key = rsg.getRandomString(32);
		
		dec.setIv(iv);
		dec.setKey(key);
		
		logger.info("iv  : ["+iv+"] ["+ dec.getIv().getBytes().length + "]");
		logger.info("key : ["+key+"] ["+ dec.getKey().getBytes().length + "]");
		logger.info(toDecrypt + ":[" + dec.decrypt(toDecrypt) + "]");
	}

	public String decrypt(String src) {
		String decrypted = "";
		try {
			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
			cipher.init(Cipher.DECRYPT_MODE, generateKey(), generateInitializationVector());
			decrypted = new String(cipher.doFinal(Base64.decode(src)));
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return decrypted;
	}
}
