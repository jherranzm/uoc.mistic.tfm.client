//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.03.31 a las 07:27:43 AM CEST 
//


package es.facturae.facturae._2014.v3_2_1.facturae;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AttachmentFormatType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="AttachmentFormatType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="xml"/>
 *     &lt;enumeration value="doc"/>
 *     &lt;enumeration value="gif"/>
 *     &lt;enumeration value="rtf"/>
 *     &lt;enumeration value="pdf"/>
 *     &lt;enumeration value="xls"/>
 *     &lt;enumeration value="jpg"/>
 *     &lt;enumeration value="bmp"/>
 *     &lt;enumeration value="tiff"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AttachmentFormatType")
@XmlEnum
public enum AttachmentFormatType {

    @XmlEnumValue("xml")
    XML("xml"),
    @XmlEnumValue("doc")
    DOC("doc"),
    @XmlEnumValue("gif")
    GIF("gif"),
    @XmlEnumValue("rtf")
    RTF("rtf"),
    @XmlEnumValue("pdf")
    PDF("pdf"),
    @XmlEnumValue("xls")
    XLS("xls"),
    @XmlEnumValue("jpg")
    JPG("jpg"),
    @XmlEnumValue("bmp")
    BMP("bmp"),
    @XmlEnumValue("tiff")
    TIFF("tiff");
    private final String value;

    AttachmentFormatType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AttachmentFormatType fromValue(String v) {
        for (AttachmentFormatType c: AttachmentFormatType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
