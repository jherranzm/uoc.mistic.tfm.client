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
 * <p>Clase Java para AmountType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AmountType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TotalAmount" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}DoubleUpToEightDecimalType"/>
 *         &lt;element name="EquivalentInEuros" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}DoubleTwoDecimalType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmountType", propOrder = {
    "totalAmount",
    "equivalentInEuros"
})
public class AmountType {

    @XmlElement(name = "TotalAmount")
    protected double totalAmount;
    @XmlElement(name = "EquivalentInEuros")
    protected Double equivalentInEuros;

    /**
     * Obtiene el valor de la propiedad totalAmount.
     * 
     */
    public double getTotalAmount() {
        return totalAmount;
    }

    /**
     * Define el valor de la propiedad totalAmount.
     * 
     */
    public void setTotalAmount(double value) {
        this.totalAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad equivalentInEuros.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEquivalentInEuros() {
        return equivalentInEuros;
    }

    /**
     * Define el valor de la propiedad equivalentInEuros.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEquivalentInEuros(Double value) {
        this.equivalentInEuros = value;
    }

}
