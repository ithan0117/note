
package t1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>downloadFileResponse complex type �� Java ���O.
 * 
 * <p>�U�C���n���q�|���w�����O���]�t���w�����e.
 * 
 * <pre>
 * &lt;complexType name="downloadFileResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return" type="{http://online.webservice.crystalreport.project.transglobe.ebizprise.com/}onlineReportGenResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "downloadFileResponse", propOrder = {
    "_return"
})
public class DownloadFileResponse {

    @XmlElement(name = "return")
    protected OnlineReportGenResponse _return;

    /**
     * ���o return �S�ʪ���.
     * 
     * @return
     *     possible object is
     *     {@link OnlineReportGenResponse }
     *     
     */
    public OnlineReportGenResponse getReturn() {
        return _return;
    }

    /**
     * �]�w return �S�ʪ���.
     * 
     * @param value
     *     allowed object is
     *     {@link OnlineReportGenResponse }
     *     
     */
    public void setReturn(OnlineReportGenResponse value) {
        this._return = value;
    }

}
