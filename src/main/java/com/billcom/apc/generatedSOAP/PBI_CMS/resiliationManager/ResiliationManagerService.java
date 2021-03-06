package com.billcom.apc.generatedSOAP.PBI_CMS.resiliationManager;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.11
 * 2021-08-20T10:22:32.979+01:00
 * Generated source version: 3.1.11
 * 
 */
@WebServiceClient(name = "ResiliationManagerService", 
                  wsdlLocation = "http://192.168.1.11:9090/PBI_CMS/services/ResiliationManager?wsdl",
                  targetNamespace = "http://manager.ws.resiliation.billcom.com/") 
public class ResiliationManagerService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://manager.ws.resiliation.billcom.com/", "ResiliationManagerService");
    public final static QName ResiliationManagerPort = new QName("http://manager.ws.resiliation.billcom.com/", "ResiliationManagerPort");
    static {
        URL url = null;
        try {
            url = new URL("http://192.168.1.11:9090/PBI_CMS/services/ResiliationManager?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ResiliationManagerService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://192.168.1.11:9090/PBI_CMS/services/ResiliationManager?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ResiliationManagerService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ResiliationManagerService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ResiliationManagerService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public ResiliationManagerService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public ResiliationManagerService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public ResiliationManagerService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns ResiliationManager
     */
    @WebEndpoint(name = "ResiliationManagerPort")
    public ResiliationManager getResiliationManagerPort() {
        return super.getPort(ResiliationManagerPort, ResiliationManager.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ResiliationManager
     */
    @WebEndpoint(name = "ResiliationManagerPort")
    public ResiliationManager getResiliationManagerPort(WebServiceFeature... features) {
        return super.getPort(ResiliationManagerPort, ResiliationManager.class, features);
    }

}
