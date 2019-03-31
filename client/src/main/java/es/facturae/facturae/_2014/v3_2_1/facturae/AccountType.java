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
 * <p>Clase Java para AccountType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AccountType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="IBAN" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}TextMin5Max34Type"/>
 *           &lt;element name="AccountNumber" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}TextMin5Max34Type"/>
 *         &lt;/choice>
 *         &lt;element name="BankCode" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}TextMax60Type" minOccurs="0"/>
 *         &lt;element name="BranchCode" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}TextMax60Type" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="BranchInSpainAddress" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}AddressType" minOccurs="0"/>
 *           &lt;element name="OverseasBranchAddress" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}OverseasAddressType" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="BIC" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}BICType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountType", propOrder = {
    "iban",
    "accountNumber",
    "bankCode",
    "branchCode",
    "branchInSpainAddress",
    "overseasBranchAddress",
    "bic"
})
public class AccountType {

    @XmlElement(name = "IBAN")
    protected String iban;
    @XmlElement(name = "AccountNumber")
    protected String accountNumber;
    @XmlElement(name = "BankCode")
    protected String bankCode;
    @XmlElement(name = "BranchCode")
    protected String branchCode;
    @XmlElement(name = "BranchInSpainAddress")
    protected AddressType branchInSpainAddress;
    @XmlElement(name = "OverseasBranchAddress")
    protected OverseasAddressType overseasBranchAddress;
    @XmlElement(name = "BIC")
    protected String bic;

    /**
     * Obtiene el valor de la propiedad iban.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIBAN() {
        return iban;
    }

    /**
     * Define el valor de la propiedad iban.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIBAN(String value) {
        this.iban = value;
    }

    /**
     * Obtiene el valor de la propiedad accountNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Define el valor de la propiedad accountNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad bankCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * Define el valor de la propiedad bankCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankCode(String value) {
        this.bankCode = value;
    }

    /**
     * Obtiene el valor de la propiedad branchCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchCode() {
        return branchCode;
    }

    /**
     * Define el valor de la propiedad branchCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchCode(String value) {
        this.branchCode = value;
    }

    /**
     * Obtiene el valor de la propiedad branchInSpainAddress.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getBranchInSpainAddress() {
        return branchInSpainAddress;
    }

    /**
     * Define el valor de la propiedad branchInSpainAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setBranchInSpainAddress(AddressType value) {
        this.branchInSpainAddress = value;
    }

    /**
     * Obtiene el valor de la propiedad overseasBranchAddress.
     * 
     * @return
     *     possible object is
     *     {@link OverseasAddressType }
     *     
     */
    public OverseasAddressType getOverseasBranchAddress() {
        return overseasBranchAddress;
    }

    /**
     * Define el valor de la propiedad overseasBranchAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link OverseasAddressType }
     *     
     */
    public void setOverseasBranchAddress(OverseasAddressType value) {
        this.overseasBranchAddress = value;
    }

    /**
     * Obtiene el valor de la propiedad bic.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBIC() {
        return bic;
    }

    /**
     * Define el valor de la propiedad bic.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBIC(String value) {
        this.bic = value;
    }

}
