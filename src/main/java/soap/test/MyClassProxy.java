package soap.test;

public class MyClassProxy implements soap.test.MyClass {
  private String _endpoint = null;
  private soap.test.MyClass myClass = null;
  
  public MyClassProxy() {
    _initMyClassProxy();
  }
  
  public MyClassProxy(String endpoint) {
    _endpoint = endpoint;
    _initMyClassProxy();
  }
  
  private void _initMyClassProxy() {
    try {
      myClass = (new soap.test.MyClassServiceLocator()).getMyClass();
      if (myClass != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)myClass)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)myClass)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (myClass != null)
      ((javax.xml.rpc.Stub)myClass)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public soap.test.MyClass getMyClass() {
    if (myClass == null)
      _initMyClassProxy();
    return myClass;
  }
  
  public java.lang.String getData() throws java.rmi.RemoteException{
    if (myClass == null)
      _initMyClassProxy();
    return myClass.getData();
  }
  
  
}