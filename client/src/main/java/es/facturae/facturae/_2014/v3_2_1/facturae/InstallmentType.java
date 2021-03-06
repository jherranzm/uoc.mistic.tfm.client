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
 * <p>Clase Java para InstallmentType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InstallmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InstallmentDueDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="InstallmentAmount" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}DoubleTwoDecimalType"/>
 *         &lt;element name="PaymentMeans" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}PaymentMeansType"/>
 *         &lt;element name="AccountToBeCredited" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}AccountType" minOccurs="0"/>
 *         &lt;element name="PaymentReconciliationReference" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}TextMax60Type" minOccurs="0"/>
 *         &lt;element name="AccountToBeDebited" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}AccountType" minOccurs="0"/>
 *         &lt;element name="CollectionAdditionalInformation" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}TextMax2500Type" minOccurs="0"/>
 *         &lt;element name="RegulatoryReportingData" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}RegulatoryReportingDataType" minOccurs="0"/>
 *         &lt;element name="DebitReconciliationReference" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}TextMax60Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstallmentType", propOrder = {
    "installmentDueDate",
    "installmentAmount",
    "paymentMeans",
    "accountToBeCredited",
    "paymentReconciliationReference",
    "accountToBeDebited",
    "collectionAdditionalInformation",
    "regulatoryReportingData",
    "debitReconciliationReference"
})
public class InstallmentType {

    @XmlElement(name = "InstallmentDueDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar installmentDueDate;
    @XmlElement(name = "InstallmentAmount")
    protected double installmentAmount;
    @XmlElement(name = "PaymentMeans", required = true)
    protected String paymentMeans;
    @XmlElement(name = "AccountToBeCredited")
    protected AccountType accountToBeCredited;
    @XmlElement(name = "PaymentReconciliationReference")
    protected String paymentReconciliationReference;
    @XmlElement(name = "AccountToBeDebited")
    protected AccountType accountToBeDebited;
    @XmlElement(name = "CollectionAdditionalInformation")
    protected String collectionAdditionalInformation;
    @XmlElement(name = "RegulatoryReportingData")
    protected String regulatoryReportingData;
    @XmlElement(name = "DebitReconciliationReference")
    protected String debitReconciliationReference;

    /**
     * Obtiene el valor de la propiedad installmentDueDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInstallmentDueDate() {
        return installmentDueDate;
    }

    /**
     * Define el valor de la propiedad installmentDueDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInstallmentDueDate(XMLGregorianCalendar value) {
        this.installmentDueDate = value;
    }

    /**
     * Obtiene el valor de la propiedad installmentAmount.
     * 
     */
    public double getInstallmentAmount() {
        return installmentAmount;
    }

    /**
     * Define el valor de la propiedad installmentAmount.
     * 
     */
    public void setInstallmentAmount(double value) {
        this.installmentAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentMeans.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMeans() {
        return paymentMeans;
    }

    /**
     * Define el valor de la propiedad paymentMeans.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMeans(String value) {
        this.paymentMeans = value;
    }

    /**
     * Obtiene el valor de la propiedad accountToBeCredited.
     * 
     * @return
     *     possible object is
     *     {@link AccountType }
     *     
     */
    public AccountType getAccountToBeCredited() {
        return accountToBeCredited;
    }

    /**
     * Define el valor de la propiedad accountToBeCredited.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountType }
     *     
     */
    public void setAccountToBeCredited(AccountType value) {
        this.accountToBeCredited = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentReconciliationReference.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentReconciliationReference() {
        return paymentReconciliationReference;
    }

    /**
     * Define el valor de la propiedad paymentReconciliationReference.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentReconciliationReference(String value) {
        this.paymentReconciliationReference = value;
    }

    /**
     * Obtiene el valor de la propiedad accountToBeDebited.
     * 
     * @return
     *     possible object is
     *     {@link AccountType }
     *     
     */
    public AccountType getAccountToBeDebited() {
        return accountToBeDebited;
    }

    /**
     * Define el valor de la propiedad accountToBeDebited.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountType }
     *     
     */
    public void setAccountToBeDebited(AccountType value) {
        this.accountToBeDebited = value;
    }

    /**
     * Obtiene el valor de la propiedad collectionAdditionalInformation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectionAdditionalInformation() {
        return collectionAdditionalInformation;
    }

    /**
     * Define el valor de la propiedad collectionAdditionalInformation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectionAdditionalInformation(String value) {
        this.collectionAdditionalInformation = value;
    }

    /**
     * Obtiene el valor de la propiedad regulatoryReportingData.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulatoryReportingData() {
        return regulatoryReportingData;
    }

    /**
     * Define el valor de la propiedad regulatoryReportingData.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulatoryReportingData(String value) {
        this.regulatoryReportingData = value;
    }

    /**
     * Obtiene el valor de la propiedad debitReconciliationReference.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebitReconciliationReference() {
        return debitReconciliationReference;
    }

    /**
     * Define el valor de la propiedad debitReconciliationReference.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebitReconciliationReference(String value) {
        this.debitReconciliationReference = value;
    }

}
