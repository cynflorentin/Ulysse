
package org.qualipso.factory.svn.client.ws;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "PathNotFoundException", targetNamespace = "http://org.qualipso.factory.ws/service/browser")
public class PathNotFoundException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private PathNotFoundException faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public PathNotFoundException_Exception(String message, PathNotFoundException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public PathNotFoundException_Exception(String message, PathNotFoundException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: org.qualipso.factory.svn.client.ws.PathNotFoundException
     */
    public PathNotFoundException getFaultInfo() {
        return faultInfo;
    }

}
