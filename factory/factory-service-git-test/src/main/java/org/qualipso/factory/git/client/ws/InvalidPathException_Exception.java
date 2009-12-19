
package org.qualipso.factory.git.client.ws;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "InvalidPathException", targetNamespace = "http://org.qualipso.factory.ws/service/git")
public class InvalidPathException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private InvalidPathException faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public InvalidPathException_Exception(String message, InvalidPathException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public InvalidPathException_Exception(String message, InvalidPathException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: org.qualipso.factory.git.client.ws.InvalidPathException
     */
    public InvalidPathException getFaultInfo() {
        return faultInfo;
    }

}
