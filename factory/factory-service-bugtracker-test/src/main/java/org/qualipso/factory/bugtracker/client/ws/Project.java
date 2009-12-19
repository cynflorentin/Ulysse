
package org.qualipso.factory.bugtracker.client.ws;

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
@WebService(name = "project", targetNamespace = "http://org.qualipso.factory.ws/service/project")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Project {


    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @throws ProjectServiceException_Exception
     */
    @WebMethod
    public void createProject(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        String arg2,
        @WebParam(name = "arg3", partName = "arg3")
        String arg3)
        throws ProjectServiceException_Exception
    ;

    /**
     * 
     * @param arg0
     * @throws ProjectServiceException_Exception
     */
    @WebMethod
    public void deleteProject(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0)
        throws ProjectServiceException_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns org.qualipso.factory.bugtracker.client.ws.FactoryResource
     * @throws FactoryException_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    public FactoryResource findResource(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0)
        throws FactoryException_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns org.qualipso.factory.bugtracker.client.ws.Project_Type
     * @throws ProjectServiceException_Exception
     */
    @WebMethod
    @WebResult(name = "project", partName = "project")
    public Project_Type getProject(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0)
        throws ProjectServiceException_Exception
    ;

    /**
     * 
     * @return
     *     returns org.qualipso.factory.bugtracker.client.ws.StringArray
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
     * @param arg4
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @throws ProjectServiceException_Exception
     */
    @WebMethod
    public void updateProject(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        String arg2,
        @WebParam(name = "arg3", partName = "arg3")
        String arg3,
        @WebParam(name = "arg4", partName = "arg4")
        String arg4)
        throws ProjectServiceException_Exception
    ;

    /**
     * 
     * @param arg5
     * @param arg4
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @throws ProjectServiceException_Exception
     */
    @WebMethod
    public void updateTagsProject(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        StringArray arg1,
        @WebParam(name = "arg2", partName = "arg2")
        StringArray arg2,
        @WebParam(name = "arg3", partName = "arg3")
        StringArray arg3,
        @WebParam(name = "arg4", partName = "arg4")
        StringArray arg4,
        @WebParam(name = "arg5", partName = "arg5")
        StringArray arg5)
        throws ProjectServiceException_Exception
    ;

}
