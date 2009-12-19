
package org.qualipso.factory.collaboration.client.ws;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "DocumentServiceException", targetNamespace = "http://org.qualipso.factory.ws/service/document-management")
public class DocumentServiceException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private DocumentServiceException faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public DocumentServiceException_Exception(String message, DocumentServiceException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public DocumentServiceException_Exception(String message, DocumentServiceException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: org.qualipso.factory.collaboration.client.ws.DocumentServiceException
     */
    public DocumentServiceException getFaultInfo() {
        return faultInfo;
    }

}
