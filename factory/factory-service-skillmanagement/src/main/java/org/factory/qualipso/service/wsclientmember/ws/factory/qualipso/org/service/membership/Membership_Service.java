
package org.factory.qualipso.service.wsclientmember.ws.factory.qualipso.org.service.membership;

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
@WebServiceClient(name = "membership", targetNamespace = "http://org.qualipso.factory.ws/service/membership", wsdlLocation = "http://193.205.163.113:8080/factory-core/membership?wsdl")
public class Membership_Service
    extends Service
{

    private final static URL MEMBERSHIP_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(org.factory.qualipso.service.wsclientmember.ws.factory.qualipso.org.service.membership.Membership_Service.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = org.factory.qualipso.service.wsclientmember.ws.factory.qualipso.org.service.membership.Membership_Service.class.getResource(".");
            url = new URL(baseUrl, "http://193.205.163.113:8080/factory-core/membership?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://193.205.163.113:8080/factory-core/membership?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        MEMBERSHIP_WSDL_LOCATION = url;
    }

    public Membership_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Membership_Service() {
        super(MEMBERSHIP_WSDL_LOCATION, new QName("http://org.qualipso.factory.ws/service/membership", "membership"));
    }

    /**
     * 
     * @return
     *     returns Membership
     */
    @WebEndpoint(name = "MembershipServiceBeanPort")
    public Membership getMembershipServiceBeanPort() {
        return super.getPort(new QName("http://org.qualipso.factory.ws/service/membership", "MembershipServiceBeanPort"), Membership.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Membership
     */
    @WebEndpoint(name = "MembershipServiceBeanPort")
    public Membership getMembershipServiceBeanPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://org.qualipso.factory.ws/service/membership", "MembershipServiceBeanPort"), Membership.class, features);
    }

}