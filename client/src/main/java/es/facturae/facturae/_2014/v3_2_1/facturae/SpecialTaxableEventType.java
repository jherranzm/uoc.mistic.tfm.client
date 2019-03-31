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
 * <p>Clase Java para SpecialTaxableEventType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SpecialTaxableEventType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SpecialTaxableEventCode" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}SpecialTaxableEventCodeType"/>
 *         &lt;element name="SpecialTaxableEventReason" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}TextMax2500Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialTaxableEventType", propOrder = {
    "specialTaxableEventCode",
    "specialTaxableEventReason"
})
public class SpecialTaxableEventType {

    @XmlElement(name = "SpecialTaxableEventCode", required = true)
    protected String specialTaxableEventCode;
    @XmlElement(name = "SpecialTaxableEventReason", required = true)
    protected String specialTaxableEventReason;

    /**
     * Obtiene el valor de la propiedad specialTaxableEventCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialTaxableEventCode() {
        return specialTaxableEventCode;
    }

    /**
     * Define el valor de la propiedad specialTaxableEventCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialTaxableEventCode(String value) {
        this.specialTaxableEventCode = value;
    }

    /**
     * Obtiene el valor de la propiedad specialTaxableEventReason.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialTaxableEventReason() {
        return specialTaxableEventReason;
    }

    /**
     * Define el valor de la propiedad specialTaxableEventReason.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialTaxableEventReason(String value) {
        this.specialTaxableEventReason = value;
    }

}
