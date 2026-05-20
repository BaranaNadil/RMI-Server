package lk.jiat.rmi.client;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Massage extends Remote {
    public String hello() throws RemoteException;
}
