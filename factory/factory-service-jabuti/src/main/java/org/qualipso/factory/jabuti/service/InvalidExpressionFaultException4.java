
/**
 * InvalidExpressionFaultException4.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4.1  Built on : Aug 13, 2008 (05:03:35 LKT)
 */

package org.qualipso.factory.jabuti.service;

public class InvalidExpressionFaultException4 extends java.lang.Exception{
    
    private org.qualipso.factory.jabuti.service.JaBUTiService1_0Stub.InvalidExpressionFaultE faultMessage;
    
    public InvalidExpressionFaultException4() {
        super("InvalidExpressionFaultException4");
    }
           
    public InvalidExpressionFaultException4(java.lang.String s) {
       super(s);
    }
    
    public InvalidExpressionFaultException4(java.lang.String s, java.lang.Throwable ex) {
      super(s, ex);
    }
    
    public void setFaultMessage(org.qualipso.factory.jabuti.service.JaBUTiService1_0Stub.InvalidExpressionFaultE msg){
       faultMessage = msg;
    }
    
    public org.qualipso.factory.jabuti.service.JaBUTiService1_0Stub.InvalidExpressionFaultE getFaultMessage(){
       return faultMessage;
    }
}
    