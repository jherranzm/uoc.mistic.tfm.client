package edu.uoc.mistic.tfm.afirma.test.client;

import java.io.File;
import java.io.FileInputStream;
import java.security.KeyStore;
import java.security.KeyStore.PrivateKeyEntry;
import java.security.cert.X509Certificate;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.Assert;

import es.gob.afirma.core.misc.AOUtil;
import es.gob.afirma.core.signers.AOSignConstants;
import es.gob.afirma.core.signers.AOSigner;
import es.gob.afirma.core.signers.AOSimpleSignInfo;
import es.gob.afirma.core.util.tree.AOTreeModel;
import es.gob.afirma.core.util.tree.AOTreeNode;
import es.gob.afirma.signers.xades.AOFacturaESigner;

public class TestFacturae {
	//private static final String CERT_PATH = "PFActivoFirSHA256.pfx"; //$NON-NLS-1$
	private static final String CERT_PATH = "/Users/jherranzm/Dropbox/Jose_Luis/TFM_2019/PKI/private/server.p12"; //$NON-NLS-1$
    private static final String CERT_PASS = "Th2S5p2rStr4ngP1ss"; //$NON-NLS-1$
    private static final String CERT_ALIAS = "Server"; //$NON-NLS-1$

    private static final Properties[] XADES_MODES;

    static {
        final Properties p1 = new Properties();
        XADES_MODES = new Properties[] {
                p1
        };
    }

    /** Algoritmos de firma a probar. */
    private final static String[] ALGOS = new String[] {
//            AOSignConstants.SIGN_ALGORITHM_SHA1WITHRSA,
//            AOSignConstants.SIGN_ALGORITHM_SHA512WITHRSA,
            AOSignConstants.SIGN_ALGORITHM_SHA256WITHRSA,
//            AOSignConstants.SIGN_ALGORITHM_SHA384WITHRSA
    };

    // IMPORTANTE: Poner extension ".xml" a los ficheros de prueba con contenido XML
    private static final String[] TEST_FILES_DATA = new String[] {
            //"/Users/jherranzm/Dropbox/Alicia/Docs y Facturas/FacturasElectronicas/UAB/0160718_4500385649.xml", //$NON-NLS-1$
            "/Users/jherranzm/Downloads/Invoice_990001.xml", //$NON-NLS-1$
            "/Users/jherranzm/Downloads/Invoice_990002.xml", //$NON-NLS-1$
            "/Users/jherranzm/Downloads/Invoice_990003.xml", //$NON-NLS-1$
            "/Users/jherranzm/Downloads/Invoice_990004.xml", //$NON-NLS-1$
    		"/Users/jherranzm/Downloads/Invoice_990005.xml" //$NON-NLS-1$
    };

    /**
     * Prueba de firma convencional.
     * @throws Exception en cualquier error
     */
    @SuppressWarnings("static-method")
    public static void main(String[] args) throws Exception {

//        TestSignVerifier verifier = null;
//        try {
//            verifier = new TestSignVerifier();
//        }
//        catch (Exception e) {
//            System.out.println("No se ha podido inicializar el validador de firmas, no se validaran como parte de las pruebas: " + e); //$NON-NLS-1$
//        }


        Logger.getLogger("es.gob.afirma").setLevel(Level.WARNING); //$NON-NLS-1$
        final PrivateKeyEntry pke;
        final X509Certificate cert;

        final KeyStore ks = KeyStore.getInstance("PKCS12"); //$NON-NLS-1$
        //ks.load(ClassLoader.getSystemResourceAsStream(CERT_PATH), CERT_PASS.toCharArray());
        ks.load(new FileInputStream(new File(CERT_PATH)), CERT_PASS.toCharArray());
        pke = (PrivateKeyEntry) ks.getEntry(CERT_ALIAS, new KeyStore.PasswordProtection(CERT_PASS.toCharArray()));
        cert = (X509Certificate) ks.getCertificate(CERT_ALIAS);
        //Provider provider = ks.getProvider();
        

        final AOSigner signer = new AOFacturaESigner();

        String prueba;

        for (final Properties extraParams : XADES_MODES) {
            for (final String algo : ALGOS) {
                for (final String filename : TEST_FILES_DATA) {

                    prueba = "Factura electronica con el algoritmo ' " + //$NON-NLS-1$
                    algo +
                    "' y el fichero '" + //$NON-NLS-1$
                    filename + "'"; //$NON-NLS-1$

                    System.out.println("");
                    System.out.println(prueba);

                    //final byte[] data = AOUtil.getDataFromInputStream(ClassLoader.getSystemResourceAsStream(filename));
                    File origen = new File(filename);
                    final byte[] data = AOUtil.getDataFromInputStream(new FileInputStream(origen));

                    final byte[] result = signer.sign(
                		data,
                		algo,
                		pke.getPrivateKey(),
                		pke.getCertificateChain(),
                		extraParams
            		);

                    String fileNameOut = filename+"_"+TestFacturae.getDate_yyyymmddhhmmss()+".xml";
                    fileNameOut = fileNameOut.replaceAll("\\.", "_").replaceAll("-", "_").toLowerCase().concat(".xsig");
                    final File f = new File(fileNameOut);
                    try (
                    		final java.io.FileOutputStream fos = new java.io.FileOutputStream(f);
                    ) {
                    	fos.write(result);
                    	fos.flush();
                    }
                    System.out.println("Temporal para comprobacion manual: " + f.getAbsolutePath()); //$NON-NLS-1$
                    

                    Assert.assertNotNull(prueba, result);
                    Assert.assertTrue(signer.isSign(result));

                    AOTreeModel tree = signer.getSignersStructure(result, false);
                    Assert.assertEquals("Datos", ((AOTreeNode) tree.getRoot()).getUserObject()); //$NON-NLS-1$
                    Assert.assertEquals(CERT_ALIAS, ((AOTreeNode) tree.getRoot()).getChildAt(0).getUserObject()); //$NON-NLS-1$

                    tree = signer.getSignersStructure(result, true);
                    Assert.assertEquals("Datos", ((AOTreeNode) tree.getRoot()).getUserObject()); //$NON-NLS-1$
                    final AOSimpleSignInfo simpleSignInfo = (AOSimpleSignInfo) ((AOTreeNode) tree.getRoot()).getChildAt(0).getUserObject();

                    Assert.assertNotNull(simpleSignInfo.getSigningTime());
                    Assert.assertEquals(cert, simpleSignInfo.getCerts()[0]);
                    
                }
            }
        }

    }
    
    private static String getDate_yyyymmddhhmmss(){
    	String res = new String();
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd-HHmmSS");
    	res = sdf.format(Calendar.getInstance().getTime());
    	return res;
    	
    }

}
