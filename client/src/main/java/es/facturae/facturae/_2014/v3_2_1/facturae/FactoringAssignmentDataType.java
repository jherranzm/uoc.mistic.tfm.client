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
 * <p>Clase Java para FactoringAssignmentDataType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FactoringAssignmentDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Assignee" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}AssigneeType"/>
 *         &lt;element name="PaymentDetails" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}InstallmentsType"/>
 *         &lt;element name="FactoringAssignmentClauses" type="{http://www.facturae.es/Facturae/2014/v3.2.1/Facturae}TextMax2500Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FactoringAssignmentDataType", propOrder = {
    "assignee",
    "paymentDetails",
    "factoringAssignmentClauses"
})
public class FactoringAssignmentDataType {

    @XmlElement(name = "Assignee", required = true)
    protected AssigneeType assignee;
    @XmlElement(name = "PaymentDetails", required = true)
    protected InstallmentsType paymentDetails;
    @XmlElement(name = "FactoringAssignmentClauses", required = true)
    protected String factoringAssignmentClauses;

    /**
     * Obtiene el valor de la propiedad assignee.
     * 
     * @return
     *     possible object is
     *     {@link AssigneeType }
     *     
     */
    public AssigneeType getAssignee() {
        return assignee;
    }

    /**
     * Define el valor de la propiedad assignee.
     * 
     * @param value
     *     allowed object is
     *     {@link AssigneeType }
     *     
     */
    public void setAssignee(AssigneeType value) {
        this.assignee = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentDetails.
     * 
     * @return
     *     possible object is
     *     {@link InstallmentsType }
     *     
     */
    public InstallmentsType getPaymentDetails() {
        return paymentDetails;
    }

    /**
     * Define el valor de la propiedad paymentDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link InstallmentsType }
     *     
     */
    public void setPaymentDetails(InstallmentsType value) {
        this.paymentDetails = value;
    }

    /**
     * Obtiene el valor de la propiedad factoringAssignmentClauses.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFactoringAssignmentClauses() {
        return factoringAssignmentClauses;
    }

    /**
     * Define el valor de la propiedad factoringAssignmentClauses.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFactoringAssignmentClauses(String value) {
        this.factoringAssignmentClauses = value;
    }

}
