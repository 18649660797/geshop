package gabin.design.proxy.remote;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Class description
 *
 * @author linjiabin on  16/5/14
 */
public interface MyRemote extends Remote {
    String sayHello() throws RemoteException;
}
