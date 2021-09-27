/**
 * MyClassServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap.test;

public class MyClassServiceLocator extends org.apache.axis.client.Service implements soap.test.MyClassService {

    public MyClassServiceLocator() {
    }


    public MyClassServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public MyClassServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for MyClass
    private java.lang.String MyClass_address = "http://localhost:8080/MySaopService/services/MyClass";

    public java.lang.String getMyClassAddress() {
        return MyClass_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String MyClassWSDDServiceName = "MyClass";

    public java.lang.String getMyClassWSDDServiceName() {
        return MyClassWSDDServiceName;
    }

    public void setMyClassWSDDServiceName(java.lang.String name) {
        MyClassWSDDServiceName = name;
    }

    public soap.test.MyClass getMyClass() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(MyClass_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getMyClass(endpoint);
    }

    public soap.test.MyClass getMyClass(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            soap.test.MyClassSoapBindingStub _stub = new soap.test.MyClassSoapBindingStub(portAddress, this);
            _stub.setPortName(getMyClassWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setMyClassEndpointAddress(java.lang.String address) {
        MyClass_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (soap.test.MyClass.class.isAssignableFrom(serviceEndpointInterface)) {
                soap.test.MyClassSoapBindingStub _stub = new soap.test.MyClassSoapBindingStub(new java.net.URL(MyClass_address), this);
                _stub.setPortName(getMyClassWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("MyClass".equals(inputPortName)) {
            return getMyClass();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://test.soap", "MyClassService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://test.soap", "MyClass"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("MyClass".equals(portName)) {
            setMyClassEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
