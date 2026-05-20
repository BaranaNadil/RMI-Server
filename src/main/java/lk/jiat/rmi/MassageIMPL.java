package lk.jiat.rmi;

import lk.jiat.rmi.client.Massage;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MassageIMPL extends UnicastRemoteObject implements Massage, Remote {

    protected MassageIMPL() throws RemoteException {
    }

    @Override
    public String hello() {
        System.out.println("Server: hello....");
        return null;
    }
}
