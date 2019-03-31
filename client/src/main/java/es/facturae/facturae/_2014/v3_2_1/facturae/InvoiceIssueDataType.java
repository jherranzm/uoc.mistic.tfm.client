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
 * <p>Clase Java para InvoiceIssueDataType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InvoiceIssueDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IssueDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="OperationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="PlaceOfIssue" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}PlaceOfIssueType" minOccurs="0"/>
 *         &lt;element name="InvoicingPeriod" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}PeriodDates" minOccurs="0"/>
 *         &lt;element name="InvoiceCurrencyCode" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}CurrencyCodeType"/>
 *         &lt;element name="ExchangeRateDetails" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}ExchangeRateDetailsType" minOccurs="0"/>
 *         &lt;element name="TaxCurrencyCode" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}CurrencyCodeType"/>
 *         &lt;element name="LanguageName" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}LanguageCodeType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceIssueDataType", propOrder = {
    "issueDate",
    "operationDate",
    "placeOfIssue",
    "invoicingPeriod",
    "invoiceCurrencyCode",
    "exchangeRateDetails",
    "taxCurrencyCode",
    "languageName"
})
public class InvoiceIssueDataType {

    @XmlElement(name = "IssueDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar issueDate;
    @XmlElement(name = "OperationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar operationDate;
    @XmlElement(name = "PlaceOfIssue")
    protected PlaceOfIssueType placeOfIssue;
    @XmlElement(name = "InvoicingPeriod")
    protected PeriodDates invoicingPeriod;
    @XmlElement(name = "InvoiceCurrencyCode", required = true)
    @XmlSchemaType(name = "string")
    protected CurrencyCodeType invoiceCurrencyCode;
    @XmlElement(name = "ExchangeRateDetails")
    protected ExchangeRateDetailsType exchangeRateDetails;
    @XmlElement(name = "TaxCurrencyCode", required = true)
    @XmlSchemaType(name = "string")
    protected CurrencyCodeType taxCurrencyCode;
    @XmlElement(name = "LanguageName", required = true)
    @XmlSchemaType(name = "string")
    protected LanguageCodeType languageName;

    /**
     * Obtiene el valor de la propiedad issueDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIssueDate() {
        return issueDate;
    }

    /**
     * Define el valor de la propiedad issueDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIssueDate(XMLGregorianCalendar value) {
        this.issueDate = value;
    }

    /**
     * Obtiene el valor de la propiedad operationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOperationDate() {
        return operationDate;
    }

    /**
     * Define el valor de la propiedad operationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOperationDate(XMLGregorianCalendar value) {
        this.operationDate = value;
    }

    /**
     * Obtiene el valor de la propiedad placeOfIssue.
     * 
     * @return
     *     possible object is
     *     {@link PlaceOfIssueType }
     *     
     */
    public PlaceOfIssueType getPlaceOfIssue() {
        return placeOfIssue;
    }

    /**
     * Define el valor de la propiedad placeOfIssue.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceOfIssueType }
     *     
     */
    public void setPlaceOfIssue(PlaceOfIssueType value) {
        this.placeOfIssue = value;
    }

    /**
     * Obtiene el valor de la propiedad invoicingPeriod.
     * 
     * @return
     *     possible object is
     *     {@link PeriodDates }
     *     
     */
    public PeriodDates getInvoicingPeriod() {
        return invoicingPeriod;
    }

    /**
     * Define el valor de la propiedad invoicingPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodDates }
     *     
     */
    public void setInvoicingPeriod(PeriodDates value) {
        this.invoicingPeriod = value;
    }

    /**
     * Obtiene el valor de la propiedad invoiceCurrencyCode.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCodeType }
     *     
     */
    public CurrencyCodeType getInvoiceCurrencyCode() {
        return invoiceCurrencyCode;
    }

    /**
     * Define el valor de la propiedad invoiceCurrencyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCodeType }
     *     
     */
    public void setInvoiceCurrencyCode(CurrencyCodeType value) {
        this.invoiceCurrencyCode = value;
    }

    /**
     * Obtiene el valor de la propiedad exchangeRateDetails.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeRateDetailsType }
     *     
     */
    public ExchangeRateDetailsType getExchangeRateDetails() {
        return exchangeRateDetails;
    }

    /**
     * Define el valor de la propiedad exchangeRateDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeRateDetailsType }
     *     
     */
    public void setExchangeRateDetails(ExchangeRateDetailsType value) {
        this.exchangeRateDetails = value;
    }

    /**
     * Obtiene el valor de la propiedad taxCurrencyCode.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCodeType }
     *     
     */
    public CurrencyCodeType getTaxCurrencyCode() {
        return taxCurrencyCode;
    }

    /**
     * Define el valor de la propiedad taxCurrencyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCodeType }
     *     
     */
    public void setTaxCurrencyCode(CurrencyCodeType value) {
        this.taxCurrencyCode = value;
    }

    /**
     * Obtiene el valor de la propiedad languageName.
     * 
     * @return
     *     possible object is
     *     {@link LanguageCodeType }
     *     
     */
    public LanguageCodeType getLanguageName() {
        return languageName;
    }

    /**
     * Define el valor de la propiedad languageName.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageCodeType }
     *     
     */
    public void setLanguageName(LanguageCodeType value) {
        this.languageName = value;
    }

}
