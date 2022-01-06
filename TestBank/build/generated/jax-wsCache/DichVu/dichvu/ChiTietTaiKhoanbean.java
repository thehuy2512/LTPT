
package dichvu;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for chiTietTaiKhoanbean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="chiTietTaiKhoanbean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ghiChu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ngayRutTien" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="soTaiKhoan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="soTienRutRa" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "chiTietTaiKhoanbean", propOrder = {
    "ghiChu",
    "id",
    "ngayRutTien",
    "soTaiKhoan",
    "soTienRutRa"
})
public class ChiTietTaiKhoanbean {

    protected String ghiChu;
    protected String id;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ngayRutTien;
    protected String soTaiKhoan;
    protected long soTienRutRa;

    /**
     * Gets the value of the ghiChu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGhiChu() {
        return ghiChu;
    }

    /**
     * Sets the value of the ghiChu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGhiChu(String value) {
        this.ghiChu = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the ngayRutTien property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNgayRutTien() {
        return ngayRutTien;
    }

    /**
     * Sets the value of the ngayRutTien property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNgayRutTien(XMLGregorianCalendar value) {
        this.ngayRutTien = value;
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
     * Gets the value of the soTienRutRa property.
     * 
     */
    public long getSoTienRutRa() {
        return soTienRutRa;
    }

    /**
     * Sets the value of the soTienRutRa property.
     * 
     */
    public void setSoTienRutRa(long value) {
        this.soTienRutRa = value;
    }

}
