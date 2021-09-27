package soap.test;

import java.rmi.RemoteException;

/**
* @author sachin
* @date 24-Sep-2021
*/

public class Test {

	public static void main(String[] args) throws RemoteException {
		// TODO Auto-generated method stub
		MyClassProxy proxy = new MyClassProxy();
		System.out.println(proxy.getData());
		

	}

}


