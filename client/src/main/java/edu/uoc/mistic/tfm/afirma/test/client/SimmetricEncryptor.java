package edu.uoc.mistic.tfm.afirma.test.client;

import java.io.UnsupportedEncodingException;
import java.security.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.spec.AlgorithmParameterSpec;
import es.gob.afirma.core.misc.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class SimmetricEncryptor {
	
	public static Logger logger = LogManager.getFormatterLogger("SimmetricEncryptor");

	private String iv;
	private String key;
	
	public static void main(String[] args) {
		
		String toEncrypt = "Whatever!";
		
		RandomStringGenerator rsg = new RandomStringGenerator();
		SimmetricEncryptor enc = new SimmetricEncryptor();
		
		String iv = rsg.getRandomString(16);
		String key = rsg.getRandomString(32);
		
		enc.setIv(iv);
		enc.setKey(key);
		
		logger.info("iv  : ["+iv+"] ["+ enc.getIv().getBytes().length + "]");
		logger.info("key : ["+key+"] ["+ enc.getKey().getBytes().length + "]");
		logger.info(toEncrypt + ":[" + enc.encrypt(toEncrypt) + "]");
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
	
	private Key generateKey() {
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			byte[] key = md.digest(getKey().getBytes("UTF-8"));
			return new SecretKeySpec(key, "AES");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	private AlgorithmParameterSpec generateInitializationVector() {
		try {
			return new IvParameterSpec(getIv().getBytes("UTF-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return null;
	}

	public String getIv() {
		return iv;
	}

	public void setIv(String iv) {
		this.iv = iv;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
}
