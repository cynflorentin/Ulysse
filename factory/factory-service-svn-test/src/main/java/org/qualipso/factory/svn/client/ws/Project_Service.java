
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
@WebServiceClient(name = "project", targetNamespace = "http://org.qualipso.factory.ws/service/project", wsdlLocation = "http://localhost:8080/factory-project/project?wsdl")
public class Project_Service
    extends Service
{

    private final static URL PROJECT_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(org.qualipso.factory.svn.client.ws.Project_Service.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = org.qualipso.factory.svn.client.ws.Project_Service.class.getResource(".");
            url = new URL(baseUrl, "http://localhost:8080/factory-project/project?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://localhost:8080/factory-project/project?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        PROJECT_WSDL_LOCATION = url;
    }

    public Project_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Project_Service() {
        super(PROJECT_WSDL_LOCATION, new QName("http://org.qualipso.factory.ws/service/project", "project"));
    }

    /**
     * 
     * @return
     *     returns Project
     */
    @WebEndpoint(name = "ProjectServiceBeanPort")
    public Project getProjectServiceBeanPort() {
        return super.getPort(new QName("http://org.qualipso.factory.ws/service/project", "ProjectServiceBeanPort"), Project.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Project
     */
    @WebEndpoint(name = "ProjectServiceBeanPort")
    public Project getProjectServiceBeanPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://org.qualipso.factory.ws/service/project", "ProjectServiceBeanPort"), Project.class, features);
    }

}