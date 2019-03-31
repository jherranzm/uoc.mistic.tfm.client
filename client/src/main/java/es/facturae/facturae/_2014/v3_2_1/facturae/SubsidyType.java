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
 * <p>Clase Java para SubsidyType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SubsidyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubsidyDescription" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}TextMax2500Type"/>
 *         &lt;element name="SubsidyRate" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}DoubleUpToEightDecimalType" minOccurs="0"/>
 *         &lt;element name="SubsidyAmount" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}DoubleUpToEightDecimalType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubsidyType", propOrder = {
    "subsidyDescription",
    "subsidyRate",
    "subsidyAmount"
})
public class SubsidyType {

    @XmlElement(name = "SubsidyDescription", required = true)
    protected String subsidyDescription;
    @XmlElement(name = "SubsidyRate")
    protected Double subsidyRate;
    @XmlElement(name = "SubsidyAmount")
    protected double subsidyAmount;

    /**
     * Obtiene el valor de la propiedad subsidyDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubsidyDescription() {
        return subsidyDescription;
    }

    /**
     * Define el valor de la propiedad subsidyDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubsidyDescription(String value) {
        this.subsidyDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad subsidyRate.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSubsidyRate() {
        return subsidyRate;
    }

    /**
     * Define el valor de la propiedad subsidyRate.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSubsidyRate(Double value) {
        this.subsidyRate = value;
    }

    /**
     * Obtiene el valor de la propiedad subsidyAmount.
     * 
     */
    public double getSubsidyAmount() {
        return subsidyAmount;
    }

    /**
     * Define el valor de la propiedad subsidyAmount.
     * 
     */
    public void setSubsidyAmount(double value) {
        this.subsidyAmount = value;
    }

}
