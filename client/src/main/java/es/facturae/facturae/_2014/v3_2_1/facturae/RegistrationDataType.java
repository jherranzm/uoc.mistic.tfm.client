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
 * <p>Clase Java para RegistrationDataType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RegistrationDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Book" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}TextMax20Type" minOccurs="0"/>
 *         &lt;element name="RegisterOfCompaniesLocation" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}TextMax20Type" minOccurs="0"/>
 *         &lt;element name="Sheet" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}TextMax20Type" minOccurs="0"/>
 *         &lt;element name="Folio" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}TextMax20Type" minOccurs="0"/>
 *         &lt;element name="Section" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}TextMax20Type" minOccurs="0"/>
 *         &lt;element name="Volume" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}TextMax20Type" minOccurs="0"/>
 *         &lt;element name="AdditionalRegistrationData" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}TextMax20Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistrationDataType", propOrder = {
    "book",
    "registerOfCompaniesLocation",
    "sheet",
    "folio",
    "section",
    "volume",
    "additionalRegistrationData"
})
public class RegistrationDataType {

    @XmlElement(name = "Book")
    protected String book;
    @XmlElement(name = "RegisterOfCompaniesLocation")
    protected String registerOfCompaniesLocation;
    @XmlElement(name = "Sheet")
    protected String sheet;
    @XmlElement(name = "Folio")
    protected String folio;
    @XmlElement(name = "Section")
    protected String section;
    @XmlElement(name = "Volume")
    protected String volume;
    @XmlElement(name = "AdditionalRegistrationData")
    protected String additionalRegistrationData;

    /**
     * Obtiene el valor de la propiedad book.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBook() {
        return book;
    }

    /**
     * Define el valor de la propiedad book.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBook(String value) {
        this.book = value;
    }

    /**
     * Obtiene el valor de la propiedad registerOfCompaniesLocation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisterOfCompaniesLocation() {
        return registerOfCompaniesLocation;
    }

    /**
     * Define el valor de la propiedad registerOfCompaniesLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisterOfCompaniesLocation(String value) {
        this.registerOfCompaniesLocation = value;
    }

    /**
     * Obtiene el valor de la propiedad sheet.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSheet() {
        return sheet;
    }

    /**
     * Define el valor de la propiedad sheet.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSheet(String value) {
        this.sheet = value;
    }

    /**
     * Obtiene el valor de la propiedad folio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolio() {
        return folio;
    }

    /**
     * Define el valor de la propiedad folio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolio(String value) {
        this.folio = value;
    }

    /**
     * Obtiene el valor de la propiedad section.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSection() {
        return section;
    }

    /**
     * Define el valor de la propiedad section.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSection(String value) {
        this.section = value;
    }

    /**
     * Obtiene el valor de la propiedad volume.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolume() {
        return volume;
    }

    /**
     * Define el valor de la propiedad volume.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolume(String value) {
        this.volume = value;
    }

    /**
     * Obtiene el valor de la propiedad additionalRegistrationData.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalRegistrationData() {
        return additionalRegistrationData;
    }

    /**
     * Define el valor de la propiedad additionalRegistrationData.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalRegistrationData(String value) {
        this.additionalRegistrationData = value;
    }

}
