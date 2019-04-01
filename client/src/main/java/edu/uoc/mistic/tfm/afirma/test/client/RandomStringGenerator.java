package edu.uoc.mistic.tfm.afirma.test.client;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import es.gob.afirma.core.misc.Base64;

public class RandomStringGenerator {

	public static Logger logger = LogManager.getFormatterLogger("RandomStringGenerator");
	
	public String getRandomString(int l) {
	    return RandomStringUtils.randomAlphanumeric(l);
	}
	
	public static void main(String[] args) {
		
		logger.info("Inicio...");
		RandomStringGenerator rsg = new RandomStringGenerator();
		for (int k = 2; k < 25; k++) {
			logger.info(k + " : ["+ Base64.encode(rsg.getRandomString(k).getBytes())+"]");
		}
		logger.info("Fin!");
	}
}
