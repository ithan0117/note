
package t1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the t1 package. 
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

    private final static QName _DownloadFile_QNAME = new QName("http://online.webservice.crystalreport.project.transglobe.ebizprise.com/", "downloadFile");
    private final static QName _DownloadFileResponse_QNAME = new QName("http://online.webservice.crystalreport.project.transglobe.ebizprise.com/", "downloadFileResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: t1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DownloadFile }
     * 
     */
    public DownloadFile createDownloadFile() {
        return new DownloadFile();
    }

    /**
     * Create an instance of {@link DownloadFileResponse }
     * 
     */
    public DownloadFileResponse createDownloadFileResponse() {
        return new DownloadFileResponse();
    }

    /**
     * Create an instance of {@link OnlineKernelGenRequest }
     * 
     */
    public OnlineKernelGenRequest createOnlineKernelGenRequest() {
        return new OnlineKernelGenRequest();
    }

    /**
     * Create an instance of {@link Header }
     * 
     */
    public Header createHeader() {
        return new Header();
    }

    /**
     * Create an instance of {@link KernelParameter }
     * 
     */
    public KernelParameter createKernelParameter() {
        return new KernelParameter();
    }

    /**
     * Create an instance of {@link OnlineReportGenResponse }
     * 
     */
    public OnlineReportGenResponse createOnlineReportGenResponse() {
        return new OnlineReportGenResponse();
    }

    /**
     * Create an instance of {@link ResponseVo }
     * 
     */
    public ResponseVo createResponseVo() {
        return new ResponseVo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadFile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://online.webservice.crystalreport.project.transglobe.ebizprise.com/", name = "downloadFile")
    public JAXBElement<DownloadFile> createDownloadFile(DownloadFile value) {
        return new JAXBElement<DownloadFile>(_DownloadFile_QNAME, DownloadFile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadFileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://online.webservice.crystalreport.project.transglobe.ebizprise.com/", name = "downloadFileResponse")
    public JAXBElement<DownloadFileResponse> createDownloadFileResponse(DownloadFileResponse value) {
        return new JAXBElement<DownloadFileResponse>(_DownloadFileResponse_QNAME, DownloadFileResponse.class, null, value);
    }

}
