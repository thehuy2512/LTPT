
package dichvu;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the dichvu package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _InsertRutTienResponse_QNAME = new QName("http://DichVu/", "insertRutTienResponse");
    private final static QName _KtdnResponse_QNAME = new QName("http://DichVu/", "ktdnResponse");
    private final static QName _Hello_QNAME = new QName("http://DichVu/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://DichVu/", "helloResponse");
    private final static QName _GetLichSuTaiKhoanResponse_QNAME = new QName("http://DichVu/", "getLichSuTaiKhoanResponse");
    private final static QName _InsertChuyenTien_QNAME = new QName("http://DichVu/", "insertChuyenTien");
    private final static QName _InsertRutTien_QNAME = new QName("http://DichVu/", "insertRutTien");
    private final static QName _GetLichSuTaiKhoan_QNAME = new QName("http://DichVu/", "getLichSuTaiKhoan");
    private final static QName _GetTaiKhoanResponse_QNAME = new QName("http://DichVu/", "getTaiKhoanResponse");
    private final static QName _UpdateSodu_QNAME = new QName("http://DichVu/", "updateSodu");
    private final static QName _GetTaiKhoan_QNAME = new QName("http://DichVu/", "getTaiKhoan");
    private final static QName _InsertChuyenTienResponse_QNAME = new QName("http://DichVu/", "insertChuyenTienResponse");
    private final static QName _Ktdn_QNAME = new QName("http://DichVu/", "ktdn");
    private final static QName _UpdateSoduResponse_QNAME = new QName("http://DichVu/", "updateSoduResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: dichvu
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Ktdn }
     * 
     */
    public Ktdn createKtdn() {
        return new Ktdn();
    }

    /**
     * Create an instance of {@link UpdateSoduResponse }
     * 
     */
    public UpdateSoduResponse createUpdateSoduResponse() {
        return new UpdateSoduResponse();
    }

    /**
     * Create an instance of {@link GetTaiKhoan }
     * 
     */
    public GetTaiKhoan createGetTaiKhoan() {
        return new GetTaiKhoan();
    }

    /**
     * Create an instance of {@link InsertChuyenTienResponse }
     * 
     */
    public InsertChuyenTienResponse createInsertChuyenTienResponse() {
        return new InsertChuyenTienResponse();
    }

    /**
     * Create an instance of {@link GetTaiKhoanResponse }
     * 
     */
    public GetTaiKhoanResponse createGetTaiKhoanResponse() {
        return new GetTaiKhoanResponse();
    }

    /**
     * Create an instance of {@link UpdateSodu }
     * 
     */
    public UpdateSodu createUpdateSodu() {
        return new UpdateSodu();
    }

    /**
     * Create an instance of {@link GetLichSuTaiKhoan }
     * 
     */
    public GetLichSuTaiKhoan createGetLichSuTaiKhoan() {
        return new GetLichSuTaiKhoan();
    }

    /**
     * Create an instance of {@link InsertRutTien }
     * 
     */
    public InsertRutTien createInsertRutTien() {
        return new InsertRutTien();
    }

    /**
     * Create an instance of {@link GetLichSuTaiKhoanResponse }
     * 
     */
    public GetLichSuTaiKhoanResponse createGetLichSuTaiKhoanResponse() {
        return new GetLichSuTaiKhoanResponse();
    }

    /**
     * Create an instance of {@link InsertChuyenTien }
     * 
     */
    public InsertChuyenTien createInsertChuyenTien() {
        return new InsertChuyenTien();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link InsertRutTienResponse }
     * 
     */
    public InsertRutTienResponse createInsertRutTienResponse() {
        return new InsertRutTienResponse();
    }

    /**
     * Create an instance of {@link KtdnResponse }
     * 
     */
    public KtdnResponse createKtdnResponse() {
        return new KtdnResponse();
    }

    /**
     * Create an instance of {@link ChiTietTaiKhoanbean }
     * 
     */
    public ChiTietTaiKhoanbean createChiTietTaiKhoanbean() {
        return new ChiTietTaiKhoanbean();
    }

    /**
     * Create an instance of {@link TaiKhoanbean }
     * 
     */
    public TaiKhoanbean createTaiKhoanbean() {
        return new TaiKhoanbean();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertRutTienResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DichVu/", name = "insertRutTienResponse")
    public JAXBElement<InsertRutTienResponse> createInsertRutTienResponse(InsertRutTienResponse value) {
        return new JAXBElement<InsertRutTienResponse>(_InsertRutTienResponse_QNAME, InsertRutTienResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KtdnResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DichVu/", name = "ktdnResponse")
    public JAXBElement<KtdnResponse> createKtdnResponse(KtdnResponse value) {
        return new JAXBElement<KtdnResponse>(_KtdnResponse_QNAME, KtdnResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DichVu/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DichVu/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLichSuTaiKhoanResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DichVu/", name = "getLichSuTaiKhoanResponse")
    public JAXBElement<GetLichSuTaiKhoanResponse> createGetLichSuTaiKhoanResponse(GetLichSuTaiKhoanResponse value) {
        return new JAXBElement<GetLichSuTaiKhoanResponse>(_GetLichSuTaiKhoanResponse_QNAME, GetLichSuTaiKhoanResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertChuyenTien }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DichVu/", name = "insertChuyenTien")
    public JAXBElement<InsertChuyenTien> createInsertChuyenTien(InsertChuyenTien value) {
        return new JAXBElement<InsertChuyenTien>(_InsertChuyenTien_QNAME, InsertChuyenTien.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertRutTien }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DichVu/", name = "insertRutTien")
    public JAXBElement<InsertRutTien> createInsertRutTien(InsertRutTien value) {
        return new JAXBElement<InsertRutTien>(_InsertRutTien_QNAME, InsertRutTien.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLichSuTaiKhoan }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DichVu/", name = "getLichSuTaiKhoan")
    public JAXBElement<GetLichSuTaiKhoan> createGetLichSuTaiKhoan(GetLichSuTaiKhoan value) {
        return new JAXBElement<GetLichSuTaiKhoan>(_GetLichSuTaiKhoan_QNAME, GetLichSuTaiKhoan.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTaiKhoanResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DichVu/", name = "getTaiKhoanResponse")
    public JAXBElement<GetTaiKhoanResponse> createGetTaiKhoanResponse(GetTaiKhoanResponse value) {
        return new JAXBElement<GetTaiKhoanResponse>(_GetTaiKhoanResponse_QNAME, GetTaiKhoanResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSodu }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DichVu/", name = "updateSodu")
    public JAXBElement<UpdateSodu> createUpdateSodu(UpdateSodu value) {
        return new JAXBElement<UpdateSodu>(_UpdateSodu_QNAME, UpdateSodu.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTaiKhoan }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DichVu/", name = "getTaiKhoan")
    public JAXBElement<GetTaiKhoan> createGetTaiKhoan(GetTaiKhoan value) {
        return new JAXBElement<GetTaiKhoan>(_GetTaiKhoan_QNAME, GetTaiKhoan.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertChuyenTienResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DichVu/", name = "insertChuyenTienResponse")
    public JAXBElement<InsertChuyenTienResponse> createInsertChuyenTienResponse(InsertChuyenTienResponse value) {
        return new JAXBElement<InsertChuyenTienResponse>(_InsertChuyenTienResponse_QNAME, InsertChuyenTienResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Ktdn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DichVu/", name = "ktdn")
    public JAXBElement<Ktdn> createKtdn(Ktdn value) {
        return new JAXBElement<Ktdn>(_Ktdn_QNAME, Ktdn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSoduResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DichVu/", name = "updateSoduResponse")
    public JAXBElement<UpdateSoduResponse> createUpdateSoduResponse(UpdateSoduResponse value) {
        return new JAXBElement<UpdateSoduResponse>(_UpdateSoduResponse_QNAME, UpdateSoduResponse.class, null, value);
    }

}
