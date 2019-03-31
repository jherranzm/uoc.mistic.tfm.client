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
 * <p>Clase Java para CorrectiveType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CorrectiveType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InvoiceNumber" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}TextMax20Type" minOccurs="0"/>
 *         &lt;element name="InvoiceSeriesCode" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}TextMax20Type" minOccurs="0"/>
 *         &lt;element name="ReasonCode" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}ReasonCodeType"/>
 *         &lt;element name="ReasonDescription" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}ReasonDescriptionType"/>
 *         &lt;element name="TaxPeriod" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}PeriodDates"/>
 *         &lt;element name="CorrectionMethod" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}CorrectionMethodType"/>
 *         &lt;element name="CorrectionMethodDescription" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}CorrectionMethodDescriptionType"/>
 *         &lt;element name="AdditionalReasonDescription" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}TextMax2500Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorrectiveType", propOrder = {
    "invoiceNumber",
    "invoiceSeriesCode",
    "reasonCode",
    "reasonDescription",
    "taxPeriod",
    "correctionMethod",
    "correctionMethodDescription",
    "additionalReasonDescription"
})
public class CorrectiveType {

    @XmlElement(name = "InvoiceNumber")
    protected String invoiceNumber;
    @XmlElement(name = "InvoiceSeriesCode")
    protected String invoiceSeriesCode;
    @XmlElement(name = "ReasonCode", required = true)
    protected String reasonCode;
    @XmlElement(name = "ReasonDescription", required = true)
    @XmlSchemaType(name = "string")
    protected ReasonDescriptionType reasonDescription;
    @XmlElement(name = "TaxPeriod", required = true)
    protected PeriodDates taxPeriod;
    @XmlElement(name = "CorrectionMethod", required = true)
    protected String correctionMethod;
    @XmlElement(name = "CorrectionMethodDescription", required = true)
    @XmlSchemaType(name = "string")
    protected CorrectionMethodDescriptionType correctionMethodDescription;
    @XmlElement(name = "AdditionalReasonDescription")
    protected String additionalReasonDescription;

    /**
     * Obtiene el valor de la propiedad invoiceNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * Define el valor de la propiedad invoiceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceNumber(String value) {
        this.invoiceNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad invoiceSeriesCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceSeriesCode() {
        return invoiceSeriesCode;
    }

    /**
     * Define el valor de la propiedad invoiceSeriesCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceSeriesCode(String value) {
        this.invoiceSeriesCode = value;
    }

    /**
     * Obtiene el valor de la propiedad reasonCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonCode() {
        return reasonCode;
    }

    /**
     * Define el valor de la propiedad reasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonCode(String value) {
        this.reasonCode = value;
    }

    /**
     * Obtiene el valor de la propiedad reasonDescription.
     * 
     * @return
     *     possible object is
     *     {@link ReasonDescriptionType }
     *     
     */
    public ReasonDescriptionType getReasonDescription() {
        return reasonDescription;
    }

    /**
     * Define el valor de la propiedad reasonDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link ReasonDescriptionType }
     *     
     */
    public void setReasonDescription(ReasonDescriptionType value) {
        this.reasonDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad taxPeriod.
     * 
     * @return
     *     possible object is
     *     {@link PeriodDates }
     *     
     */
    public PeriodDates getTaxPeriod() {
        return taxPeriod;
    }

    /**
     * Define el valor de la propiedad taxPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodDates }
     *     
     */
    public void setTaxPeriod(PeriodDates value) {
        this.taxPeriod = value;
    }

    /**
     * Obtiene el valor de la propiedad correctionMethod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrectionMethod() {
        return correctionMethod;
    }

    /**
     * Define el valor de la propiedad correctionMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrectionMethod(String value) {
        this.correctionMethod = value;
    }

    /**
     * Obtiene el valor de la propiedad correctionMethodDescription.
     * 
     * @return
     *     possible object is
     *     {@link CorrectionMethodDescriptionType }
     *     
     */
    public CorrectionMethodDescriptionType getCorrectionMethodDescription() {
        return correctionMethodDescription;
    }

    /**
     * Define el valor de la propiedad correctionMethodDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrectionMethodDescriptionType }
     *     
     */
    public void setCorrectionMethodDescription(CorrectionMethodDescriptionType value) {
        this.correctionMethodDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad additionalReasonDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalReasonDescription() {
        return additionalReasonDescription;
    }

    /**
     * Define el valor de la propiedad additionalReasonDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalReasonDescription(String value) {
        this.additionalReasonDescription = value;
    }

}
