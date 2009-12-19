
package org.qualipso.factory.svn.client.ws;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "browser", targetNamespace = "http://org.qualipso.factory.ws/service/browser", wsdlLocation = "http://localhost:8080/factory-core/browser?wsdl")
public class Browser_Service
    extends Service
{

    private final static URL BROWSER_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(org.qualipso.factory.svn.client.ws.Browser_Service.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = org.qualipso.factory.svn.client.ws.Browser_Service.class.getResource(".");
            url = new URL(baseUrl, "http://localhost:8080/factory-core/browser?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://localhost:8080/factory-core/browser?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        BROWSER_WSDL_LOCATION = url;
    }

    public Browser_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Browser_Service() {
        super(BROWSER_WSDL_LOCATION, new QName("http://org.qualipso.factory.ws/service/browser", "browser"));
    }

    /**
     * 
     * @return
     *     returns Browser
     */
    @WebEndpoint(name = "BrowserServiceBeanPort")
    public Browser getBrowserServiceBeanPort() {
        return super.getPort(new QName("http://org.qualipso.factory.ws/service/browser", "BrowserServiceBeanPort"), Browser.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Browser
     */
    @WebEndpoint(name = "BrowserServiceBeanPort")
    public Browser getBrowserServiceBeanPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://org.qualipso.factory.ws/service/browser", "BrowserServiceBeanPort"), Browser.class, features);
    }

}
