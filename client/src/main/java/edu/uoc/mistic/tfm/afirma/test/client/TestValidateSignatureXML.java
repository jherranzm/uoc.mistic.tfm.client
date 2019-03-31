package edu.uoc.mistic.tfm.afirma.test.client;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;

import es.gob.afirma.cert.signvalidation.SignValidity;
import es.gob.afirma.cert.signvalidation.ValidateXMLSignature;
import es.gob.afirma.core.misc.AOUtil;

public class TestValidateSignatureXML {

	public static void main(String[] args) {
		
		List<String> filenames = new ArrayList<>();
		filenames.add("/Users/jherranzm/Downloads/Invoice_990001.xml");
		filenames.add("/Users/jherranzm/Downloads/Invoice_990002.xml");
		filenames.add("/Users/jherranzm/Dropbox/Alicia/Docs y Facturas/FacturasElectronicas/Agencia de l'Habitatge/AGE_HAB_CAT_160696_v002.xml_signed.xsig");
		filenames.add("/Users/jherranzm/Downloads/Invoice_990001.xml.Enveloped-Sign_error.xml");
		filenames.add("/Users/jherranzm/AndroidStudioProjects/AppTestValidationAndroid44/app/src/main/res/raw/invoice_990001_xml_signed.xsig");
		filenames.add("/Users/jherranzm/Downloads/Invoice_990002.xml.20190329-194643.xml");
		filenames.add("/Users/jherranzm/Downloads/Invoice_990002.xml.20190329-1955258.xml");
		
		
		ValidateXMLSignature validator = new ValidateXMLSignature();
		try {
			for(String filename : filenames) {
				System.out.println("filename:" + filename);
				File file = new File(filename);
				if (!file.exists()) throw new FileNotFoundException();
				final byte[] data = AOUtil.getDataFromInputStream(new FileInputStream(file));
				System.out.println("\tLong file : "+data.length);
				SignValidity val = validator.validate(data);
				System.out.println("\tgetValidity : "+ val.getValidity());
				System.out.println("\tgetError    : "+ val.getError());
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static {
        //Security.insertProviderAt(new org.spongycastle.jce.provider.BouncyCastleProvider(), 1);
        //org.apache.xml.security.Init.init();
    }
}
