
package dichvu;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for insertRutTien complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="insertRutTien">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SoTaiKhoan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SoTienRut" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insertRutTien", propOrder = {
    "soTaiKhoan",
    "soTienRut"
})
public class InsertRutTien {

    @XmlElement(name = "SoTaiKhoan")
    protected String soTaiKhoan;
    @XmlElement(name = "SoTienRut")
    protected long soTienRut;

    /**
     * Gets the value of the soTaiKhoan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoTaiKhoan() {
        return soTaiKhoan;
    }

    /**
     * Sets the value of the soTaiKhoan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoTaiKhoan(String value) {
        this.soTaiKhoan = value;
    }

    /**
     * Gets the value of the soTienRut property.
     * 
     */
    public long getSoTienRut() {
        return soTienRut;
    }

    /**
     * Sets the value of the soTienRut property.
     * 
     */
    public void setSoTienRut(long value) {
        this.soTienRut = value;
    }

}
