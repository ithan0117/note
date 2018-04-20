
package t1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>downloadFile complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="downloadFile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OnlineKernelGenRequest" type="{http://online.webservice.crystalreport.project.transglobe.ebizprise.com/}onlineKernelGenRequest" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "downloadFile", propOrder = {
    "onlineKernelGenRequest"
})
public class DownloadFile {

    @XmlElement(name = "OnlineKernelGenRequest")
    protected OnlineKernelGenRequest onlineKernelGenRequest;

    /**
     * 取得 onlineKernelGenRequest 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link OnlineKernelGenRequest }
     *     
     */
    public OnlineKernelGenRequest getOnlineKernelGenRequest() {
        return onlineKernelGenRequest;
    }

    /**
     * 設定 onlineKernelGenRequest 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link OnlineKernelGenRequest }
     *     
     */
    public void setOnlineKernelGenRequest(OnlineKernelGenRequest value) {
        this.onlineKernelGenRequest = value;
    }

}
