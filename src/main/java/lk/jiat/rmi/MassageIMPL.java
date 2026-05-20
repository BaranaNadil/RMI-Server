package lk.jiat.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MassageIMPL extends UnicastRemoteObject implements Massage, Remote {

    protected MassageIMPL() throws RemoteException {
    }

    @Override
    public void hello() {
        System.out.println("Server: hello....");
    }
}
