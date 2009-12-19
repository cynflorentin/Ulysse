
package org.qualipso.factory.git.client.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.1
 * 
 */
@WebService(name = "git", targetNamespace = "http://org.qualipso.factory.ws/service/git")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Git {


    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @throws PathAlreadyBoundException_Exception
     * @throws InvalidPathException_Exception
     * @throws AccessDeniedException_Exception
     * @throws GITServiceException_Exception
     */
    @WebMethod
    public void createGITRepository(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        String arg2)
        throws AccessDeniedException_Exception, GITServiceException_Exception, InvalidPathException_Exception, PathAlreadyBoundException_Exception
    ;

    /**
     * 
     * @param arg0
     * @throws PathNotEmptyException_Exception
     * @throws InvalidPathException_Exception
     * @throws PathNotFoundException_Exception
     * @throws AccessDeniedException_Exception
     * @throws GITServiceException_Exception
     */
    @WebMethod
    public void deleteGITRepository(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0)
        throws AccessDeniedException_Exception, GITServiceException_Exception, InvalidPathException_Exception, PathNotEmptyException_Exception, PathNotFoundException_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns org.qualipso.factory.git.client.ws.FactoryResource
     * @throws InvalidPathException_Exception
     * @throws PathNotFoundException_Exception
     * @throws AccessDeniedException_Exception
     * @throws FactoryException_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    public FactoryResource findResource(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0)
        throws AccessDeniedException_Exception, FactoryException_Exception, InvalidPathException_Exception, PathNotFoundException_Exception
    ;

    /**
     * 
     * @return
     *     returns org.qualipso.factory.git.client.ws.StringArray
     */
    @WebMethod
    @WebResult(partName = "return")
    public StringArray getResourceTypeList();

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    public String getServiceName();

    /**
     * 
     * @param arg0
     * @return
     *     returns org.qualipso.factory.git.client.ws.GitRepository
     * @throws InvalidPathException_Exception
     * @throws PathNotFoundException_Exception
     * @throws GITServiceException_Exception
     * @throws AccessDeniedException_Exception
     */
    @WebMethod
    @WebResult(name = "git-repository", partName = "git-repository")
    public GitRepository readGITRepository(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0)
        throws AccessDeniedException_Exception, GITServiceException_Exception, InvalidPathException_Exception, PathNotFoundException_Exception
    ;

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @throws InvalidPathException_Exception
     * @throws PathNotFoundException_Exception
     * @throws AccessDeniedException_Exception
     * @throws GITServiceException_Exception
     */
    @WebMethod
    public void updateGITRepository(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        String arg2)
        throws AccessDeniedException_Exception, GITServiceException_Exception, InvalidPathException_Exception, PathNotFoundException_Exception
    ;

}