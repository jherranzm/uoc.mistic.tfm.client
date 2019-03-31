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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AdditionalDataType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AdditionalDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RelatedInvoice" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}TextMax40Type" minOccurs="0"/>
 *         &lt;element name="RelatedDocuments" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}AttachedDocumentsType" minOccurs="0"/>
 *         &lt;element name="InvoiceAdditionalInformation" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}TextMax2500Type" minOccurs="0"/>
 *         &lt;element name="Extensions" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}ExtensionsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalDataType", propOrder = {
    "relatedInvoice",
    "relatedDocuments",
    "invoiceAdditionalInformation",
    "extensions"
})
public class AdditionalDataType {

    @XmlElement(name = "RelatedInvoice")
    protected String relatedInvoice;
    @XmlElement(name = "RelatedDocuments")
    protected AttachedDocumentsType relatedDocuments;
    @XmlElement(name = "InvoiceAdditionalInformation")
    protected String invoiceAdditionalInformation;
    @XmlElement(name = "Extensions")
    protected ExtensionsType extensions;

    /**
     * Obtiene el valor de la propiedad relatedInvoice.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelatedInvoice() {
        return relatedInvoice;
    }

    /**
     * Define el valor de la propiedad relatedInvoice.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelatedInvoice(String value) {
        this.relatedInvoice = value;
    }

    /**
     * Obtiene el valor de la propiedad relatedDocuments.
     * 
     * @return
     *     possible object is
     *     {@link AttachedDocumentsType }
     *     
     */
    public AttachedDocumentsType getRelatedDocuments() {
        return relatedDocuments;
    }

    /**
     * Define el valor de la propiedad relatedDocuments.
     * 
     * @param value
     *     allowed object is
     *     {@link AttachedDocumentsType }
     *     
     */
    public void setRelatedDocuments(AttachedDocumentsType value) {
        this.relatedDocuments = value;
    }

    /**
     * Obtiene el valor de la propiedad invoiceAdditionalInformation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceAdditionalInformation() {
        return invoiceAdditionalInformation;
    }

    /**
     * Define el valor de la propiedad invoiceAdditionalInformation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceAdditionalInformation(String value) {
        this.invoiceAdditionalInformation = value;
    }

    /**
     * Obtiene el valor de la propiedad extensions.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsType }
     *     
     */
    public ExtensionsType getExtensions() {
        return extensions;
    }

    /**
     * Define el valor de la propiedad extensions.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsType }
     *     
     */
    public void setExtensions(ExtensionsType value) {
        this.extensions = value;
    }

}
