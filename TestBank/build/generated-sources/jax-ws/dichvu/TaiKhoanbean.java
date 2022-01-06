
package dichvu;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for taiKhoanbean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="taiKhoanbean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hoten" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="matKhau" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="soTaiKhoan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="soTien" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "taiKhoanbean", propOrder = {
    "hoten",
    "matKhau",
    "soTaiKhoan",
    "soTien"
})
public class TaiKhoanbean {

    protected String hoten;
    protected String matKhau;
    protected String soTaiKhoan;
    protected Long soTien;

    /**
     * Gets the value of the hoten property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoten() {
        return hoten;
    }

    /**
     * Sets the value of the hoten property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoten(String value) {
        this.hoten = value;
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
     * Gets the value of the soTien property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSoTien() {
        return soTien;
    }

    /**
     * Sets the value of the soTien property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSoTien(Long value) {
        this.soTien = value;
    }

}
