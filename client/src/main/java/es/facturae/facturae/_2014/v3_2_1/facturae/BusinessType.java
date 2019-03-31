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
 * <p>Clase Java para BusinessType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BusinessType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TaxIdentification" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}TaxIdentificationType"/>
 *         &lt;element name="PartyIdentification" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}PartyIdentificationType" minOccurs="0"/>
 *         &lt;element name="AdministrativeCentres" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}AdministrativeCentresType" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="LegalEntity" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}LegalEntityType"/>
 *           &lt;element name="Individual" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}IndividualType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessType", propOrder = {
    "taxIdentification",
    "partyIdentification",
    "administrativeCentres",
    "legalEntity",
    "individual"
})
public class BusinessType {

    @XmlElement(name = "TaxIdentification", required = true)
    protected TaxIdentificationType taxIdentification;
    @XmlElement(name = "PartyIdentification")
    protected String partyIdentification;
    @XmlElement(name = "AdministrativeCentres")
    protected AdministrativeCentresType administrativeCentres;
    @XmlElement(name = "LegalEntity")
    protected LegalEntityType legalEntity;
    @XmlElement(name = "Individual")
    protected IndividualType individual;

    /**
     * Obtiene el valor de la propiedad taxIdentification.
     * 
     * @return
     *     possible object is
     *     {@link TaxIdentificationType }
     *     
     */
    public TaxIdentificationType getTaxIdentification() {
        return taxIdentification;
    }

    /**
     * Define el valor de la propiedad taxIdentification.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxIdentificationType }
     *     
     */
    public void setTaxIdentification(TaxIdentificationType value) {
        this.taxIdentification = value;
    }

    /**
     * Obtiene el valor de la propiedad partyIdentification.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyIdentification() {
        return partyIdentification;
    }

    /**
     * Define el valor de la propiedad partyIdentification.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyIdentification(String value) {
        this.partyIdentification = value;
    }

    /**
     * Obtiene el valor de la propiedad administrativeCentres.
     * 
     * @return
     *     possible object is
     *     {@link AdministrativeCentresType }
     *     
     */
    public AdministrativeCentresType getAdministrativeCentres() {
        return administrativeCentres;
    }

    /**
     * Define el valor de la propiedad administrativeCentres.
     * 
     * @param value
     *     allowed object is
     *     {@link AdministrativeCentresType }
     *     
     */
    public void setAdministrativeCentres(AdministrativeCentresType value) {
        this.administrativeCentres = value;
    }

    /**
     * Obtiene el valor de la propiedad legalEntity.
     * 
     * @return
     *     possible object is
     *     {@link LegalEntityType }
     *     
     */
    public LegalEntityType getLegalEntity() {
        return legalEntity;
    }

    /**
     * Define el valor de la propiedad legalEntity.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalEntityType }
     *     
     */
    public void setLegalEntity(LegalEntityType value) {
        this.legalEntity = value;
    }

    /**
     * Obtiene el valor de la propiedad individual.
     * 
     * @return
     *     possible object is
     *     {@link IndividualType }
     *     
     */
    public IndividualType getIndividual() {
        return individual;
    }

    /**
     * Define el valor de la propiedad individual.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualType }
     *     
     */
    public void setIndividual(IndividualType value) {
        this.individual = value;
    }

}
