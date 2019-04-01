package edu.uoc.mistic.tfm.afirma.test.client;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Collections;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.xml.security.utils.Constants;
import org.jibx.runtime.BindingDirectory;
import org.jibx.runtime.IBindingFactory;
import org.jibx.runtime.IUnmarshallingContext;
import org.jibx.runtime.JiBXException;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import es.facturae.facturae.v3.facturae.Facturae;

public class TestProcessDocument {
	
	public static Logger logger = LogManager.getFormatterLogger("TestProcessDocument");
	
	public static final String FILE = "/Users/jherranzm/AndroidStudioProjects/AppTestValidationAndroid44/app/src/main/res/raw/invoice_990001_xml_20190329_2020707_xml.xsig";
	
	public static void main(String[] args) {
		
		logger.info("Inicio...");

		// Cargar un documento factura firmada

		Document document;
		
		try {
			File file = new File(FILE);
			FileInputStream fis = new FileInputStream(file);
			document = getDocument(fis);
			
			logger.info("Root element: [%s]", document.getDocumentElement().getNodeName());
			
		
		
		// Eliminar la firma (Signature)
		
			XPathFactory xpf = XPathFactory.newInstance();
			XPath xpath = xpf.newXPath();
			
			xpath.setNamespaceContext(new javax.xml.namespace.NamespaceContext() {

                @SuppressWarnings("rawtypes")
                @Override
                public java.util.Iterator getPrefixes(final String namespaceURI) {
                    return Collections.singleton("fe").iterator();
                }

                @Override
                public String getPrefix(final String namespaceURI) {
                    return "fe";
                }

                @Override
                public String getNamespaceURI(final String prefix) {
                    return "http://www.facturae.es/Facturae/2014/v3.2.1/Facturae";
                }
            });
			
			NodeList list = (NodeList) document.getElementsByTagNameNS(Constants.SignatureSpecNS, "Signature");
			logger.info("Node List Count(): [%d]", list.getLength());
			list.item(0).getParentNode().removeChild(list.item(0));

			
			// Convertirlo a String
			//write to file.
			String strDocument = toString(document);
			logger.info("Factura sin Signature: [%s]", strDocument);
			
			try
			{
	            IBindingFactory bfact = BindingDirectory.getFactory(Facturae.class);
	            IUnmarshallingContext uctx = bfact.createUnmarshallingContext();
	            Facturae facturae = (Facturae)uctx.unmarshalDocument(new StringReader(strDocument), null);

			    logger.info("Seller          : [%s]", facturae.getParties().getSellerParty().getTaxIdentification().getTaxIdentificationNumber());
			    logger.info("Seller          : [%s]", facturae.getParties().getSellerParty().getLegalEntity().getCorporateName());
			    logger.info("Factura         : [%s]", facturae.getInvoices().getInvoiceList().get(0).getInvoiceHeader().getInvoiceNumber());
			    logger.info("Importe factura : [%s]", facturae.getInvoices().getInvoiceList().get(0).getInvoiceTotals().getInvoiceTotal());
			} catch (JiBXException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DOMException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// Marshall en Facturae.class
		
		
		logger.info("Fin!");
		
	}
	
	private static Document getDocument(InputStream isDocument) {
        Document doc = null;
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setNamespaceAware(true);
        try {
            doc = dbf.newDocumentBuilder().parse(isDocument);
        } catch (ParserConfigurationException ex) {
            System.err.println("Error al parsear el documento");
            ex.printStackTrace();
            System.exit(-1);
        } catch (SAXException ex) {
            System.err.println("Error al parsear el documento");
            ex.printStackTrace();
            System.exit(-1);
        } catch (IOException ex) {
            System.err.println("Error al parsear el documento");
            ex.printStackTrace();
            System.exit(-1);
        } catch (IllegalArgumentException ex) {
            System.err.println("Error al parsear el documento");
            ex.printStackTrace();
            System.exit(-1);
        }
        return doc;
    }
	
	private static String toString(Document doc) {
	    try {
	        StringWriter sw = new StringWriter();
	        TransformerFactory tf = TransformerFactory.newInstance();
	        Transformer transformer = tf.newTransformer();
	        transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
	        transformer.setOutputProperty(OutputKeys.METHOD, "xml");
	        //transformer.setOutputProperty(OutputKeys.INDENT, "yes");
	        transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");

	        transformer.transform(new DOMSource(doc), new StreamResult(sw));
	        return sw.toString();
	    } catch (Exception ex) {
	        throw new RuntimeException("Error converting to String", ex);
	    }
	}
	
//	public BookOrder getUnMarshalledBookOrderRequest(String xmlMsg)throws Exception{ 
//	       BookOrder bookOrder = null;
//	       IBindingFactory bfact = BindingDirectory.getFactory(BookOrder.class);
//	       IUnmarshallingContext uctx = bfact.createUnmarshallingContext();
//	       Object obj = uctx.unmarshalDocument( new ByteArrayInputStream(xmlMsg.getBytes()), null);
//	       if(obj instanceof BookOrder)bookOrder =(BookOrder)obj;
//	       return bookOrder;
//	   }

}
