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
 * <p>Clase Java para TaxIdentificationType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TaxIdentificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PersonTypeCode" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}PersonTypeCodeType"/>
 *         &lt;element name="ResidenceTypeCode" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}ResidenceTypeCodeType"/>
 *         &lt;element name="TaxIdentificationNumber" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}TextMin3Max30Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxIdentificationType", propOrder = {
    "personTypeCode",
    "residenceTypeCode",
    "taxIdentificationNumber"
})
public class TaxIdentificationType {

    @XmlElement(name = "PersonTypeCode", required = true)
    @XmlSchemaType(name = "string")
    protected PersonTypeCodeType personTypeCode;
    @XmlElement(name = "ResidenceTypeCode", required = true)
    @XmlSchemaType(name = "string")
    protected ResidenceTypeCodeType residenceTypeCode;
    @XmlElement(name = "TaxIdentificationNumber", required = true)
    protected String taxIdentificationNumber;

    /**
     * Obtiene el valor de la propiedad personTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link PersonTypeCodeType }
     *     
     */
    public PersonTypeCodeType getPersonTypeCode() {
        return personTypeCode;
    }

    /**
     * Define el valor de la propiedad personTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonTypeCodeType }
     *     
     */
    public void setPersonTypeCode(PersonTypeCodeType value) {
        this.personTypeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad residenceTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link ResidenceTypeCodeType }
     *     
     */
    public ResidenceTypeCodeType getResidenceTypeCode() {
        return residenceTypeCode;
    }

    /**
     * Define el valor de la propiedad residenceTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ResidenceTypeCodeType }
     *     
     */
    public void setResidenceTypeCode(ResidenceTypeCodeType value) {
        this.residenceTypeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad taxIdentificationNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxIdentificationNumber() {
        return taxIdentificationNumber;
    }

    /**
     * Define el valor de la propiedad taxIdentificationNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxIdentificationNumber(String value) {
        this.taxIdentificationNumber = value;
    }

}
