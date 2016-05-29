package gabin.design.proxy.remote;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Class description
 *
 * @author linjiabin on  16/5/14
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
    public MyRemoteImpl() throws RemoteException {
    }

    public String sayHello() throws RemoteException {
        return "hello";
    }

    public static void main(String[] args) {
        try {
            MyRemote myRemote = new MyRemoteImpl();
            Naming.bind("remoteHello", myRemote);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
