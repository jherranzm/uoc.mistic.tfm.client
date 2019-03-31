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
 * <p>Clase Java para DeliveryNoteType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DeliveryNoteType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DeliveryNoteNumber" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}TextMax30Type"/>
 *         &lt;element name="DeliveryNoteDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryNoteType", propOrder = {
    "deliveryNoteNumber",
    "deliveryNoteDate"
})
public class DeliveryNoteType {

    @XmlElement(name = "DeliveryNoteNumber", required = true)
    protected String deliveryNoteNumber;
    @XmlElement(name = "DeliveryNoteDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar deliveryNoteDate;

    /**
     * Obtiene el valor de la propiedad deliveryNoteNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryNoteNumber() {
        return deliveryNoteNumber;
    }

    /**
     * Define el valor de la propiedad deliveryNoteNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryNoteNumber(String value) {
        this.deliveryNoteNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad deliveryNoteDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeliveryNoteDate() {
        return deliveryNoteDate;
    }

    /**
     * Define el valor de la propiedad deliveryNoteDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeliveryNoteDate(XMLGregorianCalendar value) {
        this.deliveryNoteDate = value;
    }

}
