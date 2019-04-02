package edu.uoc.mistic.tfm.afirma.test.client;

import es.gob.afirma.core.misc.Base64;

import javax.crypto.Cipher;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class SimmetricEncryptor extends SimmetricCommon{
	
	public static Logger logger = LogManager.getFormatterLogger("SimmetricEncryptor");

	public static void main(String[] args) {
		
		String toEncrypt = "Whatever!";
		
		RandomStringGenerator rsg = new RandomStringGenerator();
		SimmetricEncryptor enc = new SimmetricEncryptor();
		
		String iv = rsg.getRandomString(16);
		String key = rsg.getRandomString(32);
		
		enc.setIv(iv);
		enc.setKey(key);
		
		String encrypted = enc.encrypt(toEncrypt);
		
		logger.info("iv  : ["+iv+"] ["+ enc.getIv().getBytes().length + "]");
		logger.info("key : ["+key+"] ["+ enc.getKey().getBytes().length + "]");
		logger.info(toEncrypt + ":[" + encrypted + "]");
		
		SimmetricDecryptor dec = new SimmetricDecryptor();
		
		dec.setIv(iv);
		dec.setKey(key);
		
		String decrypted = dec.decrypt(encrypted);
		
		logger.info("iv  : ["+iv+"] ["+ dec.getIv().getBytes().length + "]");
		logger.info("key : ["+key+"] ["+ dec.getKey().getBytes().length + "]");
		logger.info(encrypted + ":[" + decrypted + "]");

		logger.info("[" + toEncrypt + "]:[" + decrypted + "]");
	}
	
	public String encrypt(String src) {
		
	    try {
	        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
	        cipher.init(Cipher.ENCRYPT_MODE, generateKey(), generateInitializationVector());
	        return Base64.encode(cipher.doFinal(src.getBytes()));
	    } catch (Exception e) {
	        throw new RuntimeException(e);
	    }
	}
}
