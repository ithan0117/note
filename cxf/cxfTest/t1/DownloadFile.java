
package t1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>downloadFile complex type �� Java ���O.
 * 
 * <p>�U�C���n���q�|���w�����O���]�t���w�����e.
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
     * ���o onlineKernelGenRequest �S�ʪ���.
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
     * �]�w onlineKernelGenRequest �S�ʪ���.
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
