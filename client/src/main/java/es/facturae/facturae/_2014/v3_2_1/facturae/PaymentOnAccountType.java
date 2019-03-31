//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.03.31 a las 07:27:43 AM CEST 
//


package es.facturae.facturae._2014.v3_2_1.facturae;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para PaymentOnAccountType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PaymentOnAccountType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaymentOnAccountDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="PaymentOnAccountAmount" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}DoubleUpToEightDecimalType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentOnAccountType", propOrder = {
    "paymentOnAccountDate",
    "paymentOnAccountAmount"
})
public class PaymentOnAccountType {

    @XmlElement(name = "PaymentOnAccountDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar paymentOnAccountDate;
    @XmlElement(name = "PaymentOnAccountAmount")
    protected double paymentOnAccountAmount;

    /**
     * Obtiene el valor de la propiedad paymentOnAccountDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPaymentOnAccountDate() {
        return paymentOnAccountDate;
    }

    /**
     * Define el valor de la propiedad paymentOnAccountDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPaymentOnAccountDate(XMLGregorianCalendar value) {
        this.paymentOnAccountDate = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentOnAccountAmount.
     * 
     */
    public double getPaymentOnAccountAmount() {
        return paymentOnAccountAmount;
    }

    /**
     * Define el valor de la propiedad paymentOnAccountAmount.
     * 
     */
    public void setPaymentOnAccountAmount(double value) {
        this.paymentOnAccountAmount = value;
    }

}
