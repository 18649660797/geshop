package gabin.design.proxy.remote;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * Class description
 *
 * @author linjiabin on  16/5/14
 */
public class MyRemoteClient {
    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {
        MyRemote remote = (MyRemote) Naming.lookup("rmi://127.0.0.1/remoteHello");
        System.out.println(remote.sayHello());
    }
}
