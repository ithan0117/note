package t1;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.9
 * 2017-03-17T11:40:43.418+08:00
 * Generated source version: 3.1.9
 * 
 */
@WebServiceClient(name = "KernelOnlineServiceImplService", 
                  wsdlLocation = "http://10.67.67.74:8080/TRAMCXFService/CRKernelReportService/genReport?wsdl",
                  targetNamespace = "http://online.webservice.crystalreport.project.transglobe.ebizprise.com/") 
public class KernelOnlineServiceImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://online.webservice.crystalreport.project.transglobe.ebizprise.com/", "KernelOnlineServiceImplService");
    public final static QName KernelOnlineServiceImplPort = new QName("http://online.webservice.crystalreport.project.transglobe.ebizprise.com/", "KernelOnlineServiceImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://10.67.67.74:8080/TRAMCXFService/CRKernelReportService/genReport?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(KernelOnlineServiceImplService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://10.67.67.74:8080/TRAMCXFService/CRKernelReportService/genReport?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public KernelOnlineServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public KernelOnlineServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public KernelOnlineServiceImplService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public KernelOnlineServiceImplService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public KernelOnlineServiceImplService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public KernelOnlineServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns KernelOnlineService
     */
    @WebEndpoint(name = "KernelOnlineServiceImplPort")
    public KernelOnlineService getKernelOnlineServiceImplPort() {
        return super.getPort(KernelOnlineServiceImplPort, KernelOnlineService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns KernelOnlineService
     */
    @WebEndpoint(name = "KernelOnlineServiceImplPort")
    public KernelOnlineService getKernelOnlineServiceImplPort(WebServiceFeature... features) {
        return super.getPort(KernelOnlineServiceImplPort, KernelOnlineService.class, features);
    }

}
