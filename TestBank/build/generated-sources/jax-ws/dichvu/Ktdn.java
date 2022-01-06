
package dichvu;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ktdn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ktdn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SoTaiKhoan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MatKhau" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ktdn", propOrder = {
    "soTaiKhoan",
    "matKhau"
})
public class Ktdn {

    @XmlElement(name = "SoTaiKhoan")
    protected String soTaiKhoan;
    @XmlElement(name = "MatKhau")
    protected String matKhau;

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
     * Gets the value of the matKhau property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatKhau() {
        return matKhau;
    }

    /**
     * Sets the value of the matKhau property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatKhau(String value) {
        this.matKhau = value;
    }

}
