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
 * <p>Clase Java para OverseasAddressType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OverseasAddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Address" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}TextMax80Type"/>
 *         &lt;element name="PostCodeAndTown" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}TextMax50Type"/>
 *         &lt;element name="Province" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}TextMax20Type"/>
 *         &lt;element name="CountryCode" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}CountryType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OverseasAddressType", propOrder = {
    "address",
    "postCodeAndTown",
    "province",
    "countryCode"
})
public class OverseasAddressType {

    @XmlElement(name = "Address", required = true)
    protected String address;
    @XmlElement(name = "PostCodeAndTown", required = true)
    protected String postCodeAndTown;
    @XmlElement(name = "Province", required = true)
    protected String province;
    @XmlElement(name = "CountryCode", required = true)
    @XmlSchemaType(name = "string")
    protected CountryType countryCode;

    /**
     * Obtiene el valor de la propiedad address.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Define el valor de la propiedad address.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Obtiene el valor de la propiedad postCodeAndTown.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostCodeAndTown() {
        return postCodeAndTown;
    }

    /**
     * Define el valor de la propiedad postCodeAndTown.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostCodeAndTown(String value) {
        this.postCodeAndTown = value;
    }

    /**
     * Obtiene el valor de la propiedad province.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvince() {
        return province;
    }

    /**
     * Define el valor de la propiedad province.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvince(String value) {
        this.province = value;
    }

    /**
     * Obtiene el valor de la propiedad countryCode.
     * 
     * @return
     *     possible object is
     *     {@link CountryType }
     *     
     */
    public CountryType getCountryCode() {
        return countryCode;
    }

    /**
     * Define el valor de la propiedad countryCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryType }
     *     
     */
    public void setCountryCode(CountryType value) {
        this.countryCode = value;
    }

}
