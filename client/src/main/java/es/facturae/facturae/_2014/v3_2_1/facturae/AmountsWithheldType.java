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
 * <p>Clase Java para AmountsWithheldType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AmountsWithheldType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WithholdingReason" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}TextMax2500Type"/>
 *         &lt;element name="WithholdingRate" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}DoubleUpToEightDecimalType" minOccurs="0"/>
 *         &lt;element name="WithholdingAmount" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}DoubleUpToEightDecimalType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmountsWithheldType", propOrder = {
    "withholdingReason",
    "withholdingRate",
    "withholdingAmount"
})
public class AmountsWithheldType {

    @XmlElement(name = "WithholdingReason", required = true)
    protected String withholdingReason;
    @XmlElement(name = "WithholdingRate")
    protected Double withholdingRate;
    @XmlElement(name = "WithholdingAmount")
    protected double withholdingAmount;

    /**
     * Obtiene el valor de la propiedad withholdingReason.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWithholdingReason() {
        return withholdingReason;
    }

    /**
     * Define el valor de la propiedad withholdingReason.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWithholdingReason(String value) {
        this.withholdingReason = value;
    }

    /**
     * Obtiene el valor de la propiedad withholdingRate.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWithholdingRate() {
        return withholdingRate;
    }

    /**
     * Define el valor de la propiedad withholdingRate.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWithholdingRate(Double value) {
        this.withholdingRate = value;
    }

    /**
     * Obtiene el valor de la propiedad withholdingAmount.
     * 
     */
    public double getWithholdingAmount() {
        return withholdingAmount;
    }

    /**
     * Define el valor de la propiedad withholdingAmount.
     * 
     */
    public void setWithholdingAmount(double value) {
        this.withholdingAmount = value;
    }

}
