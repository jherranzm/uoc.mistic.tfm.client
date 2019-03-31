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


/**
 * <p>Clase Java para AttachmentType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AttachmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AttachmentCompressionAlgorithm" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}AttachmentCompressionAlgorithmType" minOccurs="0"/>
 *         &lt;element name="AttachmentFormat" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}AttachmentFormatType"/>
 *         &lt;element name="AttachmentEncoding" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}AttachmentEncodingType" minOccurs="0"/>
 *         &lt;element name="AttachmentDescription" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}TextMax2500Type" minOccurs="0"/>
 *         &lt;element name="AttachmentData" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttachmentType", propOrder = {
    "attachmentCompressionAlgorithm",
    "attachmentFormat",
    "attachmentEncoding",
    "attachmentDescription",
    "attachmentData"
})
public class AttachmentType {

    @XmlElement(name = "AttachmentCompressionAlgorithm")
    @XmlSchemaType(name = "string")
    protected AttachmentCompressionAlgorithmType attachmentCompressionAlgorithm;
    @XmlElement(name = "AttachmentFormat", required = true)
    @XmlSchemaType(name = "string")
    protected AttachmentFormatType attachmentFormat;
    @XmlElement(name = "AttachmentEncoding")
    @XmlSchemaType(name = "string")
    protected AttachmentEncodingType attachmentEncoding;
    @XmlElement(name = "AttachmentDescription")
    protected String attachmentDescription;
    @XmlElement(name = "AttachmentData", required = true)
    protected String attachmentData;

    /**
     * Obtiene el valor de la propiedad attachmentCompressionAlgorithm.
     * 
     * @return
     *     possible object is
     *     {@link AttachmentCompressionAlgorithmType }
     *     
     */
    public AttachmentCompressionAlgorithmType getAttachmentCompressionAlgorithm() {
        return attachmentCompressionAlgorithm;
    }

    /**
     * Define el valor de la propiedad attachmentCompressionAlgorithm.
     * 
     * @param value
     *     allowed object is
     *     {@link AttachmentCompressionAlgorithmType }
     *     
     */
    public void setAttachmentCompressionAlgorithm(AttachmentCompressionAlgorithmType value) {
        this.attachmentCompressionAlgorithm = value;
    }

    /**
     * Obtiene el valor de la propiedad attachmentFormat.
     * 
     * @return
     *     possible object is
     *     {@link AttachmentFormatType }
     *     
     */
    public AttachmentFormatType getAttachmentFormat() {
        return attachmentFormat;
    }

    /**
     * Define el valor de la propiedad attachmentFormat.
     * 
     * @param value
     *     allowed object is
     *     {@link AttachmentFormatType }
     *     
     */
    public void setAttachmentFormat(AttachmentFormatType value) {
        this.attachmentFormat = value;
    }

    /**
     * Obtiene el valor de la propiedad attachmentEncoding.
     * 
     * @return
     *     possible object is
     *     {@link AttachmentEncodingType }
     *     
     */
    public AttachmentEncodingType getAttachmentEncoding() {
        return attachmentEncoding;
    }

    /**
     * Define el valor de la propiedad attachmentEncoding.
     * 
     * @param value
     *     allowed object is
     *     {@link AttachmentEncodingType }
     *     
     */
    public void setAttachmentEncoding(AttachmentEncodingType value) {
        this.attachmentEncoding = value;
    }

    /**
     * Obtiene el valor de la propiedad attachmentDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachmentDescription() {
        return attachmentDescription;
    }

    /**
     * Define el valor de la propiedad attachmentDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachmentDescription(String value) {
        this.attachmentDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad attachmentData.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachmentData() {
        return attachmentData;
    }

    /**
     * Define el valor de la propiedad attachmentData.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachmentData(String value) {
        this.attachmentData = value;
    }

}
